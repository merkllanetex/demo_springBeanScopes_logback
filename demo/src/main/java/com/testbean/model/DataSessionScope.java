package com.testbean.model;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value="session", proxyMode=ScopedProxyMode.TARGET_CLASS)
public class DataSessionScope {
	private Object name;
	
	public DataSessionScope() {
		System.out.println("DataSessionScope Constructor Called at "+LocalDateTime.now());
	}

	public Object getName() {
		return name;
	}

	public void setName(Object name) {
		this.name = name;
	}
}
