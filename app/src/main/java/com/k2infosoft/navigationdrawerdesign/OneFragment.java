package com.k2infosoft.navigationdrawerdesign;


import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import yalantis.com.sidemenu.interfaces.ScreenShotable;

/*
* @author:kaushal kishore
* Created on:12:02:2017
*/
public class OneFragment extends Fragment implements ScreenShotable {
    private View containerView;
    private Bitmap bitmap;


    public OneFragment() {
        // Required empty public constructor
    }

    public static OneFragment newInstance(int resId) {
        OneFragment oneFragment = new OneFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(Integer.class.getName(), resId);
        oneFragment.setArguments(bundle);
        return oneFragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_one, container, false);
    }

    @Override
    public void takeScreenShot() {

    }

    @Override
    public Bitmap getBitmap() {
        return bitmap;
    }
}
