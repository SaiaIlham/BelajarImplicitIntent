package com.si5a.belajarimplicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText et_Url, et_Lokasi, et_Text;
    Button btnBukaWebsite, btnBukaLokasi, btnBagikanTeks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_Url = findViewById(R.id.et_url);
        et_Lokasi = findViewById(R.id.et_lokasi);
        et_Text = findViewById(R.id.et_teks);
        btnBukaWebsite = findViewById(R.id.btn_buka_website);
        btnBukaLokasi = findViewById(R.id.btn_buka_lokasi);
        btnBagikanTeks = findViewById(R.id.btn_bagikan_teks);

        btnBukaWebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String urlWebsite = et_Url.getText().toString();
                Uri uriUrlWebsite = Uri.parse(urlWebsite);
                Intent intentWebsite= new Intent(Intent.ACTION_VIEW, uriUrlWebsite);
                startActivity(intentWebsite);
                try {
                    startActivity(intentWebsite);
                }catch (Exception e){
                    et_Url.setError("Url Idak Suai Oi !!");

                }
            }
        });
        btnBukaLokasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btnBagikanTeks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}