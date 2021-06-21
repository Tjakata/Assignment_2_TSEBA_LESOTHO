package com.example.tsebalesotho;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class details extends AppCompatActivity {

    ImageView image;
    TextView textTitle, textDesc1,textDesc2,textDesc3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        textTitle = findViewById(R.id.title2);
        textDesc1 = findViewById(R.id.desc1);
        textDesc2 = findViewById(R.id.desc2);
        textDesc3 = findViewById(R.id.desc3);

        String title1 = getIntent().getExtras().getString("title2");
        int image2 = getIntent().getExtras().getInt("img");
        String name1 = getIntent().getExtras().getString("desc1");
        String name2 = getIntent().getExtras().getString("desc2");
        String name3 = getIntent().getExtras().getString("desc3");

        Bundle extras = getIntent().getExtras();
        if (extras != null){
             title1 = getIntent().getExtras().getString("title2");
             image2 = getIntent().getExtras().getInt("img");
             name1 = getIntent().getExtras().getString("desc1");
             name2 = getIntent().getExtras().getString("desc2");
             name3 = getIntent().getExtras().getString("desc3");

        }
        image.setImageResource(image2);
        textTitle.setText(title1);
        textDesc1.setText(name1);
        textDesc2.setText(name2);
        textDesc3.setText(name3);

        /*image.setImageResource(image2);
        textTitle.setText(title1);
        textDesc1.setText(name1);
        textDesc2.setText(name2);
        textDesc3.setText(name3);*/
        /*String name1 = getIntent().getExtras().getString("title2");
        int img = getIntent().getExtras().getInt("img");
        String name2 = getIntent().getExtras().getString("desc1");

        image.setImageResource(img);
        textTitle.setText(name1);
        textDesc1.setText(name2);*/
    }
}