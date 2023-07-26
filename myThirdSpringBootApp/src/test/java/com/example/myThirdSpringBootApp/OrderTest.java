package com.example.myThirdSpringBootApp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class OrderTest {

	Order order = new Order();

	double calculateOrderPrice = order.calculateOrderPrice();

	double calculateOrderPriceTest = 47.11;

	@Test
	public double calculateOrderPriceTest() {
		assertEquals(calculateOrderPrice, calculateOrderPriceTest);
		return calculateOrderPrice;
	}

}
