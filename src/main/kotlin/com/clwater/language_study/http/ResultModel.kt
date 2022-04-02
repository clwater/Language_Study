package com.clwater.language_study.http

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity

class ResultModel @JvmOverloads constructor(val data: Any? = null) {
    var code: Int? = null
        private set
    var msg: String? = null
        private set
    private fun createRespone(rsp : ResultModel) = ResponseEntity(rsp, HttpStatus.OK)
    fun send(err: ErrorCode): ResponseEntity<ResultModel> {
        this.code = err.code
        this.msg = err.info
        return createRespone(this)
    }
    fun send(code: Int, info: String?) : ResponseEntity<ResultModel> {
        this.code = code
        this.msg = info
        return createRespone(this)
    }
    fun ok() = send(ErrorCode.ERROR_OK)
}