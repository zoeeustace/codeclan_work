import React from 'react';
import OptionItem from './OptionItem';

const PokemonSelector = ({pokemons, onPokemonClicked}) => {

    const allPokemon = []
    for(let pokeArray of pokemons){
        for(let pokeObj of pokeArray.results){
            allPokemon.push(pokeObj)}
    }

    const handleChange = (event) => {
        const chosenPokemon = allPokemon[event.target.value]
        onPokemonClicked(chosenPokemon)
    }

    // function sortedPokemon(pokemon) {
    //     return pokemon.charAt(0).toUpperCase() + pokemon.slice(1)
    // }

    const pokemonOptions = allPokemon.map((pokemon, index) => {
        return <OptionItem key={index} pokemon={pokemon} index={index}/>
    })

    return ( 
        <select defaultValue="" onChange={handleChange}>
            <option value="" selected>I choose you!</option>
            {pokemonOptions}
        </select>
    );
}
 
export default PokemonSelector;