package com.in28minutes.rest.webservices.restfulwebservices.basic.auth;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc

public class SpringMvcConfigurationCors implements WebMvcConfigurer {

    public void addCorsMappings(CorsRegistry registry){

        registry.addMapping("/**")
                //.allowedOrigins("http://lemon-admin.lemon.education")
                .allowedOrigins(("http://localhost:4200"))
                .allowedMethods("PUT", "DELETE", "POST", "GET", "HEAD")
                .allowCredentials(true).maxAge(3600);
    }
}
