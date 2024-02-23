package com.santanderhackaton.domain.usecase

import com.santanderhackaton.data.HarryPotterRepository
import javax.inject.Inject

class GetAllCharactersUseCase @Inject constructor(
    private val repository: HarryPotterRepository
) {

    suspend fun invoke(): GetAllCharactersResult? {
        val response = repository.getAllCharacters()

        return try {
            if (response == 200) {
                GetAllCharactersResult.Success(response)
            } else {
                GetAllCharactersResult.DefaultError(response)
            }
        } catch (e: Exception) {
            GetAllCharactersResult.DefaultError(response)
        }
    }
}

sealed class GetAllCharactersResult {
    data class Success(val code: Int):  GetAllCharactersResult()
    data class DefaultError(val code: Int) : GetAllCharactersResult()
}