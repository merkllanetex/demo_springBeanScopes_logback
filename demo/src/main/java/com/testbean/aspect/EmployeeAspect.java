package com.testbean.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.testbean.demo.DemoApplication;


public class EmployeeAspect {
	private static final Logger log=LoggerFactory.getLogger(DemoApplication.class);
	@SuppressWarnings("unused")
	private static int counter;
	private Object name;
	public EmployeeAspect() {
		++counter;
	}
	
	public static int getEmploeeAspectIntance () {
		return counter;
		
	}
	
	 public Object getName() {
		return name;
	}
	public void setName(Object name) {
		this.name = name;
	}
	public Object testAdvice (ProceedingJoinPoint proceedingJoinPoint) {
		 
		 Object returnValue = null;
		 
		 try {
			log.debug("Before Advice");
			returnValue = proceedingJoinPoint.proceed();
			log.debug("After returning" + String.valueOf(returnValue));
			
		} catch (Throwable e) {
			log.error("Throwing advice error: ");
		}
		 
		 return returnValue;
		 
	 }
} 
