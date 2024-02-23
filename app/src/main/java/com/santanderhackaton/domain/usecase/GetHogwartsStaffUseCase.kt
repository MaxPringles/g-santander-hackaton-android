package com.santanderhackaton.domain.usecase

import com.santanderhackaton.data.HarryPotterRepository
import javax.inject.Inject

class GetHogwartsStaffUseCase @Inject constructor(
    private val repository: HarryPotterRepository
) {

    suspend fun invoke(): GetHogwartsStaffResult? {
        val response = repository.getHogwartsStaff()

        return try {
            if (response == 200) {
                GetHogwartsStaffResult.Success(response)
            } else {
                GetHogwartsStaffResult.DefaultError(response)
            }
        } catch (e: Exception) {
            GetHogwartsStaffResult.DefaultError(response)
        }
    }
}

sealed class GetHogwartsStaffResult {
    data class Success(val code: Int):  GetHogwartsStaffResult()
    data class DefaultError(val code: Int) : GetHogwartsStaffResult()
}