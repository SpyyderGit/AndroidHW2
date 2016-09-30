package com.example.superuser.hometask1.ua;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.superuser.hometask1.Config;
import com.example.superuser.hometask1.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList mData;
    private RecyclerView mRecyclerView;
    private MyAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Config data = new Config();
        mData = data.getPerson();
        mRecyclerView = (RecyclerView) findViewById(R.id.rcView_recycler);
        mRecyclerView.setHasFixedSize(true);

        LinearLayoutManager mLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new MyAdapter(this, mData);
        mRecyclerView.setAdapter(mAdapter);
    }
}
