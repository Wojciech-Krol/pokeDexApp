package com.wk.pokedex.data.model.abilityInfo

import com.wk.pokedex.data.model.commonModels.Name
import com.wk.pokedex.data.model.gamesInfo.Generation

data class Ability(
    val id: Int,
    val name: String,
    val is_main_series: Boolean,
    val generation: Generation,
    val names: List<Name>,
//    val effect_entries: List<VerboseEffect>
    val effect_changes: List<AbilityEffectChange>,
    val flavor_text_entries: List<AbilityFlavorText>,
    val pokemon: List<AbilityPokemon>
)
