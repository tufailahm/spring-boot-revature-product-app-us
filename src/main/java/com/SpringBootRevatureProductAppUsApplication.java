package com;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringBootRevatureProductAppUsApplication {

	public static void main(String[] args) {

		SpringApplication application = new SpringApplication(SpringBootRevatureProductAppUsApplication.class);

		Scanner scanner = new Scanner(System.in);

		// System.out.println("Enter the environment (PROD-DEV) :");
		// String choice = scanner.nextLine();

		// application.setAdditionalProfiles(choice);
		application.run(args);

		/*
		 * ConfigurableApplicationContext context =
		 * SpringApplication.run(SpringBootRevatureProductAppUsApplication.class, args);
		 * 
		 * String allBeans[] = context.getBeanDefinitionNames();
		 * 
		 * Arrays.sort(allBeans);
		 */

		// This will display all the beans injected into my application - by default
		/*
		 * for(String bean:allBeans) { System.out.println(bean); }
		 */
	}
	
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
