package com.example.todolist;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface InspirationalQuoteApi {

    // Retrofit will auto-generate necessary code from this interface
    // Getting API key from Config class that is not added to git because I don't want to publish the api key
    @Headers({"X-Api-Key: " + Config.API_KEY})
    @GET("quotes?category=success")
    Call<List<Quote>> getPosts();
    // Call object encapsulates single request and response
}
