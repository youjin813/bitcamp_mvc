package com.kabank.mvc.enums;

public enum ResultEnum {
	ID("id"),
	PASS("pass"),
	NAME("name"),
	SSN("ssn"),
	PHONE("phone"),
	EMAIL("email"),
	PROFILE("profile"),
	ADDR("addr"),
	PERCENT("('%s','%s','%s','%s','%s','%s','%s','%s')");
	
	
	public final String value;
	private ResultEnum(String value) {
		this.value = value;
	}
	public String getValue() {
		return value;
	}
 }
