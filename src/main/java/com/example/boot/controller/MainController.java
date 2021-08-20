package com.example.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@AllArgsConstructor
@Slf4j
public class MainController {

	@GetMapping("/")
	public ModelAndView main() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");
		return mav;
	}

}
