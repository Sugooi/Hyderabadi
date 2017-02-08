package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        ArrayList<Word> words= new ArrayList<Word>();

        words.add(new Word("What is your name?","Kya naam hai apka?","#78acd2"));
        words.add(new Word("My Name is ___","Mera naam ____ hai","#78acd2"));
        words.add(new Word("Have you eaten?","Khana khai?","#78acd2"));
        words.add(new Word("Where are you going?","kidhar jare?","#78acd2"));
        words.add(new Word("No","Nakoo","#78acd2"));
        words.add(new Word("Yes","Haw","#78acd2"));
        words.add(new Word("Okay","Acha","#78acd2"));
        words.add(new Word("Why?","Kaiku?","#78acd2"));




        WordAdapter itemsAdapter = new WordAdapter(this,words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);




    }
}
