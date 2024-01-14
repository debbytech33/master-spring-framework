package com.in28minutes.learnspringframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person (String name, int age, Address address) {};
record Address (String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {

	@Bean
	public String name () {
		return "Debby";
	}
	
	@Bean
	public int age () {
		return 10;
	}
	
	@Bean
	public Person person () {
		return new Person("Alfie", 3, new Address("rue des Tulipes", "St-Médard d'Eyrans"));
	}
	
	@Bean
	public Person person2MethodCall () {
		return new Person(name(), age(), address());
	}
	
	@Bean
	public Person person3Parameters (String name, int age, Address address3) {
		return new Person(name, age, address3);
	}
	
	@Bean
	@Primary
	public Person person4Parameters (String name, int age, Address address) {
		return new Person(name, age, address);
	}
	
	@Bean
	public Person person5Qualifier (String name, int age, @Qualifier("address3Qualifier") Address address) {
		return new Person(name, age, address);
	}
	
	@Bean(name = "address2")
	@Primary
	public Address address () {
		return new Address("rue des magnolias", "St-Médard d'Eyrans");
	}
	
	@Bean(name = "address3")
	@Qualifier("address3Qualifier")
	public Address address3 () {
		return new Address("rue des Tilleuls", "St-Médard d'Eyrans");
	}
}
