package com.example.myaretro;

import static com.example.myaretro.ApiInterface.URL_BASE;

import retrofit2.Retrofit;

public class Api {
    public static ApiInterface getClient() {

        // change your base URL
        Retrofit adapter = new Retrofit.Builder()
               // .setEndpoint("http://mobileappdatabase.in/") //Set the Root URL

                .baseUrl(URL_BASE)
                .build(); //Finally building the adapter

        //Creating object for our interface
        ApiInterface api = adapter.create(ApiInterface.class);
        return api; // return the APIInterface object
    }
}
