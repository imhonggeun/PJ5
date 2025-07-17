package com.java.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.java.dto.ExDTO;

@Mapper
public interface ExMapper {

	//@Select("select * from test")
	//List<ExDTO> exlist(String title);
	@Select({"<script>"
			+ "SELECT no, title, content, accept, regDate FROM test "
			+ "<if test='accept == 1'>WHERE accept = 1</if> "
			+ "<if test='accept == 0'>WHERE accept = 0</if> "
			+ "</script>"})
	List<ExDTO> exlist(String accept);

	@Select("select * from test where no=#{no}")
	ExDTO exdetail(int no);
	
	@Update("UPDATE test SET title=#{title},content=#{content} where NO=#{no}")
	int edit(ExDTO exDTO);

	@Insert("Insert into test (title,content) values (#{title},#{content})")
	int exinput(ExDTO exDTO);

	@Update("update test set accept=#{accept} where no=#{no}")
	int accept(ExDTO exDTO);

}
