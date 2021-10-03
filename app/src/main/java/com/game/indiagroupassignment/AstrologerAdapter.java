package com.game.indiagroupassignment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class AstrologerAdapter extends BaseAdapter {

    Context context;
    private final int[] images;
    private final String[] names;
    private final String [] vasu_astrology;
    private final String [] language;
    private final String [] price;
    private final String [] age;

    public AstrologerAdapter(Context context,int [] images,String[] names,String[] vasu_astrology,String[] language,String[] price,String[] age){
        this.context = context;
        this.images = images;
        this.names = names;
        this.vasu_astrology = vasu_astrology;
        this.language = language;
        this.price = price;
        this.age = age;
    }

    @Override
    public int getCount() {
        return age.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        ViewHolder viewHolder;

        final View result;

        if (convertView == null) {

            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.astrologer_list_item, parent, false);
            viewHolder.icon = (ImageView) convertView.findViewById(R.id.astrologer_profile);
            viewHolder.astrologerName = (TextView) convertView.findViewById(R.id.name);
            viewHolder.vasuAstrology = (TextView) convertView.findViewById(R.id.vasu_astrology);
            viewHolder.language = (TextView) convertView.findViewById(R.id.language);
            viewHolder.price = (TextView) convertView.findViewById(R.id.price);
            viewHolder.age = (TextView) convertView.findViewById(R.id.age);

            result=convertView;
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
            result=convertView;
        }

        viewHolder.icon.setImageResource(images[position]);
        viewHolder.astrologerName.setText(names[position]);
        viewHolder.vasuAstrology.setText(vasu_astrology[position]);
        viewHolder.language.setText(language[position]);
        viewHolder.price.setText(price[position]);
        viewHolder.age.setText(age[position]);

        return convertView;
    }

    private static class ViewHolder {
        ImageView icon;
        TextView astrologerName;
        TextView vasuAstrology;
        TextView language;
        TextView price,age;
    }

}
