package dev.danwalkercs.sproutroute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SproutRouteApplication {
	public static void main(String[] args) {
		SpringApplication.run(SproutRouteApplication.class, args);
	}
}
