package com.example.todolist;

import retrofit2.Call;
import retrofit2.http.GET;

public interface InspirationalQuoteApi {

    // Retrofit will auto-generate necessary code from this interface
    @GET("quotes/random")
    Call<Quote> getPosts();
    // Call object encapsulates single request and response
}
