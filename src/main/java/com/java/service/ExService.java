package com.java.service;

import org.springframework.ui.Model;

import jakarta.servlet.http.HttpServletRequest;

public interface ExService {

	String exlist(Model model, HttpServletRequest req);

}
