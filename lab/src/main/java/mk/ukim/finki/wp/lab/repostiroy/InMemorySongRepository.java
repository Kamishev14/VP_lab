package mk.ukim.finki.wp.lab.repostiroy;


import mk.ukim.finki.wp.lab.bootstrap.DataHolder;
import mk.ukim.finki.wp.lab.model.Artist;
import mk.ukim.finki.wp.lab.model.Song;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class InMemorySongRepository {

    public List<Song> findAll() {
        return DataHolder.songList;
    }

    public Song findByTrackId(String trackId) {
        return DataHolder.songList.stream().filter(s -> s.getTrackId().equals(trackId)).findFirst().orElse(null);
    }

    public Artist addArtistToSong(Song song, Artist artist) {
        for (Song s : DataHolder.songList) {
            if (s.getTrackId().equals(song.getTrackId())) {
                s.addPerformer(artist);
                return artist;
            }
        }
        return null;
    }

}