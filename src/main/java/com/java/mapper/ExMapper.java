package com.java.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.java.dto.ExDTO;

@Mapper
public interface ExMapper {

	@Select("select * from test")
	List<ExDTO> exlist(String title);

	@Select("select * from test where no=#{no}")
	ExDTO exdetail(int no);
	
	@Update("UPDATE test SET title=#{title},content=#{content} where NO=#{no}")
	int edit(ExDTO exDTO);

	@Insert("Insert into test (title,content) values (#{title},#{content})")
	int exinput(ExDTO exDTO);

}
