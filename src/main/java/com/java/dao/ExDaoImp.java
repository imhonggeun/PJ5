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
		public List<ExDTO> exlist(String accept) {
			return exMapper.exlist(accept);
	}

		@Override
		public ExDTO exdetail(int no) {
			return exMapper.exdetail(no);
		}

		@Override
		public int edit(ExDTO exDTO) {
			return exMapper.edit(exDTO);
		}

		@Override
		public int exinput(ExDTO exDTO) {
			return exMapper.exinput(exDTO);
		}

		@Override
		public int accept(ExDTO exDTO) {
			return exMapper.accept(exDTO);
		}

}
