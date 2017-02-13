package com.adil.android.Hyderabadi;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);
      //  LinearLayout linearLayout=(LinearLayout) findViewById(R.id.lay2);
       // linearLayout.setBackgroundColor(Color.parseColor("#FFF76d"));


        ArrayList<Word> words= new ArrayList<Word>();

        words.add(new Word("One","Aek",R.drawable.number_one,"#b99bc7"));
        words.add(new Word("Two","Do",R.drawable.number_two,"#b99bc7"));
        words.add(new Word("Three","Theen",R.drawable.number_three,"#b99bc7"));
        words.add(new Word("Four","Chaar",R.drawable.number_four,"#b99bc7"));
        words.add(new Word("Five","Panch",R.drawable.number_five,"#b99bc7"));
        words.add(new Word("Six","Che",R.drawable.number_six,"#b99bc7"));
        words.add(new Word("Seven","Saath",R.drawable.number_seven,"#b99bc7"));
        words.add(new Word("Eight","Aath",R.drawable.number_eight,"#b99bc7"));
        words.add(new Word("Nine","Naw",R.drawable.number_nine,"#b99bc7"));
        words.add(new Word("Ten","Dus",R.drawable.number_ten,"#b99bc7"));





        WordAdapter itemsAdapter = new WordAdapter(this,words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);



        listView.setBackgroundColor(Color.parseColor("#FFFFFF"));


    }
}
