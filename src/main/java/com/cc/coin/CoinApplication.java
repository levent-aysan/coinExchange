package com.cc.coin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.cc.coin.repository.*;;


@SpringBootApplication
@EnableScheduling
public class CoinApplication {
	@Autowired
	UserRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(CoinApplication.class, args);
		
		
	
		
	}
}
