package com.santanderhackaton.domain.usecase

import com.santanderhackaton.data.HarryPotterRepository
import javax.inject.Inject

class GetCharactersInHouseUseCase @Inject constructor(
    private val repository: HarryPotterRepository
) {

    suspend fun invoke(): GetCharactersInHouseResult? {
        val response = repository.getCharactersInHouse()

        return try {
            if (response == 200) {
                GetCharactersInHouseResult.Success(response)
            } else {
                GetCharactersInHouseResult.DefaultError(response)
            }
        } catch (e: Exception) {
            GetCharactersInHouseResult.DefaultError(response)
        }
    }
}

sealed class GetCharactersInHouseResult {
    data class Success(val code: Int):  GetCharactersInHouseResult()
    data class DefaultError(val code: Int) : GetCharactersInHouseResult()
}