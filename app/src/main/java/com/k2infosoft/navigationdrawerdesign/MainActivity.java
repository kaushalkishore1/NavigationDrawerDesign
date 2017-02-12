package com.k2infosoft.navigationdrawerdesign;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.k2infosoft.navigationdrawerdesign.utils.IntentUtils;
import com.mikepenz.materialdrawer.MiniDrawer;
/*
* @author:kaushal kishore
* Created on:12:02:2017
*/
public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    com.github.rubensousa.raiflatbutton.RaiflatButton normalButton_cust, normalButton_mini, normalButton_side, normalButton_bar, normalButton_sliding, normalButton_flowing, normalButton_fade, normalButton_persistent;
    com.k2infosoft.k2awesomesubmit.SubmitButton custom_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        normalButton_cust = (com.github.rubensousa.raiflatbutton.RaiflatButton) findViewById(R.id.normalButton_cust);
        normalButton_mini = (com.github.rubensousa.raiflatbutton.RaiflatButton) findViewById(R.id.normalButton_mini);
        normalButton_side = (com.github.rubensousa.raiflatbutton.RaiflatButton) findViewById(R.id.normalButton_side);
        normalButton_bar = (com.github.rubensousa.raiflatbutton.RaiflatButton) findViewById(R.id.normalButton_bar);
        normalButton_sliding = (com.github.rubensousa.raiflatbutton.RaiflatButton) findViewById(R.id.normalButton_sliding);
        normalButton_flowing = (com.github.rubensousa.raiflatbutton.RaiflatButton) findViewById(R.id.normalButton_flowing);
        normalButton_fade = (com.github.rubensousa.raiflatbutton.RaiflatButton) findViewById(R.id.normalButton_fade);
        normalButton_persistent = (com.github.rubensousa.raiflatbutton.RaiflatButton) findViewById(R.id.normalButton_persistent);
        custom_btn = (com.k2infosoft.k2awesomesubmit.SubmitButton) findViewById(R.id.custom_btn);

        normalButton_cust.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CustomNavigation.class));
            }
        });

        normalButton_mini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MiniDrawerActivity.class));
            }
        });

        normalButton_side.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SideMenu.class));
            }
        });

        normalButton_bar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MiniDrawerActivity.class));
            }
        });

        normalButton_sliding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SlidingNavigation.class));
            }
        });
        normalButton_flowing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, FlowingDrawer.class));
            }
        });

        normalButton_fade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, FadeSideMenu.class));
            }
        });
        normalButton_persistent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, PersistentDrawerActivity.class));
            }
        });
        custom_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, NavGridMenu.class));
            }
        });


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch (item.getItemId()) {
            case R.id.action_about:
                IntentUtils.openUrl(this, "https://github.com/kaushalkishore1/TabDesigns");
                break;
            case R.id.action_about_me:
                IntentUtils.openUrl(this, "https://in.linkedin.com/in/kaushal-kishore-96910758");
                break;
            case R.id.action_settings:
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_profile) {
            // Handle the camera action
           /* Intent intent = new Intent(MainActivity.this, CustomNavigation.class);
            startActivity(intent);*/
        } else if (id == R.id.nav_gallery) {
            /*Intent intent = new Intent(MainActivity.this, NavGridMenu.class);
            startActivity(intent);*/
        } else if (id == R.id.nav_checklist) {
           /* Intent intent = new Intent(MainActivity.this, SideMenu.class);
            startActivity(intent);*/
        } else if (id == R.id.nav_wishlist) {
            /*Intent intent = new Intent(MainActivity.this, BarNavigation.class);
            startActivity(intent);*/
        } else if (id == R.id.nav_share) {
            /*Intent intent = new Intent(MainActivity.this, FlowingDrawer.class);
            startActivity(intent);*/
        } else if (id == R.id.nav_send) {
            /*Intent intent = new Intent(MainActivity.this, FadeSideMenu.class);
            startActivity(intent);*/
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
