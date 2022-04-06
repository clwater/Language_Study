package com.clwater.language_study

import io.swagger.annotations.ApiOperation
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2

/*
  * 访问路径: http://localhost:5000/swagger-ui.html#/
 */
@EnableSwagger2 // 启用Swagger
@Configuration
open class SwaggerConfiguration {
    @Bean
    open fun createRestApi(): Docket {
        return  Docket(DocumentationType.SWAGGER_2).select()
            .apis(
                RequestHandlerSelectors
                .withMethodAnnotation(ApiOperation::class.java)).build();
    }

}