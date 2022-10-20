package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void alamat(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Jl.+Nakula+1+No.6,+Pendrikan+Kidul,+Kec.+Semarang+Tengah,+Kota+Semarang,+Jawa+Tengah+50131/@-6.981512,110.409306,20.45z/data=!4m5!3m4!1s0x2e708b4ea4620dfd:0xa0afe495afdc2df3!8m2!3d-6.9815112!4d110.4093859"));
        startActivity(intent);
    }
    public void email(View view) {
        Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:111202113721@mhs.dinus.ac.id"));
        startActivity(intent);
    }
    public void telepon(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://api.whatsapp.com/send?phone=6281548944076"));
        startActivity(intent);
    }
}