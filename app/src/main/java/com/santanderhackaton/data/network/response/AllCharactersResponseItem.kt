package com.santanderhackaton.data.network.response

data class AllCharactersResponseItem(
    val actor: String? = null,
    val alive: Boolean? = null,
    val alternate_actors: List<String?>? = null,
    val alternate_names: List<String?>? = null,
    val ancestry: String? = null,
    val dateOfBirth: String? = null,
    val eyeColour: String? = null,
    val gender: String? = null,
    val hairColour: String? = null,
    val hogwartsStaff: Boolean? = null,
    val hogwartsStudent: Boolean? = null,
    val house: String? = null,
    val id: String? = null,
    val image: String? = null,
    val name: String? = null,
    val patronus: String? = null,
    val species: String? = null,
    val wand: Wand? = null,
    val wizard: Boolean? = null,
    val yearOfBirth: Int? = null
)