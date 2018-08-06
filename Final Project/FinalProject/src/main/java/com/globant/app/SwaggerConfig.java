package com.globant.app;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@EnableAutoConfiguration
@ComponentScan(basePackageClasses = 
	    ApiController.class
	)
public class SwaggerConfig {

	@Bean
    public Docket newsApi() {
        return new Docket(DocumentationType.SWAGGER_2)
        		.groupName("FinalProject")
        		.apiInfo(apiInfo())
        		.directModelSubstitute(LocalDateTime.class, Date.class)
        		.select()
        		.build();
    }
	
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("FinalProject")
                .description("FinalProyect Swagger")
                .termsOfServiceUrl("http://globant.com")
                .version("1.0")
                .build();
    }
	
}
