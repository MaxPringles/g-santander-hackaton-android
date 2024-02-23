package com.santanderhackaton.domain.usecase

import com.santanderhackaton.data.HarryPotterRepository
import javax.inject.Inject

class GetAllSpellsUseCase @Inject constructor(
    private val repository: HarryPotterRepository
) {

    suspend fun invoke(): GetAllSpellsResult? {
        val response = repository.getAllSpells()

        return try {
            if (response == 200) {
                GetAllSpellsResult.Success(response)
            } else {
                GetAllSpellsResult.DefaultError(response)
            }
        } catch (e: Exception) {
            GetAllSpellsResult.DefaultError(response)
        }
    }
}

sealed class GetAllSpellsResult {
    data class Success(val code: Int):  GetAllSpellsResult()
    data class DefaultError(val code: Int) : GetAllSpellsResult()
}