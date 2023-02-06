package com.bhavna;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bhavna.service.PaymentService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("com/bhavna/config.xml");
        PaymentService paymentObj=context.getBean("payment",PaymentService.class);
        paymentObj.makePayment();
    }
}
