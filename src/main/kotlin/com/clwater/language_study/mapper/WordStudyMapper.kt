package com.clwater.language_study.mapper

import com.clwater.language_study.enity.Word
import com.clwater.language_study.enity.WordStudy
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param
import org.apache.ibatis.annotations.Select

@Mapper
interface WordStudyMapper {
    @Select("SELECT t1.id, word, translate, eg, word_src, category, learn_order, phonetic_symbol\n" +
            "FROM word AS t1\n" +
            "         JOIN (SELECT ROUND(RAND() * (SELECT MAX(id) FROM word)) AS id) AS t2\n" +
            "WHERE t1.id >= t2.id\n" +
            "  and t1.id not in (select word_id from study_word)\n" +
            "ORDER BY t1.id\n" +
            "LIMIT 1;\n" +
            "\n")
    fun random(): List<Word>
}