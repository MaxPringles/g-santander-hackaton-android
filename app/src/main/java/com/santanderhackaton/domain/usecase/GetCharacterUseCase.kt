package com.santanderhackaton.domain.usecase

import com.santanderhackaton.data.HarryPotterRepository
import javax.inject.Inject

class GetCharacterUseCase @Inject constructor(
    private val repository: HarryPotterRepository
) {

    suspend fun invoke(): GetCharacterResult? {
        val response = repository.getCharacter()

        return try {
            if (response == 200) {
                GetCharacterResult.Success(response)
            } else {
                GetCharacterResult.DefaultError(response)
            }
        } catch (e: Exception) {
            GetCharacterResult.DefaultError(response)
        }
    }
}

sealed class GetCharacterResult {
    data class Success(val code: Int):  GetCharacterResult()
    data class DefaultError(val code: Int) : GetCharacterResult()
}