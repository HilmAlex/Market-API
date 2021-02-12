package com.company.market.web.config;

import org.hibernate.boot.Metadata;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiKey;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.Arrays;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .securitySchemes(Arrays.asList(apiKey())) //Añadir autorizacion a un controlador
                .select().apis(RequestHandlerSelectors.basePackage("com.company.market.web.controller"))
                .build();
    }

    //Añadir autorizacion a un controlador
    private ApiKey apiKey(){
        return new ApiKey("JWT", "Authorization", "header");
    }

    /*  AÑADIR AUTORIZACION GLOBAL

  private static final Set<String> DEFAULT_PRODUCES_CONSUMES = new HashSet<String>(Arrays.asList("application/json"));
  @Bean
  public Docket api() {
    ParameterBuilder parameterBuilder = new ParameterBuilder();
    parameterBuilder.name("Authorization")
		    .modelRef(new ModelRef("string"))
		    .parameterType("header")
		    .description("JWT token")
		    .required(true)
		    .build();
    List<Parameter> parameters = new ArrayList<>();
    parameters.add(parameterBuilder.build());
    return new Docket(DocumentationType.SWAGGER_2).apiInfo(DEFAULT_API_INFO)
	    .produces(DEFAULT_PRODUCES_CONSUMES)
	    .consumes(DEFAULT_PRODUCES_CONSUMES)
	    .select()
	    .build()
	    // Setting globalOperationParameters ensures that authentication header is applied to all APIs
	    .globalOperationParameters(parameters);
  }
}
     */
}
