package com.example.rickandmortyproject.data.repositories

import com.example.rickandmortyproject.data.base.BaseRepository
import com.example.rickandmortyproject.data.remote.api.CharacterApiService
import javax.inject.Inject

class CharacterRepositoriesImpl @Inject constructor(
    private val charactersApi: CharacterApiService
) : BaseRepository() {

}