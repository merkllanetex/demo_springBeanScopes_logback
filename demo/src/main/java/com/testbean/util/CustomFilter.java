package com.testbean.util;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.filter.GenericFilterBean;

public class CustomFilter extends GenericFilterBean {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
	      final HttpServletRequest httpRequest = (HttpServletRequest) request;
	      final HttpServletResponse httpResponse = (HttpServletResponse) response;
	      System.out.println("request is " + httpRequest.getClass());
	      System.out.println("request URL : " + httpRequest.getRequestURL());
	      System.out.println("response is " + httpResponse.getClass());
		chain.doFilter(request, response);
	}
}
