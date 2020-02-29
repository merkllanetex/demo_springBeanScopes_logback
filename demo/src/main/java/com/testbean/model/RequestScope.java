package com.testbean.model;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value="request", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class RequestScope {

private static String name;
	
	public RequestScope() {
		System.out.println("DataRequestScope Constructor Called");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		RequestScope.name = name;
	}
}
