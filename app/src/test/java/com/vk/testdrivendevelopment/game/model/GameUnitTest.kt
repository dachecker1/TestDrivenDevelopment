package com.vk.testdrivendevelopment.game.model

import org.junit.Assert
import org.junit.Test

class GameUnitTest {

    @Test
    fun whenIncrementingScore_shouldIncrementCurrentScore(){
        val game = Game()
        game.incrementScore()
        Assert.assertEquals("Current score should have been 1",1, game.currentScore)
    }

    @Test
    fun whenIncrementingScore_aboveHighScore_shouldAlsoIncrementHighScore(){
        val game = Game()
        game.incrementScore()
        Assert.assertEquals(1, game.highestScore)
    }
}