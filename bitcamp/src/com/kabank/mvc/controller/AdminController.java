package com.kabank.mvc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kabank.mvc.enums.PathEnum;
import com.kabank.mvc.service.AdminService;
import com.kabank.mvc.serviceImpl.AdminServiceImpl;


@WebServlet({"/admin/main.do","/admin/create_table.do"})
public class AdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("==========서블릿 들어옴");
		String dir = request.getServletPath().split(PathEnum.SEPARATOR.getValue())[1];
		String action = request.getServletPath().split(PathEnum.SEPARATOR.getValue())[2].split(PathEnum.DOT.getValue())[0];
		String dest = "";
		System.out.println(action);
		switch(action) {
		case "main":
			action = "admin";
			dest = "main";
			break;
		case "create_table":
			AdminService service = new AdminServiceImpl();
			service.admin(request.getParameter("admin_list"));
			dest = "main";
			break;
		}
		request.getRequestDispatcher(PathEnum.VIEW.getValue()+dir+PathEnum.SEPARATOR.getValue()+dest+PathEnum.EXTENSION.getValue()).forward(request, response);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
