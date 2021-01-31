package com.example.homepage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<ExampleItem> mExampleList;
    private RecyclerView mRecyclerView;
    private ExampleAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createExampleList();
        buildRecyclerView();
    }
    private void createExampleList() {
        mExampleList = new ArrayList<>();
        mExampleList.add(new ExampleItem(R.drawable.round_5,R.drawable.round_2,"Introduction","First Website"));
        mExampleList.add(new ExampleItem(R.drawable.round_5,R.drawable.round_6,"Tags","Heading"));
        mExampleList.add(new ExampleItem(R.drawable.round_6,R.drawable.round_5,"Introduction","First Website"));
        mExampleList.add(new ExampleItem(R.drawable.round_7,R.drawable.round_2,"Introduction","First Website"));
        mExampleList.add(new ExampleItem(R.drawable.round_5,R.drawable.round_6,"Tags","Heading"));
        mExampleList.add(new ExampleItem(R.drawable.round_6,R.drawable.round_5,"Introduction","First Website"));
        mExampleList.add(new ExampleItem(R.drawable.round_2,R.drawable.round_7,"Introduction","First Website"));


    }
    private void buildRecyclerView() {
        mRecyclerView = findViewById(R.id.recyclerView);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ExampleAdapter(mExampleList);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }
}
