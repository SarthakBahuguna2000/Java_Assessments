package com.bhavna.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {

	@Before("execution(* com.bhavna.service.PaymentServiceImpl.makePayment())")
	public void printBeforePayment() {
		System.out.println("Payment Started");

	}

	@After("execution(* com.bhavna.service.PaymentServiceImpl.makePayment())")
	public void printAfterPayment() {
		System.out.println("Payment Done");
	}
}
