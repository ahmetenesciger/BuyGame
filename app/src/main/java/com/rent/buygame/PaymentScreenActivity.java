package com.rent.buygame;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PaymentScreenActivity extends AppCompatActivity {
    TextView tvModelveOdeme;
    EditText etKartNo;
    EditText etAdres;
    EditText etTcKimlik;
    EditText etKartAy;
    EditText etKartYil;
    EditText etKartCvv;
    Button btnOde;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_odeme_ekrani);
        tvModelveOdeme = findViewById(R.id.tvMarkaveOdeme);
        etAdres = findViewById(R.id.etAdres);
        etTcKimlik = findViewById(R.id.etTcKimlik);
        etKartNo = findViewById(R.id.etKartNo);
        etKartAy = findViewById(R.id.etKartAy);
        etKartYil = findViewById(R.id.etKartYil);
        etKartCvv = findViewById(R.id.etKartCvv);
        btnOde = findViewById(R.id.btnOdeme);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        int fiyat = intent.getIntExtra("fiyat",0);
        tvModelveOdeme.setText(name + "\n" + fiyat +" TL");
        setOnClicks();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.cikis_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.act_end) {
            Intent intentEnd = new Intent(PaymentScreenActivity.this,MainActivity.class);
            startActivity(intentEnd);
        }else if (item.getItemId() == R.id.act_end_buy) {
            finish();
        }

        return super.onOptionsItemSelected(item);
    }

    private void setOnClicks() {

        btnOde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etKartNo.getText().toString().length() != 16 |
                        etKartNo.getText().toString().equals("")) {
                    Toast.makeText(PaymentScreenActivity.this,"Geçerli Bir Kart numarası giriniz!!!",Toast.LENGTH_SHORT).show();
                }else if (etKartAy.getText().toString().equals("") |
                        etKartAy.getText().toString().length() != 2 |
                        Integer.parseInt(etKartAy.getText().toString()) <=0 |
                        Integer.parseInt(etKartAy.getText().toString()) > 12 ){
                    Toast.makeText(PaymentScreenActivity.this,"Ay Bilgisini 01-12 arasında giriniz!!!",Toast.LENGTH_SHORT).show();
                }else if (etKartYil.getText().toString().equals("") |
                        etKartYil.getText().length() != 2 |
                        Integer.parseInt(etKartYil.getText().toString()) <=0){
                    Toast.makeText(PaymentScreenActivity.this,"Yıl bilgisini iki haneli olarak giriniz",Toast.LENGTH_SHORT).show();
                }else if (etKartCvv.getText().toString().equals("") |
                        etKartCvv.getText().toString().length() != 3){
                    Toast.makeText(PaymentScreenActivity.this,"Geçerli Bir CVV numarası giriniz!!!",Toast.LENGTH_SHORT).show();
                }else if (etAdres.getText().toString().equals("")) {
                    Toast.makeText(PaymentScreenActivity.this, "Adres kısmı boş geçilemez!!!", Toast.LENGTH_SHORT).show();
                }else if (etTcKimlik.getText().toString().equals("") |
                        etTcKimlik.getText().toString().length() != 11) {
                    Toast.makeText(PaymentScreenActivity.this, "Geçerli Bir TC Kimlik numarası giriniz!!!", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(PaymentScreenActivity.this,"Ödeme işlemi başarılı...",Toast.LENGTH_SHORT).show();
                    Toast.makeText(PaymentScreenActivity.this,"2s-d8-8Q-ff-Et-44",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}