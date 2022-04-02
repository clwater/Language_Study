package com.clwater.language_study.http

enum class ErrorCode(val code: Int, val info: String = "") {
    ERROR_OK(200),
    ERROR_DEFAULT(1001, "ERROR_DEFAULT")
}