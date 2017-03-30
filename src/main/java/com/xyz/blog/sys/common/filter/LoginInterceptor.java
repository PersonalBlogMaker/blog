package com.xyz.blog.sys.common.filter;

import com.xyz.blog.sys.common.SessionManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by banma on 17/3/30.
 */
@Controller
public class LoginInterceptor implements HandlerInterceptor{
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {

        HttpSession session = (HttpSession) request.getSession().getAttribute("UserSession");
        if (request.getRequestURI().contains("login") || request.getRequestURI().contains("html")) {
            SessionManager.setUserSession(request.getSession());
            return true;
        } else if (session != null) {
            //激活监听器，把当前session,放入sessionManager中，方便程序运行过程中取session.
            request.getSession().setAttribute("UserSession", session);
            return true;
        } else {
            System.out.println("没有登录，请转到登录页面");
            response.sendRedirect("/login");
            return false;
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
