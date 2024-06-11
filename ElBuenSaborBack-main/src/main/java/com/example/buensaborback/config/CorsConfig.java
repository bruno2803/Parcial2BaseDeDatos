//package com.example.buensaborback.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration
//public class CorsConfig {
//
//    @Bean
//    public WebMvcConfigurer corsConfigurer() {
//        return new WebMvcConfigurer() {
//            @Override
//            public void addCorsMappings(CorsRegistry registry) {
//                registry.addMapping("/**") // Esto permite CORS en todas las rutas
//                        .allowedOriginPatterns("http://localhost:5173") // Agrega tus orígenes permitidos aquí
//                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Métodos HTTP permitidos
//                        .allowedHeaders("*") // Permitir todos los encabezados
//                        .allowCredentials(true); // Permitir credenciales
//            }
//        };
//    }
//}
