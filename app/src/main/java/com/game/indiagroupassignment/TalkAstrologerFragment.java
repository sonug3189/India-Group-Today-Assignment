package com.game.indiagroupassignment;

import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;


public class TalkAstrologerFragment extends Fragment {

    private ListView lView;

    int[] images = {R.drawable.astrologer,R.drawable.astrologer,R.drawable.astrologer,R.drawable.astrologer,R.drawable.astrologer};
    String[] name = {"manish shukla","Ashish shukla","harish shukla","Ashish shukla","vaibhav shukla"};
    String[] vasu_astrology = {"manish shukla","Ashish shukla","harish shukla","Ashish shukla","vaibhav shukla"};
    String[] language = {"Hindi, English","Hindi, English","Hindi, English","Hindi, English","Hindi, English"};
    String[] price = {"Rs 100/min","Rs 140/min","Rs 170/min","Rs 180/min","Rs 200/min",};
    String[] age = {"30","25","90","40","50",};
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_talk_astrologer, container, false);
        lView = (ListView)view.findViewById(R.id.astrologer_list_view);
        ImageView searchImageView = view.findViewById(R.id.search);
        CardView searchCardView = view.findViewById(R.id.search_card_view);
        EditText inputSearch = view.findViewById(R.id.edit_astrologer);
        searchImageView.setOnClickListener(v->{
            searchCardView.setVisibility(View.VISIBLE);
        });
        ImageView removeIcon = view.findViewById(R.id.cross);
        removeIcon.setOnClickListener(v->{
            searchCardView.setVisibility(View.GONE);
        });

        AstrologerAdapter lAdapter = new AstrologerAdapter(getContext(), images, name,vasu_astrology,language,price,age);

        lView.setAdapter(lAdapter);

        lView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(getContext(), "item clicked", Toast.LENGTH_SHORT).show();

            }
        });
        return view;
    }
}