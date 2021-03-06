package com.adil.android.Hyderabadi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PlacesAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        final ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("Fortress complex famed for acoustics","Golkonda","#ff7f7f",R.mipmap.map,"17.3833","78.4011",R.mipmap.golconda));
        words.add(new Word("Iconic mosque with 4 minarets","Charminar","#ff7f7f",R.mipmap.map,"17.3616","78.4747",R.mipmap.charminar));
        words.add(new Word("Lake","Hussain Sagar","#ff7f7f",R.mipmap.map,"17.4239","78.4738",R.mipmap.hussain_sagar));
        words.add(new Word("Varied art & antiques from Asia and Europe","Salar Jung Museum","#ff7f7f",R.mipmap.map,"17.3713","78.4804",R.mipmap.salarjung));
        words.add(new Word("Hilltop white Hindu Temple","Birla Mandir","#ff7f7f",R.mipmap.map,"17.4062","78.4691",R.mipmap.birla));
        words.add(new Word("Vast film studio and entertainment Complex.","Ramoji Film City","#ff7f7f",R.mipmap.map,"17.2543","78.6808",R.mipmap.ramuji));
        words.add(new Word("Monumental, richly decorated mosque","Makkah Masjid","#ff7f7f",R.mipmap.map,"17.3604","78.4736",R.mipmap.mecca));
        words.add(new Word("Zoo","Nehru Zoological Park","#ff7f7f",R.mipmap.map,"17.3511","78.4489",R.mipmap.nehru_zoo));
        words.add(new Word("Restored palace complex & events venue","Chowmahalla palace","#ff7f7f",R.mipmap.map,"17.3578","78.4717",R.mipmap.chowmahalla));

        WordAdapter itemsAdapter = new WordAdapter(this,words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

      /*  listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Word word = words.get(i);

                String myLatitude=word.getLatitue();
                String myLongitude=word.getLongitude();
                String labelLocation=word.getHydTranslation();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:<" + myLatitude  + ">,<" + myLongitude + ">?q=<" + myLatitude  + ">,<" + myLongitude + ">(" + labelLocation + ")"));
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });*/

    }
}
