package com.bluesky.tarining;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;
import com.sun.net.httpserver.Filter.Chain;
import com.sun.net.httpserver.HttpExchange;


public class BeerRequestFilter implements Filter {
	private FilterConfig fc;
	

	public void init(FilterConfig config) {
		this.fc=config;
	}
	
	
	public void doFilter(ServletRequest request,ServletResponse response,FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest req=(HttpServletRequest) request;
		String name=req.getRemoteUser();
		if(name!=null) {
			fc.getServletContext().log("USER"+name+"is updating");
		}
		chain.doFilter(request, response);
	}

	public void destroy() {
		
	}

	public void doFilter(HttpExchange arg0, Chain arg1) throws IOException {
		// TODO Auto-generated method stub
		
	}


	public String description() {
		// TODO Auto-generated method stub
		return null;
	}
}
