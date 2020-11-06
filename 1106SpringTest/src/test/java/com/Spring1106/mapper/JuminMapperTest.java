package com.Spring1106.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.Spring1106.domain.JuminVO;
import com.Spring1106.mapper.JuminMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class JuminMapperTest {
	@Setter(onMethod_=@Autowired)
	private JuminMapper mapper;
	
//	@Test
//	public void testGetList() {
//		mapper.getList().forEach(i->log.info("테스트에서 조회한 " + i));
//	}
//	
//	@Test
//	public void testInsert() {
//		JuminVO jumin = new JuminVO();
//		jumin.setSname("박재연");
//		jumin.setSpassword("1111");
//		jumin.setFname("박태태");
//		jumin.setMname("김아아");
//		jumin.setCname("null");
//		jumin.setPaddress("용인");
//		jumin.setPnumber("01044447777");
//		jumin.setPfamilycount(3);
//		mapper.insert(jumin);
//	}
//	
//	@Test
//	public void testRead() {
//		JuminVO jumin = mapper.getOne(3);
//		log.info(jumin);
//	}
//	
//	@Test
//	public void testUpdate() {
//		JuminVO jumin = new JuminVO();
//		jumin.setMpno(6);
//		jumin.setMname("김현현");
//		jumin.setPnumber("01066669999");
//		int count = mapper.update(jumin);
//		log.info(count);
//	}
	
	@Test
	public void testDelete() {
		log.info("deleted" + mapper.delete(6));
	}
	
	
	
	

}
