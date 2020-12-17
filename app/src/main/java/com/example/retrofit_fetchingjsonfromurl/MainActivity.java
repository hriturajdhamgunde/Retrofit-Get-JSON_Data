package com.example.retrofit_fetchingjsonfromurl;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Api.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        //Build API
        Api api = retrofit.create(Api.class);

        Call<List<Model>> call = api.getModel();
        call.enqueue(new Callback<List<Model>>() {
            @Override
            public void onResponse(Call<List<Model>> call, Response<List<Model>> response) {

                List<Model> models =response.body();

                for(Model m: models){
                    Log.d("name",m.getName());
                    Log.d("realname",m.getRealname());
                    Log.d("imageurl",m.getImageurl());
                }
            }

            @Override
            public void onFailure(Call<List<Model>> call, Throwable t) {

                //If Some Error occures we will get into this method

                Toast.makeText(getApplicationContext(),t.getMessage(),Toast.LENGTH_SHORT).show();
            }
        });

    }
}