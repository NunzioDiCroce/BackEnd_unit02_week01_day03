package com.example.myThirdSpringBootApp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OrderTest {

	@Test
	public void calculateOrderPriceTest() {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeansConfiguration.class);

		Order order01 = ctx.getBean("Order01", Order.class);
		Order order02 = ctx.getBean("Order02", Order.class);

		double calculateOrderPrice01 = order01.calculateOrderPrice();
		double calculateOrderPrice02 = order02.calculateOrderPrice();

		double calculateOrderPrice01Test = 47.11;
		double calculateOrderPrice02Test = 51.11;

		assertEquals(calculateOrderPrice01Test, calculateOrderPrice01);
		assertEquals(calculateOrderPrice02Test, calculateOrderPrice02);

	}

}
