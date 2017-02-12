package com.k2infosoft.navigationdrawerdesign.utils;

import android.content.res.Resources;
/*
* @author:kaushal kishore
* Created on:12:02:2017
*/
public class SystemUtils {
    public static int getScreenOrientation() {
        return Resources.getSystem().getConfiguration().orientation;
    }
}
