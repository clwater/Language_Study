package com.clwater.language_study.server.controller

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/test")
class HttpController() {

	@RequestMapping(path = ["/test"], method = [RequestMethod.GET])
	fun test(): String{
		return "test"
	}
}
