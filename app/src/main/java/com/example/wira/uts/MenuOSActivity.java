package com.example.wira.uts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MenuOSActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView list;
    Intent intent;
    String[] osname = {"Persegi","Lingkaran","Segiiga","Persegi Panjang","Trapesium"};
    Integer[] imgid = {R.drawable.persegi, R.drawable.lingkaran, R.drawable.persegi_panjang };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_os);

        customListAdapter adapter = new customListAdapter(this, osname, imgid );
        list =(ListView) findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(this);
    }

    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position) {
            case 0:
                intent = new Intent(MenuOSActivity.this, MainActivity.class);
                intent.putExtra("Tit", "Persegi");
                startActivity(intent);
                break;

            case 1:
                intent = new Intent(MenuOSActivity.this, MainActivity.class);
                intent.putExtra("Tit", "Lingkaran");
                startActivity(intent);
                break;

            case 2:
                intent = new Intent(MenuOSActivity.this, MainActivity.class);
                intent.putExtra("Tit", "Segitiga");
                startActivity(intent);
                break;

            case 3:
                intent = new Intent(MenuOSActivity.this, MainActivity.class);
                intent.putExtra("Tit", "Persegi Panjang");
                startActivity(intent);
                break;

            case 4:
                intent = new Intent(MenuOSActivity.this, MainActivity.class);
                intent.putExtra("Tit", "Trapesium");
                startActivity(intent);
                break;


            default:
                break;
        }
    }
}
