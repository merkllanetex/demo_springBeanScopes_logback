package com.testbean.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import com.testbean.demo.DemoApplication;

@Component
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class DynamicName {
	private static Object name;
	private static final Logger log = LoggerFactory.getLogger(DynamicName.class);
	
	@SuppressWarnings("unused")
	private static int counter;
	
	public DynamicName() {
		++counter;
	}
	
	public static int getDyanamicNameBeanInstance() {
		return counter;
	}

	public Object getName() {
		return name;
	}

	public void setName(Object name) {
		DynamicName.name = name;
	}

	@PostConstruct
	public void initIt() throws Exception {
	  log.debug("Init method after properties are set : " + name);
	}
	
	@PreDestroy
	public void cleanUp() throws Exception {
	  log.debug("Spring Container is destroy! Customer clean up");
	}

}
