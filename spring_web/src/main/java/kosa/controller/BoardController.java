package kosa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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
	
	@RequestMapping("/board_insert")
	public String board_form() {
		return "insert_form";
	}
	
}
