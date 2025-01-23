package com.example.quizzproject;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Switch;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class TeacherDashBoard extends AppCompatActivity {
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_dash_board);

        drawerLayout = findViewById(R.id.main_drawer_layout);
        navigationView = findViewById(R.id.navigation_view);

        //open drawer by clicking all features button
        findViewById(R.id.iv_all_features).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });

        //navigation view functionality
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int id = menuItem.getItemId();

                if(id == R.id.item_courses) {
                    //courses fragment

                }else if(id == R.id.item_result) {
                    //result fragment

                }if(id == R.id.item_profile) {
                    //profile fragment

                }else if(id == R.id.item_notification) {
                    //notification fragment

                }else if(id == R.id.item_message) {
                    //message fragment

                }else if(id == R.id.item_logout) {
                    //log out feature

                }else if(id == R.id.item_settings) {
                    //settings fragment

                }else if(id == R.id.item_privacy) {
                    //privacy policy fragment

                }else if(id == R.id.item_share) {
                    //share feature

                }else if(id == R.id.item_about_us) {
                    //about us feature

                }

                    return true;
            }
        });

    }
}