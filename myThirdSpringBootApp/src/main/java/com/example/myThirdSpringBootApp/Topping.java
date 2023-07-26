package com.example.myThirdSpringBootApp;

import org.springframework.context.annotation.Scope;

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

@Scope("prototype")
public class Topping {
	protected String name;
	protected double calories;
	protected double price;

}
