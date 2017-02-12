package com.example.android.miwok;

import android.app.Activity;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;


public class WordAdapter extends ArrayAdapter<Word> {


    public WordAdapter(Activity context, ArrayList<Word> words) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViewsw, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView engTextView = (TextView) listItemView.findViewById(R.id.eng);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        engTextView.setText(currentWord.getdefaultTranslation());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView hydTextView = (TextView) listItemView.findViewById(R.id.hyd);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        hydTextView.setText(currentWord.getHydTranslation());

        LinearLayout linearLayout=(LinearLayout) listItemView.findViewById(R.id.lay2);

        ImageView imgImageView = (ImageView) listItemView.findViewById(R.id.img);
        if(currentWord.ithasimage())
        { imgImageView.setImageResource(currentWord.getRes_id());}
        else
        {imgImageView.setVisibility(View.GONE);}

        if(currentWord.ithascolor())
        {linearLayout.setBackgroundColor(Color.parseColor(currentWord.getRes_id1()));}

        ImageView locationView = (ImageView)listItemView.findViewById(R.id.loc);

        if(currentWord.ithaslocation())
        {
            locationView.setImageResource(currentWord.getLocate());}
        else
        {locationView.setVisibility(View.GONE);}



        return listItemView;
    }
}
