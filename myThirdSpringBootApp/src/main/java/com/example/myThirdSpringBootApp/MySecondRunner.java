package com.example.myThirdSpringBootApp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j

public class MySecondRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		log.info("MyFirstRunner is running...");

		configWithAnnotationConfing();

	}

	public static void configWithAnnotationConfing() {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
				MyThirdSpringBootAppApplication.class);

		log.info("");
		log.info("MENU");
		log.info("Pizzas");
		log.info(ctx.getBean("MargheritaPizza").toString());
		log.info(ctx.getBean("HawaiianPizza").toString());
		log.info(ctx.getBean("SalamiPizza").toString());

		log.info("Toppings");
		log.info(ctx.getBean("Cheese").toString());
		log.info(ctx.getBean("Ham").toString());
		log.info(ctx.getBean("Onions").toString());
		log.info(ctx.getBean("Pineapple").toString());
		log.info(ctx.getBean("Salami").toString());

		log.info("Drinks");
		log.info(ctx.getBean("Lemonade").toString());
		log.info(ctx.getBean("Water").toString());
		log.info(ctx.getBean("Wine").toString());

		log.info("Franchise");
		log.info(ctx.getBean("Shirt").toString());
		log.info(ctx.getBean("Mug").toString());

		log.info("");
		log.info("TABLES");
		log.info(ctx.getBean("Table01").toString());
		log.info(ctx.getBean("Table02").toString());
		log.info(ctx.getBean("Table03").toString());
		log.info(ctx.getBean("Table04").toString());
		log.info(ctx.getBean("Table05").toString());

		log.info("");
		log.info("ORDERS");
		log.info(ctx.getBean("Order01").toString());
		log.info(ctx.getBean("Order02").toString());

		ctx.close();

	}

}
