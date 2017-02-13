package com.adil.android.Hyderabadi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        ArrayList<Word> words= new ArrayList<Word>();

        words.add(new Word("Father","Abba",R.drawable.family_father,"#8ada8e"));
       // words.add(new Word("Dad(informal)","Bawa",R.drawable.family_father));
        words.add(new Word("Mother","Ammi",R.drawable.family_mother,"#8ada8e"));
       // words.add(new Word("Mom(informal)","Amma",R.drawable.family_mother));
        words.add(new Word("Uncle/ Father's younger brother","Chacha",R.drawable.family_older_brother,"#8ada8e"));
        words.add(new Word("Your Chacha's wife","Chachi",R.drawable.family_older_sister,"#8ada8e"));
        words.add(new Word("Uncle/ Father's older brother","Taya",R.drawable.family_father,"#8ada8e"));
        words.add(new Word("Your Taya's wife","Taymi",R.drawable.family_mother,"#8ada8e"));

        words.add(new Word("Aunt/ Father's Sister","Phupu",R.drawable.family_mother,"#8ada8e"));
        words.add(new Word("Phupu's Husband","Phupa",R.drawable.family_father,"#8ada8e"));
        words.add(new Word("Brother","Bhaya",R.drawable.family_younger_brother,"#8ada8e"));
        //words.add(new Word("Brother's wife","Bhabhi",));
        words.add(new Word("Sister","Baji",R.drawable.family_younger_sister,"#8ada8e"));
       // words.add(new Word("Sister's Husband","Bhaijan"));




        WordAdapter itemsAdapter = new WordAdapter(this,words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

    }
}
