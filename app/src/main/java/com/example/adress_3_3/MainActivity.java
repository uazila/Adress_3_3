package com.example.adress_3_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public RecyclerView recyclerview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerview=findViewById(R.id.recycle);
        ArrayList<String>adresses =new ArrayList<>();
        adresses.add("Toktogul");


        AdressAdapter adapter=new AdressAdapter(adresses);
       recyclerview.setAdapter(adapter);
        
    }
}