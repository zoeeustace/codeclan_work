import React, {useState, useEffect} from 'react';
import MusicList from '../components/MusicList';

const MusicContainer = () => {
    const [songs, setSongs] = useState([]);
    // const [genres, setGenres] = useState([]);
    const [selectedGenre, setSelectedGenre] = useState(null)

    useEffect(() => {
        getSongs(); //loadSongs(genres[0].url)}, [genres]
    },[])

    // const onGenreClicked = (genre) => {
    //     setSelectedGenre(genre)
    // }

    // genres as an array of objects with the APIs in there

    const getSongs = function(){ //loadSongs
        fetch("https://itunes.apple.com/gb/rss/topsongs/limit=20/json")
        .then(res => res.json())
        .then(songs => setSongs(songs.feed.entry))
    }
    


    return ( 
        <div className="music-container">
            
            <MusicList songs={songs}/>
        </div>
     );
}
 
export default MusicContainer;