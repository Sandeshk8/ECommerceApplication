package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SwaggerConfig {
	
	@Bean
	public OpenAPI springShopOpenAPI() {
		return new OpenAPI().info(new Info().title("E-Commerce Application")
			.description("Backend APIs for E-Commerce app")
			.version("v1.0.0")
			.contact(new Contact().name("Sandesh kadam").url("https://sandeshk8.netlify.app/").email("sandeshkadam213@gmail.com"))
			.license(new License().name("github").url("https://github.com/Sandeshk8")))
			.externalDocs(new ExternalDocumentation().description("E-Commerce App Documentation")
			.url("http://localhost:8080/swagger-ui/index.html"));
	}
	
}
