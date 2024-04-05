package com.example.testandroid0504;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.example.testandroid0504.domain.Person;
import com.example.testandroid0504.repository.PersonRepository;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private Person person;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PersonRepository.getPerson(1).enqueue(new Callback<Person>() {
            @Override
            public void onResponse(Call<Person> call, Response<Person> response) {
                person = response.body();
                Log.d("MainActivity Person", person.toString());
            }

            @Override
            public void onFailure(Call<Person> call, Throwable throwable) {
                Log.d("MainActivity Person", throwable.getMessage());
            }
        });
    }
}