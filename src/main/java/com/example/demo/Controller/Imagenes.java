package com.example.demo.Controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class Imagenes implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // Esto le dice a Java: "Cualquier petición a /imagenes/..., búscala en la carpeta física 'uploads/'"
        registry.addResourceHandler("/imagenes/**")
                .addResourceLocations("file:uploads/");
    }
}