package com.mrsfy.filmler.contents;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.mrsfy.filmler.Config;
import com.mrsfy.filmler.Genre;
import com.mrsfy.filmler.Storage;
import com.mrsfy.filmler.network.VolleySingleton;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Created by mrsfy on 4.02.2016.
 */
public class Genres implements ContentStrategy {
    Context context;
    private void showErrorDialog(){
        new AlertDialog.Builder(context)
                .setTitle("Error")
                .setMessage("An error occured while processing request. Click OK to close app.")
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        ((Activity) context).finish();
                    }
                })
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
    }

    public void Genres(Context context){
        setContext(context);
    }

    public void Genres(){

    }

    @Override
    public void setContext(Context context) {
        this.context = context;
    }

    @Override
    public void getDataAndSetStorage() {

            final ProgressDialog progress = ProgressDialog.show(context, "Please wait...", "Fetching data...", false, false);

            JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(
                    Request.Method.GET,
                    Config.API_GENRES_URL,
                    new Response.Listener<JSONObject>() {
                        @Override
                        public void onResponse(JSONObject response) {
                            try {
                                JSONArray genresArray = response.getJSONArray("genres");
                                for (int i = 0; i < genresArray.length(); i++){
                                    JSONObject genreObj = genresArray.getJSONObject(i);
                                    Storage.getGenres().add(new Genre(genreObj.getInt("id"), genreObj.getString("name")));
                                }

                                for (Genre genre : Storage.getGenres()) {
                                    Log.i("Genre # "+ genre.getId(), genre.getName());
                                }
                                progress.dismiss();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    },
                    new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {
                            progress.dismiss();
                            showErrorDialog();
                            Log.i("volley", error.toString());
                        }
                    }
            );
            VolleySingleton.getInstance().getRequestQueue().add(jsonObjectRequest);

    }
}
