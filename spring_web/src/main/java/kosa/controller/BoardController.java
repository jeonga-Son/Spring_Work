package kosa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
	public String board_form() {
		return "insert_form";
	}
	
	//@RequestMapping(value = "/board_insert", method = RequestMethod.POST)
	@PostMapping("/board_insert")
	public String board_insert() {
		System.out.println("POST ø‰√ª");
		return "";
	}
	
}
