package com.Spring1106.mapper;

import java.util.List;

import com.Spring1106.domain.JuminVO;

public interface JuminMapper {
	public List<JuminVO> getList();
	public void insert(JuminVO jumin);
	public JuminVO getOne(int mpno);
	public int delete(int mpno);
	public int update(JuminVO jumin);
	public List<JuminVO> getArea(String paddress);
	
	

}
