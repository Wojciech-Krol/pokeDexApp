package com.wk.pokedex.data.model.pokemonInfo

import com.wk.pokedex.data.model.abilityInfo.Ability

data class PokemonAbility(
    val is_hidden: Boolean,
    val slot: Int,
    val ability: Ability,
)
