package com.example.hetarogebeousrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    private ArrayList<Object>objects=new ArrayList<>();
    ObjectAdapter objectAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerViewId);


        objects.add(new Car(R.drawable.images1,"Toyota","Toyota"));
        objects.add(new Movie("Boss1","Action"));
        objects.add(new Movie("Boss3","Boss3"));
        objects.add(new Car(R.drawable.images2,"Toyota","Toyota"));
        objects.add(new Movie("Boss2","Action"));
        objects.add(new Car(R.drawable.images3,"Toyota","Toyota"));
       // objects.add(new Car(R.drawable.images1,"Toyota","Toyota"));
        objects.add(new Movie("Boss3","Action"));
        objects.add(new Car(R.drawable.images1,"Toyota","Toyota"));
        objects.add(new Movie("Boss1","Action"));
        objects.add(new Movie("Boss3","Boss3"));
        objects.add(new Car(R.drawable.images2,"Toyota","Toyota"));
        objects.add(new Movie("Boss2","Action"));
        objects.add(new Car(R.drawable.images3,"Toyota","Toyota"));
        // objects.add(new Car(R.drawable.images1,"Toyota","Toyota"));
        objects.add(new Movie("Boss3","Action"));


        objectAdapter=new ObjectAdapter(MainActivity.this,objects);
        LinearLayoutManager llm=new LinearLayoutManager(MainActivity.this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(llm);
        recyclerView.setAdapter(objectAdapter);

    }
}