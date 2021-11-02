package com.example.assignment.data.remote;

import com.example.assignment.data.modal.Response;
import com.example.assignment.data.modal.ResponseItem;

import java.util.List;

public interface CallBackInterface {

    public void onSuccess( List<ResponseItem> data);
    public void onFailure(String message);

}
