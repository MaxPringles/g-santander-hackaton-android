package com.santanderhackaton.data.network.response

data class CharacterResponseItem(
    val actor: String? = "",
    val alive: Boolean? = false,
    val alternate_actors: List<Any>? = listOf(),
    val alternate_names: List<String>? = listOf(),
    val ancestry: String? = "",
    val dateOfBirth: String? = "",
    val eyeColour: String? = "",
    val gender: String? = "",
    val hairColour: String? = "",
    val hogwartsStaff: Boolean? = false,
    val hogwartsStudent: Boolean? = false,
    val house: String? = "",
    val id: String? = "",
    val image: String? = "",
    val name: String? = "",
    val patronus: String? = "",
    val species: String? = "",
    val wand: Wand? = Wand(),
    val wizard: Boolean? = false,
    val yearOfBirth: Int? = 0
)