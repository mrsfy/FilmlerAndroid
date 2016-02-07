package com.mrsfy.filmler;

import java.util.Date;
import java.util.List;

/**
 * Created by mrsfy on 4.02.2016.
 */
public class Movie {

    private int id;
    private String title;
    private String overview;
    private String posterUrl;
    private String originalLanguage;
    private String originalTitle;
    private String releaseDate;
    private double popularity;
    private double voteAvarage;
    private int voteCount;
    private int[] genreIds;


    public Movie(
            int id,
            String title,
            String overview,
            String posterPath,
            String originalLanguage,
            String originalTitle,
            String releaseDate,
            double popularity,
            int[] genreIds,
            int voteCount,
            double voteAvarage
    ) {
        this.id = id;
        this.title = title;
        this.originalTitle = originalTitle;
        this.originalLanguage = originalLanguage;
        this.overview = overview;
        this.posterUrl = Config.POSTER_PATH_PREFIX + posterPath;
        this.genreIds = genreIds;
        this.voteCount = voteCount;
        this.voteAvarage = voteAvarage;
        this.popularity = popularity;
        this.releaseDate = releaseDate;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getOverview() {
        return overview;
    }

    public String getPosterUrl() {
        return posterUrl;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public double getPopularity() {
        return popularity;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public double getVoteAvarage() {
        return voteAvarage;
    }

    public int getVoteCount() {
        return voteCount;
    }

    public int[] getGenreIds() {
        return genreIds;
    }
}
