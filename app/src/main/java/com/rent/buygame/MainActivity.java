package com.rent.buygame;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button btnGiris, btnUyeOlmadanGiris;
    EditText etKullaniciAdi, etSifre;

    ArrayList<Uyeler> uyeListesi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUi();
        uyeleriOlustur();
    }

    public void initUi() {
        btnGiris = findViewById(R.id.btnGiris);
        btnUyeOlmadanGiris = findViewById(R.id.button2);
        etKullaniciAdi = findViewById(R.id.etKullaniciAdi);
        etSifre = findViewById(R.id.etSifre);

        btnUyeOlmadanGiris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("uye", "hayır");
                startActivity(intent);
            }
        });
    }

    public void uyeleriOlustur() {
        uyeListesi = new ArrayList<>();
        Uyeler uye1 = new Uyeler("uye1", "123456");
        Uyeler uye2 = new Uyeler("uye2", "123456");
        Uyeler uye3 = new Uyeler("uye3", "123456");
        Uyeler uye4 = new Uyeler("uye4", "123456");
        Uyeler uye5 = new Uyeler("uye5", "123456");
        Uyeler uye6 = new Uyeler("uye6", "123456");

        uyeListesi.add(uye1);
        uyeListesi.add(uye2);
        uyeListesi.add(uye3);
        uyeListesi.add(uye4);
        uyeListesi.add(uye5);
        uyeListesi.add(uye6);

    }

    public void checkPassword(View view) {
        String kullaniciAdi = etKullaniciAdi.getText().toString();
        String sifre = etSifre.getText().toString();
        int sayac = 0;

        Uyeler girisYapanUye = new Uyeler(kullaniciAdi, sifre);
        Boolean b = girisYapanUye.equals(uyeListesi.get(0));
        Log.e("hey", b.toString());
        for (int i = 0; i < 5; i++) {
            Log.e("hey", "girdi");
            if (girisYapanUye.kullaniciAdi.equals(uyeListesi.get(i).kullaniciAdi) &&
                    girisYapanUye.sifre.equals(uyeListesi.get(i).sifre)) {
                Intent intent = new Intent(this, MainActivity2.class);
                intent.putExtra("uye", "evet");
                startActivity(intent);
                sayac++;
                Toast.makeText(this, "Giriş Başarılı", Toast.LENGTH_LONG).show();
                break;
            }
        }
        if (sayac == 0) {
            Toast.makeText(this, "Kullanıcı adı ya da parola hatalı", Toast.LENGTH_LONG).show();
        }
    }
}