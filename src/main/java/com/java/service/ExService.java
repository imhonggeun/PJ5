package com.java.service;

import org.springframework.ui.Model;

import jakarta.servlet.http.HttpServletRequest;

public interface ExService {

	String exlist(Model model, HttpServletRequest req);

	String exdetail(Model model,HttpServletRequest req);

	String edit(HttpServletRequest req);

	String exinput(HttpServletRequest req);

}
