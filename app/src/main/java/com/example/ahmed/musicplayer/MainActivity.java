package com.example.ahmed.musicplayer;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawer;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawer = findViewById(R.id.drawer);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawer,
                toolbar,R.string.open_nav,R.string.close_nav);
        drawer.addDrawerListener(toggle);

        toggle.syncState();



    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {

            case R.id.pop:
                Intent intent = new Intent(MainActivity.this,PlayList.class);
                intent.putExtra("music","pop");
                startActivity(intent);
                break;

            case R.id.rock:
                Intent intent1 = new Intent(MainActivity.this,PlayList.class);
                intent1.putExtra("music","rock");
                startActivity(intent1);
                break;

            case R.id.metal:
                Intent intent2 = new Intent(MainActivity.this,PlayList.class);
                intent2.putExtra("music","metal");
                startActivity(intent2);
                break;
        }

        drawer.closeDrawer(Gravity.START);
        return true;
    }
}
