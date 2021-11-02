package com.example.assignment.ui.mainscreen;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.assignment.data.Repository;
import com.example.assignment.data.modal.Response;
import com.example.assignment.data.modal.ResponseItem;
import com.example.assignment.data.remote.CallBackInterface;

import java.util.List;

public class IssueViewModal extends ViewModel {
    private MutableLiveData<List<ResponseItem>> issuesResponse ;
    private Repository issueRepo;

    public IssueViewModal(){
        issuesResponse =  new MutableLiveData<>();
        issueRepo = new Repository();
    }

    public void getIssues(){
        issueRepo.getEmploy(new CallBackInterface() {
            @Override
            public void onSuccess(List<ResponseItem> data) {
                issuesResponse.setValue(data);
            }

            @Override
            public void onFailure(String message) {
                issuesResponse.setValue(null);
            }
        });
    }

    public MutableLiveData<List<ResponseItem>> getEmployLivedata() {
        return issuesResponse;
    }
}
