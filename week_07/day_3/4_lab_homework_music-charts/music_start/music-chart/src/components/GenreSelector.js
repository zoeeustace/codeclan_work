import React from 'react';


const GenreSelector = ({genres, onGenreClicked}) => {

    const handleChange = (event) => {
        const chosenGenre = genres[event.target.value]
        onGenreSelected(chosenGenre)
    }

    return (  );
}
 
export default GenreSelector;