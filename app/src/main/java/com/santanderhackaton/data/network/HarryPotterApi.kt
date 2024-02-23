package com.santanderhackaton.data.network

import com.santanderhackaton.data.network.response.CharacterResponse
import com.santanderhackaton.data.network.response.SpellResponse
import retrofit2.Response
import retrofit2.http.GET

interface HarryPotterApi {
    @GET("/characters")
    suspend fun getAllCharacters(): Response<CharacterResponse>

    @GET("/9e3f7ce4-b9a7-4244-b709-dae5c1f1d4a8")
    suspend fun getCharacter(): Response<CharacterResponse>

    @GET("/characters/students")
    suspend fun getHogwartsStudents(): Response<CharacterResponse>

    @GET("/characters/staff")
    suspend fun getStaffHogwartsStaff(): Response<CharacterResponse>

    @GET("/characters/house/gryffindor")
    suspend fun getCharactersInHouse(): Response<CharacterResponse>

    @GET("/spells")
    suspend fun getSpells(): Response<SpellResponse>
}