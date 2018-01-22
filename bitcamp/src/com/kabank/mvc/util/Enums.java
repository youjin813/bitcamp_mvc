package com.kabank.mvc.util;

public class Enums {
	public enum MemberColumn {
		ID,PASS,NAME
	}
	public enum JoinColumn {
		ID,PASS,NAME,SSN,PHONE,EMAIL,PROFILE,ADDR
	}
	public enum Table{
		MEMBER,ATTEND,ADMIN,BANK,MOBILE
	}
	public enum DML{
		SELECT,INSERT,INFO,UPDATE,DELETE,FROM
	}
	public static String join() {
		String tmp = "";
		for(Enums.JoinColumn j: Enums.JoinColumn.values()) {
			if(j.ordinal()==7) {
				tmp +=j;
			}
			else {
				tmp +=j + ",";
				}
			}
		return tmp;
		}
	}

