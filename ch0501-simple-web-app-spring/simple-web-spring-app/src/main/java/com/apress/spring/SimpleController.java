package com.apress.spring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class SimpleController extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
		HttpServletResponse response) throws Exception {

		// 创建一个视图对象，视图的名称是showMessage
		ModelAndView model = new ModelAndView("showMessage");
		// 设置视图信息
		model.addObject("message", "Spring MVC Web Application");
		
		return model;
	}
}
