package com.clwater.language_study.mapper

import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Select

@Mapper
interface TestMapper {
    @Select("select * from test")
    fun test(): List<String?>?
}