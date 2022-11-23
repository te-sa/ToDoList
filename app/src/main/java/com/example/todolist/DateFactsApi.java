package com.example.todolist;

import retrofit2.Call;
import retrofit2.http.GET;

public interface DateFactsApi {

    @GET("events.json")
    Call<DateFacts> getPosts();
}
