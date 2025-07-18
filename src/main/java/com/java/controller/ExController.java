package com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.java.service.ExService;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class ExController {
	private final ExService exService;
	
	@GetMapping("/")
	public String exlist(Model model,HttpServletRequest req) {
		return exService.exlist(model,req);
	}
	
	@GetMapping("/exdetail")
	public String exdetail(Model model,HttpServletRequest req) {
		return exService.exdetail(model,req);
	}
	
	@PostMapping("/edit")
	public String exdetail(HttpServletRequest req) {
		return exService.edit(req);
	}
	@GetMapping("/exinput")
	public String add() {
		return "exinput";
	}
	@PostMapping("/exinput")
	public String exinput(HttpServletRequest req) {
		return exService.exinput(req);
	}
	
	@GetMapping("/accept")
	public String accept(HttpServletRequest req) {
		return exService.accept(req);
	}

}
