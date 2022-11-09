package com.axelor.GuiceFilter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class WordFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		System.out.println("Fliter working...."); 
		
		PrintWriter out = response.getWriter();

		String word = request.getParameter("write");

		if (word.length() > 2) {
			chain.doFilter(request, response);
		} else {
			out.println("Invalid word the word should have > 2 letters");
		}
	}

	@Override
	public void destroy() {
	}
}
