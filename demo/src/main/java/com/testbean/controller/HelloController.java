package com.testbean.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.testbean.aspect.EmployeeAspect;
import com.testbean.demo.DemoApplication;
import com.testbean.model.DynamicName;

@RestController
public class HelloController {

	@Autowired
	private DynamicName dName;

	private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);
 
	@RequestMapping(value = "/test/{name}", method = RequestMethod.GET)
	public String index(@PathVariable String name) throws Exception {
		dName.setName(name);
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beanConfig.xml");

		
//		Employee employee = (Employee) ctx.getBean("employee");
		EmployeeAspect empAspectBean = (EmployeeAspect) ctx.getBean("employeeAspect"); 
		ctx.close();
		
		log.debug("[Setting bean property value] " + dName.getName());
		StringBuilder strLog = new StringBuilder();
		
		strLog.append(" [EmployeeAspect (singleTon scope)  Bean Value] " + empAspectBean.getName());
		strLog.append("</br>");
		strLog.append(" [DynamicName (session scope)  Bean Value] " + dName.getName());
		strLog.append("</br>");
		strLog.append(" [URL request @PathVariable name:] ");
		strLog.append(name);
		strLog.append("</br>");
		strLog.append("</br>");
		strLog.append("[INSTANCE CREATED FOR DYNAMICNAME_BEAN]: " + DynamicName.getDyanamicNameBeanInstance() );
		strLog.append("</br>");
		strLog.append("</br>");
		strLog.append(" [INSTANCE CREATED FOR EMPLOYEE_BEAN]: " + EmployeeAspect.getEmploeeAspectIntance());
		
		log.debug("[EmployeeAspect Bean ] " + empAspectBean.getName());
		return String.valueOf(strLog);
		

	}

}
