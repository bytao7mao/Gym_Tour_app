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

public class ChestBenchFragment extends Fragment {
    public ChestBenchFragment() {}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);
        final ArrayList<Area> areas = new ArrayList<>();
        areas.add(new Area(getString(R.string.chest1), getString(R.string.chest1_description), R.drawable.chest1));
        areas.add(new Area(getString(R.string.chest2), getString(R.string.chest2_description), R.drawable.chest2));
        areas.add(new Area(getString(R.string.chest3), getString(R.string.chest3_description), R.drawable.chest3));

        AreaAdapter adapter = new AreaAdapter(getActivity(), areas, R.color.chest_color);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}
