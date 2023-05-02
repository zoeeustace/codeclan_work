import React from 'react';

const Film = ({film}) =>{
    return(
        <div className="film">
        <a href={film.url}>{film.name}</a>
        </div>
    );
}

export default Film;