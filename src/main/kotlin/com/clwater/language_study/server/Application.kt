package com.clwater.language_study.server

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class Application {
	companion object {
		@JvmStatic fun main(args: Array<String>) {
			runApplication<Application>(*args)
//			SpringApplication.run(Application::class.java, *args)
		}
	}
}