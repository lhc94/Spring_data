package com.itbank.intercepter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.itbank.member.MemberDTO;

public class LoginJoBob extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		MemberDTO login = (MemberDTO)request.getSession().getAttribute("login");
		
		if(login != null) {
			return true;
		}
		String cpath = request.getContextPath();
		String url = request.getRequestURL().toString();
		
		response.sendRedirect(cpath + "/login?url=" + url);
		
		return false;
	}

}
