package kosa.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import kosa.model.Board;

@Controller
public class BoardController {

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
		
		return "";
	}
	
}
