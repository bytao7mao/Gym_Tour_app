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

public class ArmsDay extends Fragment {
    public ArmsDay() {}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);
        final ArrayList<Area> areas = new ArrayList<>();
        areas.add(new Area(getString(R.string.arms1), getString(R.string.arms1_description), R.drawable.arms1));
        areas.add(new Area(getString(R.string.arms2), getString(R.string.arms2_description), R.drawable.arms2));
        areas.add(new Area(getString(R.string.arms3), getString(R.string.arms3_description), R.drawable.arms3));
        AreaAdapter adapter = new AreaAdapter(getActivity(), areas, R.color.arms_color);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}
