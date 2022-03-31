package com.clwater.language_study

import com.clwater.language_study.mapper.TestMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/test")
class HttpController(
	@Autowired
	private val testMapper: TestMapper
) {


	@RequestMapping("/test")
	fun test(): String{
		return testMapper.test()?.get(0).toString()
	}
}

@RestController
class MainController() {

	@RequestMapping("/")
	fun welcome(): String{
		return "welcome"
	}
}
