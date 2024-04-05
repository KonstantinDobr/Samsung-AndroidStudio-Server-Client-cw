package com.example.testandroid0504.repository;

import com.example.testandroid0504.api.person.PersonAPIService;
import com.example.testandroid0504.domain.Person;

import retrofit2.Call;

public class PersonRepository {

    public static Call<Person> getPerson(long id) {
        return PersonAPIService.getInstance().getPerson(id);
    }

}
