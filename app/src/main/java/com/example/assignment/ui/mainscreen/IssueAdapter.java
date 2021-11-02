package com.example.assignment.ui.mainscreen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.assignment.data.modal.ResponseItem;
import com.example.assignment.databinding.SingleItemLayoutBinding;

import java.util.List;


public class IssueAdapter extends RecyclerView.Adapter<IssueAdapter.IssuesViewHolder> {

    private List<ResponseItem> employMap;
    private Context mContext;
    SingleItemLayoutBinding binding;
    ClickListner clickListner;

    IssueAdapter(List<ResponseItem> employList, Context context , ClickListner clickListner) {
        this.employMap = employList;
        this.mContext = context;
        this.clickListner =  clickListner;
    }

    public void setData(List<ResponseItem> employModelArrayList) {
        this.employMap = employModelArrayList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public IssuesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = SingleItemLayoutBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new IssuesViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull IssuesViewHolder holder, int position) {
        holder.setData(employMap.get(position));
        holder.binding.getRoot().setOnClickListener(new
                                                            View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View view) {
                                                                    if(clickListner!=null){
                                                                        clickListner.onClick(employMap.get(position));
                                                                    }
                                                                }
                                                            });

    }


    @Override
    public int getItemCount() {
        return employMap == null ? 0 : employMap.size();
    }

    public class IssuesViewHolder extends RecyclerView.ViewHolder {
        SingleItemLayoutBinding binding ;

        public IssuesViewHolder(SingleItemLayoutBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }

        public void setData(ResponseItem data) {
            binding.employNameTV.setText(data.getTitle());
            binding.designationTv.setText(data.getBody());

            //this will set the data that comes to layout
        }
    }

}