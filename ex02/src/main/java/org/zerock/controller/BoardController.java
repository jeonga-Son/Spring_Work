package org.zerock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;
import org.zerock.domain.PageDTO;
import org.zerock.service.BoardService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/board/*") // board가 들어가는 모든 요청
@AllArgsConstructor // 자동으로 BoardService에 대한 객체가 자동으로 주입이 되어진다.
public class BoardController {
//	@Autowired
	private BoardService service;
	
	@GetMapping("/register") // board 폴더 안에 register.jsp를 찾는다.
	public void register() {
	}
	
//	@GetMapping("/list")
//	public void list(Model model) {
//		log.info("list.................");
//		model.addAttribute("list", service.getList());
//	}
	
	// 페이징 처리 구현
	@GetMapping("/list")
	public void list(Criteria cri, Model model) {
		log.info("list.................");
		model.addAttribute("list", service.getList(cri));
		model.addAttribute("pageMaker", new PageDTO(cri, 150));
	}
	
	@PostMapping("/register")
	public String register(BoardVO board, RedirectAttributes rttr) {
		log.info("register : " + board);
		
		service.register(board);
		
		rttr.addFlashAttribute("result", board.getBno());
		
		return "redirect:/board/list";
	}
	
	@GetMapping({"/get", "modify"})
	// @ModelAttribute => 뷰에서 cri라는 이름으로 값을 가져올 수 있도록
	public void get(@RequestParam("bno") Long bno, @ModelAttribute("cri") Criteria cri, Model model) {
		log.info("/get");
		model.addAttribute("board", service.get(bno));
	}
	
	
   @PostMapping("/modify")
   public String modify(BoardVO board, @ModelAttribute("cri") Criteria cri, RedirectAttributes rttr) {
      log.info("modify : " + board);
      
      if(service.modify(board)) {
         rttr.addFlashAttribute("result", "success");
      }
      
      // redirect 했을 때 값을 전달한다.
      rttr.addAttribute("pageNum", cri.getPageNum());
      rttr.addAttribute("amount", cri.getAmount());
      rttr.addAttribute("type", cri.getType());
      rttr.addAttribute("keyword", cri.getKeyword());
      
      return "redirect:/board/list";
   }
   
   @PostMapping("/remove")
   public String remove(@RequestParam("bno") Long bno, RedirectAttributes rttr) {
      log.info("remove : " + bno);
      if(service.remove(bno)) {
         rttr.addFlashAttribute("result", "success");
      }
      return "redirect:/board/list";
   }

}
