package com.clwater.language_study.http

import com.fasterxml.jackson.databind.ObjectMapper
import com.google.gson.Gson
import org.springframework.web.servlet.HandlerInterceptor
import org.springframework.web.servlet.ModelAndView
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse


class LogCostInterceptor : HandlerInterceptor {
    @Throws(Exception::class)
    override fun preHandle(request: HttpServletRequest, response: HttpServletResponse, o: Any): Boolean {
        println(request.requestURL)
        return true
    }

    override fun postHandle(
        request: HttpServletRequest?,
        response: HttpServletResponse?,
        handler: Any?,
        modelAndView: ModelAndView?
    ) {
    }

    override fun afterCompletion(
        request: HttpServletRequest?,
        response: HttpServletResponse?,
        handler: Any?,
        ex: java.lang.Exception?
    ) {

    }
}