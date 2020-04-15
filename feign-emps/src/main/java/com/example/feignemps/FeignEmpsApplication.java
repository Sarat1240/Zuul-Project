package com.example.feignemps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.example.feignemps.config.RibbonConfiguration;

@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
@RibbonClient(name="server", configuration = RibbonConfiguration.class)
public class FeignEmpsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignEmpsApplication.class, args);
	}

}
