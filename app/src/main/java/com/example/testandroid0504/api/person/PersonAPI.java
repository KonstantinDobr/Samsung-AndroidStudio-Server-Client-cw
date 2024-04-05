package com.example.testandroid0504.api.person;

import com.example.testandroid0504.domain.Person;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface PersonAPI {
    @GET("/v1/person/{id}")
    Call<Person> getPerson(@Path("id") long id);
}
