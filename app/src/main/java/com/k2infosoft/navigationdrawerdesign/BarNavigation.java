package com.k2infosoft.navigationdrawerdesign;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;


import com.k2infosoft.k2awesomebar.ActionItem;
import com.k2infosoft.k2awesomebar.AwesomeBar;

import butterknife.Bind;
import butterknife.ButterKnife;

/*
* @author:kaushal kishore
* Created on:12:02:2017
*/
public class BarNavigation extends AppCompatActivity {

    @Bind(R.id.bar)
    AwesomeBar bar;

    @Bind(R.id.drawer_layout)
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar);
        ButterKnife.bind(this);

        bar.addAction(R.drawable.awsb_ic_edit_animated, "Compose");

        bar.setActionItemClickListener(new AwesomeBar.ActionItemClickListener() {
            @Override
            public void onActionItemClicked(int position, ActionItem actionItem) {
                Toast.makeText(getBaseContext(), actionItem.getText() + " clicked", Toast.LENGTH_LONG).show();
            }
        });

        bar.setOnMenuClickedListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(Gravity.LEFT);
            }
        });
    }
}
