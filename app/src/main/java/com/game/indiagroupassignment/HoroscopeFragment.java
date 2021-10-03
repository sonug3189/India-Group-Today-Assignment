package com.game.indiagroupassignment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class HoroscopeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_horoscope, container, false);
        ImageView imageView = view.findViewById(R.id.imageview);
        TextView titleTextView = view.findViewById(R.id.title);
        TextView dateTextView = view.findViewById(R.id.date);

        Bundle bundle = getArguments();
        String title = "",date = "",img = "";
        if (bundle != null) {
            if (bundle.containsKey("title")) {
                title = bundle.getString("title");
            }
            if(bundle.containsKey("date")){
                date = bundle.getString("date");
            }
            if(bundle.containsKey("img")){
                img = bundle.getString("img");
            }
        }

        titleTextView.setText(title);
        dateTextView.setText(date);


        return view;
    }
}