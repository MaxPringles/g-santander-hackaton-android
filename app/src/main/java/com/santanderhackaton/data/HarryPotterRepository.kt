package com.santanderhackaton.data

import com.santanderhackaton.data.network.HarryPotterService
import javax.inject.Inject

class HarryPotterRepository @Inject constructor(
    private val api: HarryPotterService
) {
    suspend fun getAllCharacters(): Int {
        return api.getAllCharacters()
    }

    suspend fun getCharacter(): Int {
        return api.getCharacter()
    }

    suspend fun getHogwartsStudents(): Int {
        return api.getHogwartsStudents()
    }

    suspend fun getHogwartsStaff(): Int {
        return api.getHogwartsStaff()
    }

    suspend fun getCharactersInHouse(): Int {
        return api.getCharactersInHouse()
    }

    suspend fun getAllSpells(): Int {
        return api.getAllSpells()
    }
}
