package com.wk.pokedex.data.model.commonModels

data class Language(
    val id: Int,
    val name: String,
    val official: Boolean,
    //two-letter code of the country where this language is spoken. Note that it is not unique.
    val iso639: String,
    //two-letter code of the language, not unique
    val iso3166: String,
    val names: List<Name>
)