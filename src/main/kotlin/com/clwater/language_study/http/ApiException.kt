package com.clwater.language_study.http

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.MissingServletRequestParameterException
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.servlet.NoHandlerFoundException

//自定义api异常返回
public class ApiException(val code: ErrorCode, val data: Any? = null) : Exception(code.info)
 
@ControllerAdvice
public class GlobExceptionHandle  {
 
    @ExceptionHandler(ApiException::class)
    fun handleControllerException( ex: ApiException) = ResultModel(ex.data).send(ex.code)
 
    @ExceptionHandler(NoHandlerFoundException::class)
    fun handleNotFoundException(e: NoHandlerFoundException) : ResponseEntity<ResultModel> {
        val status = HttpStatus.NOT_FOUND
        return ResultModel().send(status.value(), e.message)
    }
    @ExceptionHandler(MissingServletRequestParameterException::class)
    fun handleMissingServletRequestParameterException(e: MissingServletRequestParameterException) : ResponseEntity<ResultModel> {
        val status = HttpStatus.BAD_REQUEST
        return ResultModel().send(status.value(), e.message)
    }
}