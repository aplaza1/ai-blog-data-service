package com.example.aiblogdataservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.web.cors.CorsConfiguration
import org.springframework.web.cors.CorsConfigurationSource
import org.springframework.web.cors.UrlBasedCorsConfigurationSource
import java.util.*


@SpringBootApplication
class AiBlogDataServiceApplication

@Bean
fun corsConfigurationSource(): CorsConfigurationSource? {
    val configuration = CorsConfiguration()
    configuration.allowedOrigins = Arrays.asList("https://ai-blog-frontend-b47e4646b476.herokuapp.com")
    configuration.allowedMethods = Arrays.asList("GET", "POST", "PUT", "DELETE", "HEAD", "OPTIONS")
    configuration.allowedHeaders = Arrays.asList("Access-Control-Allow-Headers", "Access-Control-Allow-Origin",
            "Access-Control-Request-Method", "Access-Control-Request-Headers", "Origin",
            "Cache-Control", "Content-Type")
    val source = UrlBasedCorsConfigurationSource()
    source.registerCorsConfiguration("/**", configuration)
    return source
}

fun main(args: Array<String>) {
    runApplication<AiBlogDataServiceApplication>(*args)
}
