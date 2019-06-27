package com.example.datosservidor.io;


import retrofit2.Call;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;


public interface ApiService {

    @GET("datosServidor")
    Call<RespuestaServidor> getDatos(@Header("Auto") String claveApi);
}
