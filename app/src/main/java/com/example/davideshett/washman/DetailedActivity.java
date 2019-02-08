package com.example.davideshett.washman;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.davideshett.washman.adapter.DetailAdapter;
import com.example.davideshett.washman.adapter.ServiceAdapter;
import com.example.davideshett.washman.model.Service;

import java.util.ArrayList;
import java.util.List;

public class DetailedActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private DetailAdapter adapter;
    private List<Service> serviceList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_detail);
        serviceList = new ArrayList<>();
        adapter = new DetailAdapter(this, serviceList);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(recyclerView.getContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);


        prepareDetails();
    }

    private void prepareDetails() {

        int[] covers = new int[]{
                R.drawable.agbada,
                R.drawable.bedsheet,
                R.drawable.curtain,
                R.drawable.jeans,
                R.drawable.shirt,
                R.drawable.suit,
                R.drawable.senator
        };

        Service a = new Service("Agbada", covers[0], 500.00);
        serviceList.add(a);

        a = new Service("Bed sheet",  covers[1],400.00);
        serviceList.add(a);

        a = new Service("Curtain", covers[2],300.00);
        serviceList.add(a);

        a = new Service("Jean", covers[3],200.00);
        serviceList.add(a);

        a = new Service("Shirt", covers[4],200.00);
        serviceList.add(a);

        a = new Service("Suit", covers[5],500.00);
        serviceList.add(a);

        a = new Service("Senator", covers[6],400.00);
        serviceList.add(a);

        adapter.notifyDataSetChanged();

    }
}
