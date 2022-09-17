package com.rent.buygame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    ListView lv;
    ArrayList<Games> games;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        lv = findViewById(R.id.lv);
        initCars();
        MyListAdapter myListAdapter = new MyListAdapter(this,games);
        lv.setAdapter(myListAdapter);

    }

    public void initCars() {

        Intent i = getIntent();
        String uye = i.getStringExtra("uye");
        games=new ArrayList<>();
        Games games1;
        Games games2;
        Games games3;
        Games games4;
        Games games5;
        Games games6;
        Games games7;
        Games games8;
        Games games9;
        Games games10;
        if (uye.equals("evet")){
            games1=new Games("Last of Us","Naughty Dog","TPS Action",2013,150,R.drawable.thelastofus);
            games2=new Games("Uncharted 4","Naughty Dog","TPS Action",2015,120,R.drawable.uncharted4);
            games3=new Games("God of War","Sony","TPS Action",2015,170,R.drawable.godofwar);
            games4=new Games("BattleField 2042","Electronic Arts","TPS Action",2016,50,R.drawable.battlefield2042);
            games5=new Games("Fifa 2022","Electronic Arts","TPS Action",2010,30,R.drawable.fifa2022);
            games6=new Games("Minecraft","Mojang","TPS Action",2019,160,R.drawable.minecraft);
            games7=new Games("Dead Cells","Motion Twin","TPS Action",2020,130,R.drawable.deadcells);
            games8=new Games("BloodBorne","FromSoftware","TPS Action",2021,20,R.drawable.bloodborne);
            games9=new Games("Forza Horizon 5","Xbox Game Studios","TPS Action",2022,90,R.drawable.forzahorizon5);
            games10=new Games("Gta V","Rockstar Games","TPS Action",2008,90,R.drawable.gtav);

        }
        else {
            games1=new Games("Last of Us","Naughty Dog","TPS Action",2013,130,R.drawable.thelastofus);
            games2=new Games("Uncharted 4","Naughty Dog","TPS Action",2015,108,R.drawable.uncharted4);
            games3=new Games("God of War","Sony","TPS Action",2015,153,R.drawable.godofwar);
            games4=new Games("BattleField 2042","Electronic Arts","TPS Action",2016,45,R.drawable.battlefield2042);
            games5=new Games("Fifa 2022","Electronic Arts","TPS Action",2010,27,R.drawable.fifa2022);
            games6=new Games("Minecraft","Mojang","TPS Action",2019,144,R.drawable.minecraft);
            games7=new Games("Dead Cells","Motion Twin","TPS Action",2020,117,R.drawable.deadcells);
            games8=new Games("BloodBorne","FromSoftware","TPS Action",2021,18,R.drawable.bloodborne);
            games9=new Games("Forza Horizon 5","Xbox Game Studios","TPS Action",2022,81,R.drawable.forzahorizon5);
            games10=new Games("Gta V","Rockstar Games","TPS Action",2008,81,R.drawable.gtav);

        }
        games.add(games1);
        games.add(games2);
        games.add(games3);
        games.add(games4);
        games.add(games5);
        games.add(games6);
        games.add(games7);
        games.add(games8);
        games.add(games9);
        games.add(games10);
    }
}