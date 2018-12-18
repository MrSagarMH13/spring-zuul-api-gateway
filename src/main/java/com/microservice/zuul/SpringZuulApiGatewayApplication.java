package com.microservice.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.microservice.zuul.filters.ErrorFilter;
import com.microservice.zuul.filters.PostFilter;
import com.microservice.zuul.filters.PreFilter;
import com.microservice.zuul.filters.RouteFilter;

@SpringBootApplication
@EnableZuulProxy
public class SpringZuulApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringZuulApiGatewayApplication.class, args);
	}

	@Bean
	public PreFilter preFilter() {
		return new PreFilter();
	}

	@Bean
	public PostFilter postFilter() {
		return new PostFilter();
	}

	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}

	@Bean
	public RouteFilter routeFilter() {
		return new RouteFilter();
	}
}
