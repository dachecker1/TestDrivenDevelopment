package com.vk.testdrivendevelopment.game.model

class Game {
    var currentScore = 0
    private set

    fun incrementScore(){
        currentScore++
    }
}