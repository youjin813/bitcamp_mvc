package com.kabank.mvc.serviceImpl;

import com.kabank.mvc.service.AttendService;

public class AttendServiceImpl implements AttendService{
	public static AttendService getInstance() {
		return new AttendServiceImpl();	
	}
}
