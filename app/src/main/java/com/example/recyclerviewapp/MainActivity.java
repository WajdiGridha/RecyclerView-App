package com.example.recyclerviewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Movie> movieList = new ArrayList<>();
    MyAdapter myAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        myAdapter = new MyAdapter(movieList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(myAdapter);

        InsertData();

    }

    private void InsertData() {
        Movie movie = new Movie("Fast & Furious 9", "Action", "2019");
        movieList.add(movie);
        movie = new Movie("The Punisher", "Crime", "2014");
        movieList.add(movie);
        movie = new Movie("Mon On Fire", "Crime", "2008");
        movieList.add(movie);
        movie = new Movie("Hello", "Action", "2013");
        movieList.add(movie);
        movie = new Movie("Peace", "Crime", "2012");
        movieList.add(movie);
        movie = new Movie("Hey you", "Action", "2010");

        movieList.add(movie);

        myAdapter.notifyDataSetChanged();
    }
}