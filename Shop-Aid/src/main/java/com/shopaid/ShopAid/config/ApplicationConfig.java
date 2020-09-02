package com.shopaid.ShopAid.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages="com.shopaid.ShopAid.repository")
@EntityScan(basePackages="com.shopaid.ShopAid.entity")
public class ApplicationConfig {

}
