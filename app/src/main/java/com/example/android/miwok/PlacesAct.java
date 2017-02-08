package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PlacesAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("Fortress complex famed for acoustics","Golkonda","#ff7f7f",R.mipmap.map));
        words.add(new Word("Iconic mosque with 4 minarets","Charminar","#ff7f7f",R.mipmap.map));
        words.add(new Word("Lake","Hussain Sagar","#ff7f7f",R.mipmap.map));
        words.add(new Word("Varied art & antiques from Asia and Europe","Salar Jung Museum","#ff7f7f",R.mipmap.map));
        words.add(new Word("Hilltop white Hindu Temple","Birla Mandir","#ff7f7f",R.mipmap.map));
        words.add(new Word("Vast film studio and entertainment Complex.","Ramoji Film City","#ff7f7f",R.mipmap.map));
        words.add(new Word("Monumental, richly decorated mosque","Makkah Masjid","#ff7f7f",R.mipmap.map));
        words.add(new Word("Zoo","Nehru Zoological Park","#ff7f7f",R.mipmap.map));
        words.add(new Word("Restored palace complex & events venue","Chawmahalla palace","#ff7f7f",R.mipmap.map));

        WordAdapter itemsAdapter = new WordAdapter(this,words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

    }
}
