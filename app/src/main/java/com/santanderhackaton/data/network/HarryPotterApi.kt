package com.santanderhackaton.data.network

import com.santanderhackaton.data.network.response.AllCharactersResponse
import retrofit2.Response
import retrofit2.http.GET

interface HarryPotterApi {
    @GET("/characters")
    suspend fun getAllCharacters(): Response<AllCharactersResponse>
}