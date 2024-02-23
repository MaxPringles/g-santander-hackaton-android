package com.santanderhackaton.domain.usecase

import com.santanderhackaton.data.HarryPotterRepository
import javax.inject.Inject

class GetHogwartsStudentsUseCase @Inject constructor(
    private val repository: HarryPotterRepository
) {

    suspend fun invoke(): GetHogwartsStudentsResult? {
        val response = repository.getHogwartsStudents()

        return try {
            if (response == 200) {
                GetHogwartsStudentsResult.Success(response)
            } else {
                GetHogwartsStudentsResult.DefaultError(response)
            }
        } catch (e: Exception) {
            GetHogwartsStudentsResult.DefaultError(response)
        }
    }
}

sealed class GetHogwartsStudentsResult {
    data class Success(val code: Int):  GetHogwartsStudentsResult()
    data class DefaultError(val code: Int) : GetHogwartsStudentsResult()
}