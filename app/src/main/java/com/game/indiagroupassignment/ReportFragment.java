package com.game.indiagroupassignment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;


public class ReportFragment extends Fragment {


    public ReportFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_report, container, false);
        ImageView imageView = view.findViewById(R.id.banner_image_view);
        Bundle bundle = getArguments();
        String img = "";
        if (bundle != null) {
            if(bundle.containsKey("imageUrl")){
                img = bundle.getString("imageUrl");
            }
        }
        img = "https://truweight-storage.s3.ap-south-1.amazonaws.com/DailyTips/Banner/Against-Obesity.png";
//        if(img != null && !img.isEmpty()){
//            Glide.with(getContext()).load(img).into(imageView);
//        }
        return view;
    }
}