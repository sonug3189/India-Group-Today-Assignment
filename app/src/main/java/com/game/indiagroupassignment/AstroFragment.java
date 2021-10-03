package com.game.indiagroupassignment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class AstroFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_astro, container, false);
        ImageView profileImageView = view.findViewById(R.id.imageview);
        TextView nameText = view.findViewById(R.id.title);
        TextView rating = view.findViewById(R.id.rating);
        TextView discription = view.findViewById(R.id.discription);
        TextView price = view.findViewById(R.id.price);
        Bundle bundle = getArguments();
        String firstName = "",lastName = "",img = "",ratingbar = "", aboutme = "",perminutes = "";
        if (bundle != null) {
            if (bundle.containsKey("firstName")) {
                firstName = bundle.getString("firstName");
            }
            if(bundle.containsKey("lastName")){
                lastName = bundle.getString("lastName");
            }
            if(bundle.containsKey("imageUrl")){
                img = bundle.getString("imageUrl");
            }
            if (bundle.containsKey("rating")) {
                ratingbar = bundle.getString("rating");
            }
            if(bundle.containsKey("perMinuteCharges")){
                perminutes = bundle.getString("perMinuteCharges");
            }
            if(bundle.containsKey("aboutme")){
                aboutme = bundle.getString("aboutme");
            }
        }
//
//        nameText.setText(firstName+" "+lastName);
//        rating.setText(ratingbar);
//        discription.setText(aboutme);
//        price.setText(perminutes);
//        if(img != null && !img.isEmpty()){
//            //Glide.with(context).load(url2).into(storyImageView2);
//        }

        return view;
    }
}