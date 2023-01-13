package com.example.rickandmortyproject.data.remote.api

import com.example.rickandmortyproject.data.remote.dtos.CharacterModel
import retrofit2.http.GET

interface CharacterApiService {
    @GET("character")
    suspend fun fetchCharacters() : CharacterModel
}