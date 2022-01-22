package com.bookMyHotel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SearchHotelApplication {

	public static void main(String[] args) {
		SpringApplication.run(SearchHotelApplication.class, args);
	}

}
