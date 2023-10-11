package dev.danwalkercs.dumbservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class DumbServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DumbServiceApplication.class, args);
	}

}
