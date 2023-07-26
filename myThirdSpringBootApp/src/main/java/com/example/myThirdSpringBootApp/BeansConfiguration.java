package com.example.myThirdSpringBootApp;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class BeansConfiguration {

	@Bean(name = "MargheritaPizza")
	public Pizza getMargheritaPizza() {
		return new Pizza("Margherita Pizza", "tomato", "cheese", 1104, 4.99);
	}

	@Bean(name = "HawaiianPizza")
	public Pizza getHawaiianPizza() {
		return new Pizza("Hawaiian Pizza", "tomato", "cheese", "ham", "pineapple", 1024, 6.49);
	}

	@Bean(name = "SalamiPizza")
	public Pizza getSalamiPiazza() {
		return new Pizza("Salami Pizza", "tomato", "cheese", "salami", 1160, 5.99);
	}

	@Bean(name = "CustomPizza")
	public Pizza getCustomPizza() {
		return new Pizza("Custom Pizza", "tomato", "cheese", "salami", "onion", 1104 + 86 + 22, 4.99 + 0.99 + 0.69,
				PizzaSize.LARGE);
	}

	@Bean(name = "Cheese")
	public Topping getCheese() {
		return new Topping("Cheese", 92, 0.69);
	}

	@Bean(name = "Ham")
	public Topping getHam() {
		return new Topping("Ham", 35, 0.99);
	}

	@Bean(name = "Onions")
	public Topping getOnions() {
		return new Topping("Onions", 22, 0.69);
	}

	@Bean(name = "Pineapple")
	public Topping getPineapple() {
		return new Topping("Pineapple", 24, 0.79);
	}

	@Bean(name = "Salami")
	public Topping getSalami() {
		return new Topping("Salami", 86, 0.99);
	}

	@Bean(name = "Lemonade")
	public Drink getLemonade() {
		return new Drink("Lemonade", "(0.33l)", 128, 1.29);
	}

	@Bean(name = "Water")
	public Drink getWater() {
		return new Drink("Water", "(0.5l)", 0, 1.29);
	}

	@Bean(name = "Wine")
	public Drink getWine() {
		return new Drink("Wine", "(0.75l, 13%)", 607, 7.49);
	}

	@Bean(name = "Shirt")
	public Franchise getShirt() {
		return new Franchise("Shirt", 21.99);
	}

	@Bean(name = "Mug")
	public Franchise getMug() {
		return new Franchise("Mug", 4.99);
	}

	@Bean(name = "Table01")
	public Table getTable01() {
		return new Table("01", 4, TableStatus.FREE);
	}

	@Bean(name = "Table02")
	public Table getTable02() {
		return new Table("02", 4, TableStatus.FREE);
	}

	@Bean(name = "Table03")
	public Table getTable03() {
		return new Table("03", 8, TableStatus.FREE);
	}

	@Bean(name = "Table04")
	public Table getTabl04() {
		return new Table("04", 8, TableStatus.FREE);
	}

	@Bean(name = "Table05")
	public Table getTable05() {
		return new Table("05", 10, TableStatus.FREE);
	}

	@Bean(name = "Order01")
	public Order getOrder01() {

		Order order01 = new Order();

		order01.setNumber("01");
		order01.setTime(LocalDateTime.now());
		order01.setOrderStatus(OrderStatus.INPROGRESS);
		order01.setTable(getTable01());
		order01.setSeats(4);
		// adding as many pizza as I want
		order01.addPizza(getMargheritaPizza());
		order01.addPizzaNote(getMargheritaPizza(), "Ben cotta");
		order01.addPizza(getMargheritaPizza());
		order01.addPizza(getMargheritaPizza());
		order01.addPizza(getMargheritaPizza());
		// adding as many drinks as I want
		order01.addDrink(getWater());
		order01.addDrinkNote(getWater(), "Temperatura ambiente");
		order01.addDrink(getWater());
		order01.addDrink(getWater());
		order01.addDrink(getWater());
		// adding as many franchises as I want
		order01.addFranchise(getShirt());
		order01.addFranchiseNotes(getShirt(), "Taglia M");

		order01.setOrderPrice(order01.calculateOrderPrice());

		return order01;

	}

	@Bean(name = "Order02")
	public Order getOrder02() {

		Order order02 = new Order();

		order02.setNumber("02");
		order02.setTime(LocalDateTime.now());
		order02.setOrderStatus(OrderStatus.INPROGRESS);
		order02.setTable(getTable02());
		order02.setSeats(4);
		// adding as many pizza as I want
		order02.addPizza(getSalamiPiazza());
		order02.addPizzaNote(getSalamiPiazza(), "Ben cotta");
		order02.addPizza(getSalamiPiazza());
		order02.addPizza(getSalamiPiazza());
		order02.addPizza(getSalamiPiazza());
		// adding as many drinks as I want
		order02.addDrink(getLemonade());
		order02.addDrinkNote(getLemonade(), "Con ghiaccio");
		order02.addDrink(getLemonade());
		order02.addDrink(getLemonade());
		order02.addDrink(getLemonade());
		// adding as many franchises as I want
		order02.addFranchise(getShirt());
		order02.addFranchiseNotes(getShirt(), "Taglia M");

		order02.setOrderPrice(order02.calculateOrderPrice());

		return order02;

	}

}
