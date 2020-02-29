package com.testbean.demo;

import javax.servlet.annotation.WebListener;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.RequestContextListener;

@Configuration
@WebListener
@ComponentScan(basePackages = {"com.testbean.service"})
public class AppConfig extends RequestContextListener {
	
	
//	@Bean
//    @ConditionalOnMissingBean(RequestContextListener.class)
//    public RequestContextListener requestContextListener() {
//        return new RequestContextListener();
//    }
}
