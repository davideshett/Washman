package com.example.davideshett.washman.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.davideshett.washman.DetailedActivity;
import com.example.davideshett.washman.R;
import com.example.davideshett.washman.model.Service;

import java.util.List;

public class DetailAdapter extends RecyclerView.Adapter<DetailAdapter.MyViewHolder> {

private Context mContext;
private List<Service> serviceList;

public class MyViewHolder extends RecyclerView.ViewHolder {
    public TextView materialName, count;
    public ImageView materialPic, overflow;

    public MyViewHolder(View view) {
        super(view);
        materialName = (TextView) view.findViewById(R.id.material_name);
        materialPic = (ImageView) view.findViewById(R.id.material);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Service service = serviceList.get(getAdapterPosition());
                Context context = view.getContext();
                Intent intent = new Intent(context, DetailedActivity.class);
                intent.putExtra("service_price", service.getPrice());
                context.startActivity(intent);
            }
        });

    }
}


    public DetailAdapter(Context mContext, List<Service> serviceList) {
        this.mContext = mContext;
        this.serviceList = serviceList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.detailed_layout, parent, false);

        return new DetailAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Service service = serviceList.get(position);
        holder.materialName.setText(service.getName());
        holder.materialPic.setImageResource(service.getThumbnail());
    }

    @Override
    public int getItemCount() {
        return serviceList.size();
    }
}
