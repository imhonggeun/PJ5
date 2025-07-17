package com.java.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.java.dto.ExDTO;
import com.java.mapper.ExMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class ExDaoImp implements ExDao{
	
		private final ExMapper exMapper;
		
		@Override
		public List<ExDTO> exlist(String title) {
		return exMapper.exlist(title);
	}

}
