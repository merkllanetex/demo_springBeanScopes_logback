package com.testbean.model;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextListener;

@Component
public class RequestListener extends RequestContextListener {

	@Bean
	public RequestListener requestContextListener() {
		return new RequestListener();
	}
	
	
}
