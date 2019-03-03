package com.spring.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInitial extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {		
		return new Class[] { InitConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {		
		return null;
	}

	@Override
	protected String[] getServletMappings() {		
		return new String[] { "/" };
	}

}
