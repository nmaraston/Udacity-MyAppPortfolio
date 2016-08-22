package com.iopho.android.myappportfolio;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AppGalleryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button popularMoviesAppButton = (Button)findViewById(R.id.popular_movies_app_btn);
        Button stockHawkAppButton = (Button)findViewById(R.id.stock_hawk_app_btn);
        Button buildItBiggerAppButton = (Button)findViewById(R.id.build_it_bigger_app_btn);
        Button makeYourAppMaterialAppButton = (Button)findViewById(R.id.make_your_app_material_app_btn);
        Button goUbiquitousAppButton = (Button)findViewById(R.id.go_ubiquitous_app_btn);
        Button capstoneAppButton = (Button)findViewById(R.id.capstone_app_btn);

        popularMoviesAppButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onAppMenuButtonClick(view);
            }
        });
        stockHawkAppButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onAppMenuButtonClick(view);
            }
        });
        buildItBiggerAppButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onAppMenuButtonClick(view);
            }
        });
        makeYourAppMaterialAppButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onAppMenuButtonClick(view);
            }
        });
        goUbiquitousAppButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onAppMenuButtonClick(view);
            }
        });
        capstoneAppButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onAppMenuButtonClick(view);
            }
        });
    }

    private void onAppMenuButtonClick(View view) {

        Resources res = getResources();

        if (!(view instanceof Button)) {
            return;
        }

        Button appMenuButton = (Button)view;
        String appName = String.valueOf(appMenuButton.getText());
        String message = String.format(res.getString(R.string.app_menu_toast_message), appName);

        Toast toast = Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT);
        toast.show();
    }
}
