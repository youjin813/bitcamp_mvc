package com.kabank.mvc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kabank.mvc.command.Command;
import com.kabank.mvc.enums.PathEnum;
import com.kabank.mvc.service.CommonService;
import com.kabank.mvc.serviceImpl.CommonServiceImpl;

@WebServlet("/common/jdbc_test.do")
public class CommonController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	CommonService service;
	public CommonController() {
		service = new CommonServiceImpl();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("===========서블릿 내부============");
		String dir = request.getServletPath().split(PathEnum.SEPARATOR.getValue())[1];
		String dest = request.getServletPath().split(PathEnum.SEPARATOR.getValue())[2].split(PathEnum.DOT.getValue())[0];
		Command cmd = new Command();
		request.setAttribute("count",service.countTable(cmd));
		request.getRequestDispatcher(PathEnum.VIEW.getValue()+dir+PathEnum.SEPARATOR.getValue()+dest+PathEnum.EXTENSION.toString()).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
