package com.clwater.language_study.mapper

import com.clwater.language_study.enity.Word
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param
import org.apache.ibatis.annotations.Select

@Mapper
interface WordMapper {
    @Select("select * from word order by id limit  10 offset #{page}")
    fun list(@Param("page") page: Int): List<Word>
}