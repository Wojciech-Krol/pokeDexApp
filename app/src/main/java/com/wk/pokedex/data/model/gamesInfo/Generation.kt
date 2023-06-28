package com.wk.pokedex.data.model.gamesInfo

import com.wk.pokedex.data.model.abilityInfo.Ability
import com.wk.pokedex.data.model.commonModels.Name

data class Generation(
    val id: Int,
    val name: String,
    val abilities: List<Ability>,
    val names: List<Name>,
//    val main_region: Region,
//    val moves: List<Move>,
//    val pokemon_species: List<PokemonSpecies>,
//    val types: List<Type>,
//    val version_groups: List<VersionGroup>
)
