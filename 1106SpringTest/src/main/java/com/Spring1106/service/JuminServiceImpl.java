package com.Spring1106.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Spring1106.domain.JuminVO;
import com.Spring1106.mapper.JuminMapper;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class JuminServiceImpl implements JuminService{
	private JuminMapper mapper;
	
	@Override
	public List<JuminVO> getList() {
		return mapper.getList();
	}

	@Override
	public void register(JuminVO jumin) {
		mapper.insert(jumin);
	}

	@Override
	public JuminVO getOne(int mpno) {
		return mapper.getOne(mpno);
	}

	@Override
	public boolean modify(JuminVO jumin) {
		return mapper.update(jumin)==1;
	}

	@Override
	public boolean remove(int mpno) {
		return mapper.delete(mpno)==1;
	}

	@Override
	public List<JuminVO> getArea(String paddress) {
		// TODO Auto-generated method stub
		return mapper.getArea(paddress);
	}

}
