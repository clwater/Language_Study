package com.clwater.language_study.controller

import com.clwater.language_study.enity.Word
import com.clwater.language_study.http.ResultModel
import com.clwater.language_study.mapper.WordMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/word")
class WordController(
   @Autowired
   private val wordMapper: WordMapper
) {
    @RequestMapping("/list")
    fun wordList() : ResponseEntity<ResultModel> {
        return ResultModel(wordMapper.list()).ok()
    }
}