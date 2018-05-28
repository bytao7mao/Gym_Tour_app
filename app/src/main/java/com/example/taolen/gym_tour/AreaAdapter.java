package com.example.taolen.gym_tour;

/**
 * Created by taoLen on 5/28/2018.
 */

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class AreaAdapter extends ArrayAdapter<Area> {
    private int colorResourceId;
    public AreaAdapter(Activity context, ArrayList<Area> locations, int colorResourceId) {
        super(context, 0, locations);
        this.colorResourceId = colorResourceId;}
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);}
        Area currentLocation = getItem(position);
        TextView titleTextView = listItemView.findViewById(R.id.attraction_title_item);
        titleTextView.setText(currentLocation.getTitle());
        TextView descriptionTextView = listItemView.findViewById(R.id.attraction_description_item);
        descriptionTextView.setText(currentLocation.getDescription());
        ImageView iconView = listItemView.findViewById(R.id.image);
        iconView.setImageResource(currentLocation.getImageResourceId());
        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), colorResourceId);
        textContainer.setBackgroundColor(color);
        return listItemView;
    }
}

