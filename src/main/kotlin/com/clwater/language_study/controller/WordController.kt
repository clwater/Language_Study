package com.clwater.language_study.controller

import com.clwater.language_study.Constancts
import com.clwater.language_study.enity.Word
import com.clwater.language_study.http.ResultModel
import com.clwater.language_study.mapper.WordMapper
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/word")
@Api("单词")
class WordController(
   @Autowired
   private val wordMapper: WordMapper
) {
    @ApiOperation(value="获取所有")
    @RequestMapping(value = "/list", method = arrayOf(RequestMethod.POST))
    fun wordList(@RequestParam page: Int) : ResponseEntity<ResultModel> {
        return ResultModel(wordMapper.list(Constancts.WORD_LIST_OFFSET, page * Constancts.WORD_LIST_OFFSET)).ok()
    }
}