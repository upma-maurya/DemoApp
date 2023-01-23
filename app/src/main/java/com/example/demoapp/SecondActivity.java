package com.example.demoapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<ModalClass>userList;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        RecyclerView recyclerView=findViewById(R.id.recyclerview);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new Adapter(getData()));

    }
    private ArrayList<ModalClass> getData()
    {
        ArrayList<ModalClass> list = new ArrayList<>();
        ModalClass c1=new ModalClass(R.drawable.duck,"Upma","9897657889");list.add(c1);
        ModalClass c2=new ModalClass(R.drawable.duck,"Upma","9897657889");list.add(c2);
        ModalClass c3=new ModalClass(R.drawable.duck,"Upma","9897657889");list.add(c3);
        ModalClass c4=new ModalClass(R.drawable.duck,"Upma","9897657889");list.add(c4);
        ModalClass c5=new ModalClass(R.drawable.duck,"Upma","9897657889");list.add(c5);
        return list;
    }
}