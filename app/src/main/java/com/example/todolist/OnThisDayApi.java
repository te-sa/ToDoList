package com.example.todolist;

import retrofit2.Call;
import retrofit2.http.GET;

public interface OnThisDayApi {

    @GET("events.json")
    Call<DateInfo> getPosts();
}
