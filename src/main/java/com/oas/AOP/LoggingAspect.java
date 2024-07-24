package com.oas.AOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Aspect
@Slf4j
public class LoggingAspect {

	@Before("execution ( * com.oas.*.*.* (..))")
	public void beforeStart(JoinPoint jp) {
		log.info("Method execution has been started== "+"class name=="+jp.getTarget().toString()+"== method name=="+jp.getSignature().getName());
	}
	
	@After("execution ( * com.oas.*.*.* (..))")
	public void afterEnd(JoinPoint jp) {
		log.info("Method execution has been completed== "+"class name=="+jp.getTarget().toString()+"== method name=="+jp.getSignature().getName());
	}
}
