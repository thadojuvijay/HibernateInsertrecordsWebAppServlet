package com.ecil;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CaptureEmployeeDataServlet")
public class CaptureEmployeeDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		

Double salary = Double.parseDouble(request.getParameter("salary"));
Employee employee=new Employee();
employee.setName(name);
employee.setSalary(salary);



StroreEmployeeData stroreEmployeeData=new StroreEmployeeData();
stroreEmployeeData.StoreEmployeeData(employee);
PrintWriter out = response.getWriter();
out.println("record inserted");
	}


}
