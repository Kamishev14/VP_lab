package mk.ukim.finki.wp.lab.model;


import lombok.Data;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Data
public class Song {
    @Getter
    private String trackId;
    @Getter
    private String title;
    @Getter
    private String genre;
    @Getter
    private int releaseYear;
    List<Artist> performers;

    public Song() {
    }

    public Song(String trackId, String title, String genre, int releaseYear) {
        this.trackId = trackId;
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;

        performers = new ArrayList<>();
    }

    public void setTrackId(String trackId) {
        this.trackId = trackId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void addPerformer(Artist performer) {
        performers.add(performer);
    }
}