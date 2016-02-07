package com.mrsfy.filmler;

/**
 * Created by mrsfy on 4.02.2016.
 */
public class Config {
    public static final String POSTER_PATH_PREFIX = "https://image.tmdb.org/t/p/w500_and_h281_bestv2";
    public static final String API_KEY = "229a2bffcae1db260a72f3fda46d8f87";
    public static final String API_GENRES_URL = "http://api.themoviedb.org/3/genre/movie/list?api_key=" + API_KEY;
    public static final String API_UPCOMINGS_URL = "http://api.themoviedb.org/3/movie/upcoming?api_key=" + API_KEY;
    public static final String API_POPULARS_URL = "http://api.themoviedb.org/3/movie/popular?api_key=" + API_KEY;
    public static final String API_NOW_PLAYINGS_URL = "http://api.themoviedb.org/3/movie/now_playing?api_key=" + API_KEY;
}
