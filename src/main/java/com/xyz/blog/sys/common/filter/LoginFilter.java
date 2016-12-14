package com.xyz.blog.sys.common.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.xyz.blog.sys.common.SessionManager;

@WebFilter(filterName="LoginFilter",urlPatterns="/*")
public class LoginFilter implements Filter{

	@Override
	public void destroy() {
		
	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		
		HttpSession session = (HttpSession) request.getSession().getAttribute("UserSession");
		if(request.getRequestURI().contains("login")){
			SessionManager.setUserSession(request.getSession());
			chain.doFilter(servletRequest, servletResponse);
		}else if(session != null){
			//激活监听器，把当前session,放入sessionManager中，方便程序运行过程中取session.
			request.getSession().setAttribute("UserSession", session);
			chain.doFilter(servletRequest, servletResponse);
		}else{
			System.out.println("没有登录，请转到登录页面");
		}
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		
	}

}
