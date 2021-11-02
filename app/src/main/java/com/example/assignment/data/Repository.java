package com.example.assignment.data;

import com.example.assignment.data.modal.ResponseItem;
import com.example.assignment.data.remote.CallBackInterface;
import com.example.assignment.data.remote.RetrofitHelper;
import com.example.assignment.data.remote.RetrofitInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Repository {

    private RetrofitInterface mNetworkService = RetrofitHelper.getInstance().create(RetrofitInterface.class);

    public void getEmploy( CallBackInterface callBackInterface){
        mNetworkService.getIssues().enqueue(new Callback<List<ResponseItem>>() {
            @Override
            public void onResponse(Call<List<ResponseItem>> call, Response<List<ResponseItem>> response) {
                if(response.isSuccessful()){
                    callBackInterface.onSuccess(response.body());
                }else{
                    callBackInterface.onFailure(response.message());
                }
            }

            @Override
            public void onFailure(Call<List<ResponseItem>> call, Throwable t) {
                callBackInterface.onFailure(t.getMessage());
            }
        });



    }
}
