package com.xyz.blog.sys.common.listner;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;


import com.xyz.blog.sys.common.SessionManager;

@WebListener
public class LoginListner implements HttpSessionAttributeListener {

	@Override
	public void attributeAdded(HttpSessionBindingEvent event) {
		if ("UserSession".equals(event.getName())) {
			if (SessionManager.getUserSession() == null) {
				SessionManager.setUserSession((HttpSession) event.getValue());
			}
		}
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent event) {

	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent event) {
		if ("UserSession".equals(event.getName())) {
			if (SessionManager.getUserSession() == null) {
				SessionManager.setUserSession((HttpSession) event.getValue());
			}
		}
	}

}
