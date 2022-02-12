package com.example.myaretro;

import retrofit2.Callback;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiInterface {
    String URL_BASE = "https://192.168.43.202:80/htdocs/";


    @FormUrlEncoded // annotation used in POST type requests
    @POST("coninsertdata.php")     // API's endpoints
    public void registration(@Field("name") String name,
                             @Field("email") String email,
                             @Field("password") String password,
                             @Field("logintype") String logintype,
                             Callback<SignUpResponse> callback);

}
