package com.clwater.language_study.http

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.web.servlet.config.annotation.InterceptorRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter


@Configuration
open class InterceptorConfig : WebMvcConfigurerAdapter() {
    override fun addCorsMappings(registry: CorsRegistry) {
//        registry.addMapping("/**")
//            .allowedOrigins("*", "http://127.0.0.1/")
//            .allowCredentials(true)
//            .allowedMethods("GET", "POST", "DELETE", "PUT")
//            .maxAge(3600)
    }

    override fun addInterceptors(registry: InterceptorRegistry) {
        registry.addInterceptor(LogCostInterceptor()).addPathPatterns("/**")
//        super.addInterceptors(registry)
    }
}
