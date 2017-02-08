package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        ArrayList<Word> words= new ArrayList<Word>();

        words.add(new Word("White","Safed",R.drawable.color_white,"#f3b467"));
        words.add(new Word("Black","Kala",R.drawable.color_black,"#f3b467"));
        words.add(new Word("Green","Hara",R.drawable.color_green,"#f3b467"));
        words.add(new Word("Yellow","Peela",R.drawable.color_mustard_yellow,"#f3b467"));
       // words.add(new Word("Orange","Mosambi",R.drawable.col));
      //  words.add(new Word("Blue","Neela",R.drawable.c));
        words.add(new Word("Brown","Bhoora",R.drawable.color_brown,"#f3b467"));
        words.add(new Word("Grey","Surmai",R.drawable.color_gray,"#f3b467"));
        words.add(new Word("Golden","Sunehri",R.drawable.color_dusty_yellow,"#f3b467"));
        words.add(new Word("Red","Laal",R.drawable.color_red,"#f3b467"));





        WordAdapter itemsAdapter = new WordAdapter(this,words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);


    }
}
