package com.wk.pokedex.data.model.pokemonInfo

import com.wk.pokedex.data.model.commonModels.Name

data class PokemonForm(
    val id: Int,
    val name: String,
    val order: Int,
    val form_order: Int,
    val is_default: Boolean,
    val is_battle_only: Boolean,
    val is_mega: Boolean,
    val form_name: String,
    val pokemon: Pokemon,
//    val types: List<PokemonFormType>
//    val sprites: PokemonFormSprites,
//    val version_group: VersionGroup,
    val names: List<Name>,
    val form_names: List<Name>
)
