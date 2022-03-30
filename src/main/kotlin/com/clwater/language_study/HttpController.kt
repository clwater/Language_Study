package com.clwater.language_study

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/test")
class HttpController() {

	@RequestMapping("/test")
	fun test(): String{
		return "test"
	}
}

@RestController
class MainController() {

	@RequestMapping("/")
	fun welcome(): String{
		return "welcome"
	}
}
