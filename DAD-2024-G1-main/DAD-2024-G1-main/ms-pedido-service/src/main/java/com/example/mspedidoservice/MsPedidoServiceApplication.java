package com.example.mspedidoservice;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients
public class MsPedidoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsPedidoServiceApplication.class, args);
	}
	@Bean
	public OpenAPI custumOpenAPI() {
		return new OpenAPI().info(new Info()
				.title("OPEN API MICROSERVICIO PEDIDO")
				.version("0.0.1")
				.description("servivio web pedido")
				.termsOfService("http://swagger.io/terms")
				.license(new License().name("Apache 2.0")
						.url("http://springdoc.org"))
		);
	}

}
