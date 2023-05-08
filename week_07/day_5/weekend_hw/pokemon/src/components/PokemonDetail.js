
import React from 'react';

const PokemonDetail = ({pokemon}) => {

    // const pokemonArray = fetch(pokemon.url)


    // if(details){
    //     var detailElements = details.map((detail) => {
    //         console.log(detail.targets.weight);
    //         return(
    //             <div>
    //                 <p>{detail.targets.weight}</p>
    //             </div>
    //         )
    //     })
    // }

    // const handleDetailsClicked = () => {
    //     onDetailsClicked()
    // }

    return ( 
        <>
        <div className="pokemon-detail">
        You've come across a wild {pokemon.name}!<br></br>
        {/* Weight: {pokemonArray.weight} */}
        {/* Weight: {details.types.weight} */}
        </div>
        {/* {detailElements? <div className="details">{detailElements}</div> : null} */}
        </>
    );
}
 
export default PokemonDetail;