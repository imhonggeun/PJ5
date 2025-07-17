package com.java.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.java.dto.ExDTO;

@Mapper
public interface ExMapper {

	@Select("select * from test")
	List<ExDTO> exlist(String title);

}
