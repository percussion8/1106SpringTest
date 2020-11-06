package com.Spring1106.domain;

import lombok.Data;

@Data
public class JuminVO {
	private int mpno;
	private String sname;
	private String spassword;
	private String fname; //아빠
	private String mname; //엄마
	private String cname;  //아이
	private String paddress;
	private String pnumber;
	private int pfamilycount;

}
