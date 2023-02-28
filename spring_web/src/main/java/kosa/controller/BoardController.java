package kosa.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kosa.model.Board;
import kosa.model.BoardDao;

@Controller
public class BoardController {
	@Autowired
	private BoardDao dao;

//	@RequestMapping("/board_insert")
//	public ModelAndView board_form() {
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("insert_form");
//	
//		return mav;
//	}
	
	//@RequestMapping(value = "/board_insert", method = RequestMethod.GET)
	@GetMapping("/board_insert")
	public String board_form(@ModelAttribute("boardCommand") Board board) { // 빈거라도 전달해야 오류나지 않음.
		return "insert_form";
	}
	
	//@RequestMapping(value = "/board_insert", method = RequestMethod.POST)
	@PostMapping("/board_insert")
	public String board_insert(@ModelAttribute("boardCommand") @Valid Board board, BindingResult errors) { // Validation을 자체적으로 체크한다.
		if(errors.hasErrors()) {
			System.out.println("에러발생");
			return "insert_form";
		}
		
		dao.insertBoard(board);

		return "redirect:board_list";
	}
	
	@GetMapping("/board_list")
	public String showBoard_list(Model model) {
//		System.out.println( dao.listBoard());
		
		// Model에 데이터를 담을 때 addAttribute( ) 메소드를 사용
		model.addAttribute("list", dao.listBoard());
		
		return "list";
	}
	
	@GetMapping("/show_board_detail") 
	public String showBoardDetail(@RequestParam("seq") int seq, Model model) {
		model.addAttribute("detail", dao.showDetailBoard(seq));
		
		return "showDetail";
	}

	
}
