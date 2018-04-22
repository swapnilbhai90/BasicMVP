package com.cloneplanets.basicmvp.Utils;

import android.content.SharedPreferences;
import android.util.Log;

/**
 * Created by swapnilbhaisare on 13/04/18.
 */

public class BasicUtilitites {

    public static void setLogin(SharedPreferences sharedPreferences, boolean action){


 SharedPreferences.Editor editor= sharedPreferences.edit();
        editor.putBoolean("isLogin", action);
        editor.commit();
    }

    public static void setEmail(SharedPreferences sharedPreferences, String value){
        SharedPreferences.Editor editor= sharedPreferences.edit();
        editor.putString("emailId", value);
        editor.commit();

    }

    public  static String getSharedString (SharedPreferences sharedPreferences, String key)
    {
        return sharedPreferences.getString(key,"");
    }

    public  static boolean isLogin (SharedPreferences sharedPreferences)
    {
        return sharedPreferences.getBoolean("isLogin",false);
    }
}
