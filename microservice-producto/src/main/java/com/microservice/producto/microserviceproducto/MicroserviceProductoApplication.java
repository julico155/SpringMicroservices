package com.microservice.producto.microserviceproducto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MicroserviceProductoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceProductoApplication.class, args);
	}

}
