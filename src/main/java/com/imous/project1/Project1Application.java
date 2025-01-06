package com.imous.project1;

import com.imous.project1.entities.OrderEntity;
import com.imous.project1.services.OrderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class Project1Application {

	public static void main(String[] args) {SpringApplication.run(Project1Application.class, args);}

	@Bean
	CommandLineRunner start(OrderService orderService) {
		return args -> {
			OrderEntity order = new OrderEntity();
			order.setReference("order1");
			order.setOrderDate(LocalDate.now());
			orderService.createOrder(order);
		};
	}

}
