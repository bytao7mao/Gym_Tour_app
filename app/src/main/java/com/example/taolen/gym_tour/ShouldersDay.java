package com.example.taolen.gym_tour;

/**
 * Created by taoLen on 5/28/2018.
 */
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

public class ShouldersDay extends Fragment {
    public ShouldersDay() {}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);
        final ArrayList<Area> areas = new ArrayList<>();
        areas.add(new Area(getString(R.string.shoulders1), getString(R.string.shoulders1_desc), R.drawable.shoulder1));
        areas.add(new Area(getString(R.string.shoulders2), getString(R.string.shoulders2_desc), R.drawable.shoulder2));
        areas.add(new Area(getString(R.string.shoulders3), getString(R.string.shoulders3_desc), R.drawable.shoulder3));
        AreaAdapter adapter = new AreaAdapter(getActivity(), areas, R.color.shoulders_color);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}
