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
			String accept = req.getParameter("accept");			
			if(accept == null || accept == "") accept ="2";
			List<ExDTO> exDTO = exDao.exlist(accept);
			model.addAttribute("result",exDTO);
			return "exlist";
			/*
			 * String title = req.getParameter("accept"); List<ExDTO> exDTO =
			 * exDao.exlist(title); model.addAttribute("result",exDTO);
			 */
		
	}

		@Override
		public String exdetail(Model model,HttpServletRequest req) {
			int no = Integer.parseInt(req.getParameter("no"));
			ExDTO exDTO = exDao.exdetail(no);
			model.addAttribute("result", exDTO);
			return "exdetail";
		}

		@Override
		public String edit(HttpServletRequest req) {
			int no = Integer.parseInt(req.getParameter("no"));
			String title = req.getParameter("title");
			String content = req.getParameter("content");
			ExDTO exDTO = ExDTO.builder().no(no).title(title).content(content).build();
			exDao.edit(exDTO);
			return "redirect:/";
		}

		@Override
		public String exinput(HttpServletRequest req) {
			String title = req.getParameter("title");
			String content = req.getParameter("content");
			ExDTO exDTO = ExDTO.builder().title(title).content(content).build();
			exDao.exinput(exDTO);
			return "redirect:/";
		}

		@Override
		public String accept(HttpServletRequest req) {
			int no = Integer.parseInt(req.getParameter("no"));
			boolean accept = (req.getParameter("accept").equals("0")) ? true : false;
			ExDTO exDTO = ExDTO.builder().no(no).accept(accept).build();
			exDao.accept(exDTO);
			return "redirect:/";
		}
		

}
