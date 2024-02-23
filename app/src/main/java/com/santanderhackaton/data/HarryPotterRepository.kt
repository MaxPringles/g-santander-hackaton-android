package com.santanderhackaton.data

import com.santanderhackaton.data.network.HarryPotterApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class HarryPotterRepository @Inject constructor(
    private val harryPotterApi: HarryPotterApi
) {
    suspend fun getAllCharacters(): Int {
        return withContext(Dispatchers.IO) {
            harryPotterApi.getAllCharacters().code()
        }
    }

    suspend fun getCharacter(): Int {
        return withContext(Dispatchers.IO) {
            harryPotterApi.getCharacter().code()
        }
    }

    suspend fun getHogwartsStudents(): Int {
        return withContext(Dispatchers.IO) {
            harryPotterApi.getHogwartsStudents().code()
        }
    }

    suspend fun getHogwartsStaff(): Int {
        return withContext(Dispatchers.IO) {
            harryPotterApi.getStaffHogwartsStaff().code()
        }
    }

    suspend fun getCharactersInHouse(): Int {
        return withContext(Dispatchers.IO) {
            harryPotterApi.getCharactersInHouse().code()
        }
    }

    suspend fun getAllSpells(): Int {
        return withContext(Dispatchers.IO) {
            harryPotterApi.getSpells().code()
        }
    }
}
