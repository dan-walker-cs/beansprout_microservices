package dev.danwalkercs.sproutroute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@EnableDiscoveryClient
@SpringBootApplication
public class SproutRouteApplication {

	public static void main(String[] args) {
		SpringApplication.run(SproutRouteApplication.class, args);
	}

	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
		return builder.routes()
			.route("dumb-service", r -> r.path("/dumb-service")
				.uri("http://localhost:9000/service-instances/dumb-service"))
			.build();
	}
}
