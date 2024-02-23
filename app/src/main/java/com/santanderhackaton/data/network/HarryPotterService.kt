package com.santanderhackaton.data.network

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class HarryPotterService @Inject constructor(
    private val harryPotterApi: HarryPotterApi
) {

    suspend fun getAllCharacters(): Int {
        return withContext(Dispatchers.IO) {
            harryPotterApi.getAllCharacters().code()
        }
    }
}