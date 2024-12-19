package com.aprzybylo.checkout.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class CheckoutServiceApplication 
{
	public static void main( String[] args )
	{
		SpringApplication.run(CheckoutServiceApplication.class, args);
		System.out.println( "Hello World!" );
	}
}