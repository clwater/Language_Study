package com.clwater.language_study.controller

import com.clwater.language_study.Constancts
import com.clwater.language_study.enity.Word
import com.clwater.language_study.http.ResultModel
import com.clwater.language_study.mapper.WordMapper
import com.clwater.language_study.mapper.WordStudyMapper
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/word/study")
@Api("单词学习")
class WordStudyController(
   @Autowired
   private val wordStudyMapper: WordStudyMapper
) {
    @ApiOperation(value="一个随机")
    @RequestMapping(value = "/random", method = arrayOf(RequestMethod.POST))
    fun wordList() : ResponseEntity<ResultModel> {
        val word = wordStudyMapper.random()
        return ResultModel(word[0]).ok()
    }
}