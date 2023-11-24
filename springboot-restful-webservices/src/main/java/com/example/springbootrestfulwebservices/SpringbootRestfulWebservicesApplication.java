package com.example.springbootrestfulwebservices;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Spring boot REST API Documentation",
				description = "Spring boot REST API Documentation Demo",
				version = "v1.0",
				contact = @Contact(
						name = "Maha",
						email = "mahalakshminadigatla2001@gmail.com"
				),
				license = @License(
						name = "Apache 2.0"

				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Spring boot User Management Documentation Demo",
				url = "https://wwww.udemy.com"
		)
)
public class SpringbootRestfulWebservicesApplication {

	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRestfulWebservicesApplication.class, args);
	}

}
