package com.java.dao;

import java.util.List;

import com.java.dto.ExDTO;

public interface ExDao {

	public List<ExDTO> exlist(String accept);

	public ExDTO exdetail(int no);

	public int edit(ExDTO exDTO);

	public int exinput(ExDTO exDTO);

	public int accept(ExDTO exDTO);

}
