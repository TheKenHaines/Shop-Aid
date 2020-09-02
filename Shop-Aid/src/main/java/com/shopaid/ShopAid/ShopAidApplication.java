package com.shopaid.ShopAid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.shopaid.ShopAid")
public class ShopAidApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopAidApplication.class, args);
	}

}
