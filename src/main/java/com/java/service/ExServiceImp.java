package com.java.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.java.dao.ExDao;
import com.java.dto.ExDTO;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ExServiceImp implements ExService{
		
		private final ExDao exDao;
	
		@Override
		public String exlist(Model model, HttpServletRequest req) {
		String title = req.getParameter("title");
		List<ExDTO> exDTO = exDao.exlist(title);
		model.addAttribute("result",exDTO);
		return "exlist";
	}

		@Override
		public String exdetail(Model model,HttpServletRequest req) {
			int no = Integer.parseInt(req.getParameter("no"));
			ExDTO exDTO = exDao.exdetail(no);
			model.addAttribute("result", exDTO);
			
			return "exdetail";
		}

}
