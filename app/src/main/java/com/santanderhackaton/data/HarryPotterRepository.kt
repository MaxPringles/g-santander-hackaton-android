package com.santanderhackaton.data

import com.santanderhackaton.data.network.HarryPotterService
import javax.inject.Inject

class HarryPotterRepository @Inject constructor(
    private val api: HarryPotterService
) {

    suspend fun getAllCharacters(): Int {
        return api.getAllCharacters()
    }
}