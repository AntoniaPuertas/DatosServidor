package com.example.datosservidor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.datosservidor.io.ApiService;
import com.example.datosservidor.io.MyApiAdapter;
import com.example.datosservidor.io.RespuestaServidor;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvListaVillanos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvListaVillanos = findViewById(R.id.rvListaVillanos);
    }

    private void getDatos(){


        Retrofit retrofit = new MyApiAdapter().getDatosServidor();
        ApiService service = retrofit.create(ApiService.class);

        Call<RespuestaServidor> call = service.getDatos("2F4A58256CF53C5AF94D8BA7A9D08DB0");

        call.enqueue(new Callback<RespuestaServidor>() {
            @Override
            public void onResponse(Call<RespuestaServidor> call, Response<RespuestaServidor> response) {
                if(response.body() == null){
                    //el servidor no responde
                }else{
                    int estado = response.body().getEstado();
                    if(estado == 0) {
                        Datos.setListaVillanos(response.body().getMensaje().getVillanos());

                    }else{
                        //error en la respuesta
                    }
                }
            }

            @Override
            public void onFailure(Call<RespuestaServidor> call, Throwable t) {
                System.out.println(t.toString());
                Toast.makeText(MainActivity.this,"Comprueba tu conexión a internet", Toast.LENGTH_LONG).show();

            }
        });
    }
}
