package com.example.myThirdSpringBootApp;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Slf4j

public class Order {
	protected String number;
	protected LocalDateTime time;
	protected OrderStatus orderStatus;
	protected Table table;
	protected double seats;

	protected List<Pizza> pizzas = new ArrayList<>();
	protected Map<Pizza, String> pizzaNotes = new HashMap<>();

	protected List<Drink> drinks = new ArrayList<>();
	protected Map<Drink, String> drinkNotes = new HashMap<>();

	protected List<Franchise> franchises = new ArrayList<>();
	protected Map<Franchise, String> franchiseNotes = new HashMap<>();

	// orderPrice DEVE ESSERE LA SOMMA DEGLI ELEMENTI E DEI COPERTI. I COPERTI
	// DEVONO ESSERE VALORIZZATI PER MEZZO DI UN PARAMETRO DI
	// src/main/resources/application.properties
	protected double orderPrice;

	@Value("${application.covercharge}")
	protected double covercharge;

	public void addPizza(Pizza _pizza) {
		pizzas.add(_pizza);
	}

	public void addPizzaNote(Pizza _pizza, String _pizzaNote) {
		pizzaNotes.put(_pizza, _pizzaNote);
	}

	public void addDrink(Drink _drink) {
		drinks.add(_drink);
	}

	public void addDrinkNote(Drink _drink, String _drinkNote) {
		drinkNotes.put(_drink, _drinkNote);
	}

	public void addFranchise(Franchise _franchise) {
		franchises.add(_franchise);
	}

	public void addFranchiseNotes(Franchise _franchise, String _franchiseNote) {
		franchiseNotes.put(_franchise, _franchiseNote);
	}

	public double calculateOrderPrice() {
		double pizzasTotalPrice = 0;

		for (Pizza pizza : pizzas) {
			pizzasTotalPrice += pizza.getPrice();
		}

		double drinksTotalPrice = 0;

		for (Drink drink : drinks) {
			drinksTotalPrice += drink.getPrice();
		}

		double franchisesTotalPrice = 0;

		for (Franchise franchise : franchises) {
			franchisesTotalPrice = +franchise.getPrice();
		}

		double coverchargeSeats = covercharge * seats;

		return this.orderPrice = pizzasTotalPrice + drinksTotalPrice + franchisesTotalPrice + coverchargeSeats;

	}

}
