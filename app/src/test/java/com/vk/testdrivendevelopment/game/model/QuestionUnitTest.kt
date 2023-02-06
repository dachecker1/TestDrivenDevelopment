package com.vk.testdrivendevelopment.game.model

import org.junit.Assert
import org.junit.Test

class QuestionUnitTest {

    @Test
    fun whenCreatingQuestion_shouldNotHaveAnsweredOption(){
        val question = Question("CORRECT", "INCORRECT")
        Assert.assertNull(question.answeredOption)
    }

    @Test
    fun whenAnswering_shouldHaveAnsweredOption(){
        val question = Question("CORRECT", "INCORRECT")
        question.answer("INCORRECT")
        Assert.assertEquals("INCORRECT", question.answeredOption)
    }
}