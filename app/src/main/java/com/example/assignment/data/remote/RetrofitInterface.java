package com.example.assignment.data.remote;

import com.example.assignment.data.modal.Response;
import com.example.assignment.data.modal.ResponseItem;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RetrofitInterface {

    @GET("issues")
    Call<List<ResponseItem>> getIssues();

}
