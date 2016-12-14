package com.xyz.blog.sys.common;

import javax.servlet.http.HttpSession;

public class SessionManager {
	
	private static ThreadLocal<HttpSession> threadLocal = new ThreadLocal<HttpSession>();
	
	public static void setUserSession(HttpSession httpSession){
		threadLocal.set(httpSession);
		System.out.println("123");
	}
	
	public static HttpSession getUserSession(){
		return (HttpSession) threadLocal.get();
	}
	
}
