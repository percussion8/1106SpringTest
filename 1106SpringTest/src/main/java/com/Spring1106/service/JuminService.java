package com.Spring1106.service;

import java.util.List;

import com.Spring1106.domain.JuminVO;

public interface JuminService {
	public List<JuminVO> getList(); //list
	public void register (JuminVO jumin); //insert
	public JuminVO getOne(int mpno); //getOne
	public boolean modify(JuminVO jumin); //update
	public boolean remove(int mpno); //delete
	public List<JuminVO> getArea(String paddress);
	
}
