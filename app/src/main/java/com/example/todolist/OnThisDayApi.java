package com.example.todolist;

import retrofit2.Call;
import retrofit2.http.GET;

public interface OnThisDayApi {

    // Retrofit will auto-generate necessary code from this interface
    @GET("events.json")
    Call<DateInfo> getPosts();
    // Call object encapsulates single request and response
}
