package com.wk.pokedex.data.model.pokemonInfo

data class Pokemon(
    val id: Int,
    val name: String,
    val base_experience: Int,
    val height: Int,
    val is_default: Boolean,
    val order: Int,
    val weight: Int,
    val abilities: List<PokemonAbility>,
    val forms: List<PokemonForm>,
//    val game_indices: List<PokemonGameIndex>,
//    val held_items: List<PokemonHeldItem>,
//    val location_area_encounters: String,
//    val moves: List<PokemonMove>,
//    val past_types: List<PokemonTypePast>,
//    val sprites: PokemonSprites,
//    val species: PokemonSpecies,
//    val stats: List<PokemonStat>,
//    val types: List<PokemonType>
)
