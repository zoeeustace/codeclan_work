import React from 'react';
import SongItem from './SongItem';

const MusicList = ({songs}) => {

    const songItems = songs.map((song, index) => {
        return <SongItem song={song} key={index}/>
    })

    return ( 
        <div>
            <ol>
                {songItems}
            </ol>
        </div>

     );
}
 
export default MusicList;