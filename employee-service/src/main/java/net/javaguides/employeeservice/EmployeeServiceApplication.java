package net.javaguides.employeeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
//import org.springframework.web.client.RestTemplate;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
//@OpenAPIDefinition
@EnableEurekaClient
public class EmployeeServiceApplication {

//	This is configured using REST TEMPLATE--it is going to be deprecated soon
//	@Bean
//	public RestTemplate restTemplate() {
//		return new RestTemplate();
//
//	}
//now we configured Web client as Spring Bean

	@Bean
	public WebClient webClient() {
		return WebClient.builder().build();
	}

	public static void main(String[] args) {
		SpringApplication.run(EmployeeServiceApplication.class, args);
	}

}
