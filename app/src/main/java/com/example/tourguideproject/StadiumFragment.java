package com.example.tourguideproject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

/**
 * A {@link Fragment} subclass that displays a list of stadiums
 */
public class StadiumFragment extends Fragment {

    public StadiumFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Create an array of stadiums
        ArrayList<Subject> subject = new ArrayList<Subject>();

        // Add to an array new objects with the data
        subject.add(new Subject(getString(R.string.kyle), R.drawable.kyle1));
        subject.add(new Subject(getString(R.string.reed), R.drawable.reed1));
        subject.add(new Subject(getString(R.string.olsen), R.drawable.olsen1));
        subject.add(new Subject(getString(R.string.ellis), R.drawable.ellis1));

        // Inflate current View object in subject_list.xml
        View rootView = inflater.inflate(R.layout.subject_list, container, false);

        // Create SubjectAdapter object in current activity for data from subject array
        SubjectAdapter sA = new SubjectAdapter(getActivity(), subject);

        // Create ListView object in subject_list.xml and set the SubjectAdapter object to it
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(sA);

        // Return current View object with the data
        return rootView;
    }
}