package com.example.todolist;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface InspirationalQuoteApi {

    @GET("quotes/random")
    Call<Quote> getPosts();
}
