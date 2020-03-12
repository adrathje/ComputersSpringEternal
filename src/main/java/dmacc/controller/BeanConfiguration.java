package dmacc.controller;

import org.springframework.context.annotation.Bean; 
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Computer;
import dmacc.beans.ComputerCase;

// Austin Rathje

@Configuration
public class BeanConfiguration {

	@Bean
	public Computer computer() {
		Computer bean = new Computer(475.99);
		return bean;
	}
	@Bean
	public ComputerCase computerCase() {
		ComputerCase bean = new ComputerCase("Asus", 2);
		return bean;
	}
}
