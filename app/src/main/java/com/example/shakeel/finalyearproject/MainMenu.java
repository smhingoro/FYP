package com.example.shakeel.finalyearproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainMenu extends AppCompatActivity {
    ImageView shopping, utilities, laundry, plumber, electrician, carpenter, about,contact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        shopping = (ImageView)findViewById(R.id.Shopping);
        utilities = (ImageView)findViewById(R.id.Utilities);
        laundry = (ImageView)findViewById(R.id.Laundry);
        plumber = (ImageView)findViewById(R.id.Plumber);
        electrician = (ImageView)findViewById(R.id.Electrician);
        carpenter = (ImageView)findViewById(R.id.Carpenter);
        about = (ImageView)findViewById(R.id.About_us);
        contact = (ImageView)findViewById(R.id.Contact_us);

        shopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent click = new Intent(MainMenu.this, GroceryActivity.class);
                startActivity(click);
            }
        });
        utilities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        laundry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        plumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        electrician.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        carpenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
