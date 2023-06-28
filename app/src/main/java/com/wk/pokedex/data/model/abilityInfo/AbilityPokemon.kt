package com.wk.pokedex.data.model.abilityInfo

import com.wk.pokedex.data.model.pokemonInfo.Pokemon

data class AbilityPokemon(
    val is_hidden: Boolean,
    val slot: Int,
    val pokemon: Pokemon
)
