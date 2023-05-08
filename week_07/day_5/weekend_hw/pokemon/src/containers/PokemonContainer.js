import React, {useState, useEffect} from 'react';
import PokemonSelector from '../components/PokemonSelector';
import PokemonDetail from '../components/PokemonDetail';
import logo from '../img/pokemon-logo.png';

const PokemonContainer = () => {
    const [pokemons, setPokemons] = useState([]);
    const [selectedPokemon, setSelectedPokemon] = useState(null);
    // const [details, setDetails] = useState(null);

    useEffect(() => {
        getAllPokemon()
    },[])

    // useEffect(() => {
    //     getRelatedDetails()
    // })

    // const getRelatedDetails = () => {
    //     for(let details of selectedPokemon.url){
    //         console.log(details);
    //         fetch(details)
    //         .then((result) => result.json())
    //         .then(data => setDetails(data))
    //     }
    //     console.log("details", details);
    // }


    const getAllPokemon = () => {
        const allRequests = []
        for(let i = 0; i <= 1; i++){
        const newFetch = fetch("https://pokeapi.co/api/v2/pokemon")
        .then(response => response.json())
        allRequests.push(newFetch)
    }
    Promise.all(allRequests)
    .then(data => setPokemons(data))
    // .then(data => {const pokemonUrl = data.url;
    //     console.log(pokemonUrl);
    //     return fetch('${pokemonUrl}');
    //     })
    // .then(response => response.json())
    // .catch(err => {
    // console.error('Request failed', err)
    // })

    }

    //     const getDetails = (selectedPokemon) => {
    //     fetch("https://pokeapi.co/api/v2/pokemon/" + {selectedPokemon})
    //     .then(response => response.json())
    //     .then(details => setDetails(details))
    // }


    const onPokemonClicked = (pokemon) => {
        setSelectedPokemon(pokemon)
    }

    return (
        <div className="total-page">
        <div className="title">
            <img src={logo} alt="logo" className="logo"/>
        </div>
        <div className="pokemon-container">
        <h1>Pick a pokemon!</h1>
                {pokemons.length> 1 ? <PokemonSelector pokemons={pokemons} onPokemonClicked={onPokemonClicked} className="selector"/> : null}
                {selectedPokemon? <PokemonDetail pokemon={selectedPokemon} className="details"/> : null}
            </div>
        </div>
     );
}
 
export default PokemonContainer;