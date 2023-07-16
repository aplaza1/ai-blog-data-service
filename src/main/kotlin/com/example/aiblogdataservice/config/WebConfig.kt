package com.example.aiblogdataservice.config

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
class WebConfig : WebMvcConfigurer {

    override fun addCorsMappings(registry: CorsRegistry) {
        registry.addMapping("/**")
                .allowedOrigins("https://ai-blog-frontend-b47e4646b476.herokuapp.com")
                .allowedOrigins("http://alexplaza.me")
                .allowedOrigins("https://alexplaza.me")
                .allowedOrigins("https://www.postscribbled.com")
                .allowedMethods("*")
    }
}