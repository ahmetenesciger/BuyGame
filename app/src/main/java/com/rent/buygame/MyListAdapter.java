package com.rent.buygame;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyListAdapter extends ArrayAdapter<Games> {
    private final LayoutInflater inflater;
    private final Context context;
    private ViewHolder holder;
    private final ArrayList<Games> myGames;


    public MyListAdapter(Activity context,ArrayList<Games> myGames) {
        super(context,0,myGames);
        this.context = context;
        this.myGames = myGames;
        inflater = LayoutInflater.from(context);
        //Log.e("heyCar",myCars.get(0).marka);

    }
    @Override
    public int getCount() {
        return myGames.size();
    }

    @Override
    public Games getItem(int position) {
        return myGames.get(position);
    }

    @Override
    public long getItemId(int position) {
        return myGames.get(position).hashCode();
    }

    @SuppressLint("SetTextI18n")
    public View getView(int position, View view, ViewGroup parent) {

        if (view == null) {
            view = inflater.inflate(R.layout.item_row,null);
            holder = new ViewHolder();
            holder.btn = view.findViewById(R.id.button);
            holder.image = view.findViewById(R.id.imageView);
            holder.tvModel =  view.findViewById(R.id.tvModel);
            holder.tvYil =  view.findViewById(R.id.tvYear);
            holder.tvFiyat =  view.findViewById(R.id.tvFiyat);
            view.setTag(holder);
        }else {
            holder = (ViewHolder) view.getTag();
        }
        Games game = myGames.get(position);


        String fiyat = "Fiyat " + game.fiyat + " TL";

        @SuppressLint("UseCompatLoadingForDrawables") Drawable drawable = context.getResources().getDrawable(game.drawable);

        holder.tvModel.setText(game.name);
        holder.tvYil.setText("Yıl : "+game.year);
        holder.tvFiyat.setText(fiyat);
        holder.image.setImageDrawable(drawable);

        holder.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, PaymentScreenActivity.class);
                intent.putExtra("name", myGames.get(position).name);
                intent.putExtra("fiyat", myGames.get(position).fiyat);
                context.startActivity(intent);

            }
        });

        return view;

    }
    private static class ViewHolder {
        ImageView image;
        TextView tvModel;
//        TextView
        TextView tvYil;
        TextView tvFiyat;
        Button btn;

    }

}
