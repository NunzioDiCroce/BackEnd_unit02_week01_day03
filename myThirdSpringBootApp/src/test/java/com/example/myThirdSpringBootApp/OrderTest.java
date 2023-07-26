package com.example.myThirdSpringBootApp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class OrderTest {

	@Test
	public void calculateOrderPriceTest() {

		Order order = new Order();

		double calculateOrderPrice = order.calculateOrderPrice();

		double calculateOrderPriceTest = 47.11;

		assertEquals(calculateOrderPriceTest, calculateOrderPrice);

	}

}
