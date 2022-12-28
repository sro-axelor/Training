package com.axelor.GuiceServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.inject.Singleton;

@Singleton
@WebServlet("/sujit")
public class GuiceServlet extends HttpServlet {

	private static final long serialVersionUID = -7531258530741403544L;

	public void service(HttpServletRequest requset, HttpServletResponse response) throws IOException, ServletException {
		response.getWriter().println("GuiceServlet");
		
		System.out.println("service...");

	}

}
