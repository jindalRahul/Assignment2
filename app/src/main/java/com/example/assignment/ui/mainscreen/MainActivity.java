package com.example.assignment.ui.mainscreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.assignment.R;
import com.example.assignment.data.modal.Response;
import com.example.assignment.data.modal.ResponseItem;
import com.example.assignment.databinding.ActivityMainBinding;
import com.example.assignment.ui.detailScreen.DetailScreen;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private IssueAdapter mAdapter;
    private IssueViewModal issueViewModal;
    private List<ResponseItem> modelList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        modelList = new ArrayList<>();
        issueViewModal =  new ViewModelProvider(this).get(IssueViewModal.class);
        setUpRv();
    }

    private void setUpRv() {

        mAdapter = new IssueAdapter(modelList, this, new ClickListner() {
            @Override
            public void onClick(ResponseItem data) {
                Intent i =  new Intent(MainActivity.this, DetailScreen.class);

                Gson g = new Gson();
                i.putExtra("data",g.toJson(data));
                startActivity(i);
            }
        });
        binding.mainRv.setAdapter(mAdapter);
        binding.mainRv.setLayoutManager(new LinearLayoutManager(this));
        issueViewModal.getIssues();
        issueViewModal.getEmployLivedata().observe(this, new Observer<List<ResponseItem>>() {
            @Override
            public void onChanged(List<ResponseItem> response) {
                if(response == null ){
                    modelList.clear();
                    mAdapter.notifyDataSetChanged();
                    Toast.makeText(MainActivity.this,"No data received ",Toast.LENGTH_SHORT).show();
                }else{
//                    modelList = response;
                    mAdapter.setData(response);
//                    mAdapter.notifyDataSetChanged();
                }
            }
        });
    }
}