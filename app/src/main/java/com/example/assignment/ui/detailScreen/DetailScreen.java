package com.example.assignment.ui.detailScreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.assignment.R;
import com.example.assignment.data.modal.ResponseItem;
import com.example.assignment.databinding.ActivityDetailScreenBinding;
import com.example.assignment.databinding.ActivityMainBinding;
import com.google.gson.Gson;

public class DetailScreen extends AppCompatActivity {


    private ActivityDetailScreenBinding binding;
    private ResponseItem data;
    String dataS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_screen);

        binding = ActivityDetailScreenBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        dataS =  getIntent().getStringExtra("data");

        Gson g = new Gson();
        data = g.fromJson(dataS,ResponseItem.class);

        if(data!=null){
            binding.detailText.setText(data.getBody());
        }


    }
}