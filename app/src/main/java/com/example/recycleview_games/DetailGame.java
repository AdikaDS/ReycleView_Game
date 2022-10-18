package com.example.recycleview_games;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailGame extends AppCompatActivity {

    TextView txtNama, txtPublish, txtDesk;
    String name, publish, desc;
    int img_photo;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_game);

        Bundle bundle = getIntent().getExtras();
        name = bundle.getString("nama");
        publish = bundle.getString("publish");
        desc = bundle.getString("desk");
        img_photo = bundle.getInt("pict");

        txtNama = findViewById(R.id.txt_nama);
        txtPublish = findViewById(R.id.txt_publisher);
        txtDesk = findViewById(R.id.txt_desk);
        img = findViewById(R.id.gbr_game);

        txtNama.setText(name);
        txtPublish.setText(publish);
        txtDesk.setText(desc);

        Glide.with(DetailGame.this)
                .load(img_photo)
                .apply(new RequestOptions().override(370,370))
                .into(img);
    }
}