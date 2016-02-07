package com.mrsfy.filmler.network;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.mrsfy.filmler.App;

/**
 * Created by mrsfy on 24.01.2016.
 */
public class VolleySingleton {
    private static VolleySingleton sInstance;
    private RequestQueue mRequestQueue;

    private VolleySingleton(){
        mRequestQueue = Volley.newRequestQueue(App.getAppContext());
    }

    public static VolleySingleton getInstance(){
        if (sInstance == null){
            sInstance = new VolleySingleton();
        }
        return sInstance;
    }

    public RequestQueue getRequestQueue(){
        return mRequestQueue;
    }

}
