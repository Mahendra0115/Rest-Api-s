package com.healthcare.bean.springconfig;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Psychologist-Backend")
                        .version("1.0")
                        .description("Successfully User can Signin and Login with Sequre "));
    }


    @Bean
    public GroupedOpenApi publicApi(){
          return GroupedOpenApi.builder()
                  .group("public")
                  .pathsToMatch("/**")
                  .build();
    }
}
