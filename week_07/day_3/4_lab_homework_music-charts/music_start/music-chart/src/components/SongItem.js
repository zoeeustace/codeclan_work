import React from 'react';

const SongItem = ({song}) => {
    return <li class="song-item">{song.title.label} <img id="album-img" src={song["im:image"][0].label}/>
    <audio controls>
        <source src={song["link"][1]["attributes"]["href"]} type="audio/mp4"></source>
    </audio>
    </li>;
}
 
export default SongItem;