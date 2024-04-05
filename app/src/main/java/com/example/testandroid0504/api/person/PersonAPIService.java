package com.example.testandroid0504.api.person;

import com.example.testandroid0504.api.RetrofitService;

public class PersonAPIService {
    private static PersonAPI personAPI;

    private static PersonAPI create() {
        return RetrofitService.getInstance().create(PersonAPI.class);
    }

    public static PersonAPI getInstance() {
        if (personAPI == null) personAPI = create();
        return personAPI;
    }
}
