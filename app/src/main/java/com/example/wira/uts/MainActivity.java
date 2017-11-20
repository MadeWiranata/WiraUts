package com.example.wira.uts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView imgView;
    TextView txtView;
    int linkGambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        Intent intent = getIntent();
        String Tit = intent.getStringExtra("Tit");

        setTitle(Tit);
        linkGambar = intent.getIntExtra("gambar", linkGambar);
        imgView.setImageResource(linkGambar);
        txtView.setText(intent.getStringExtra("text"));
    }
}
