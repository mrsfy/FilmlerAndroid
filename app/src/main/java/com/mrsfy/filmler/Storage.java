package com.mrsfy.filmler;

import com.mrsfy.filmler.contents.ContentStrategy;
import com.mrsfy.filmler.contents.Genres;
import com.mrsfy.filmler.contents.NowPlayings;
import com.mrsfy.filmler.contents.Populars;
import com.mrsfy.filmler.contents.Upcomings;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mrsfy on 4.02.2016.
 */
public class Storage {
    private static List<Genre> genres = new ArrayList<>();
    private static List<Movie> upcomings = new ArrayList<>();
    private static List<Movie> populars = new ArrayList<>();
    private static List<Movie> nowPlayings = new ArrayList<>();

    public static List<Genre> getGenres() {
        return genres;
    }

    public static List<Movie> getNowPlayings() {
        return nowPlayings;
    }


    public static List<Movie> getPopulars() {
        return populars;
    }


    public static List<Movie> getUpcomings() {
        return upcomings;
    }

    public static List<ContentStrategy> contentStrategies = new ArrayList<ContentStrategy>(){{
        add(new Genres());
        add(new NowPlayings());
        add(new Upcomings());
        add(new Populars());
    }};

}
