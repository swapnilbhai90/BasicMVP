package com.cloneplanets.basicmvp;

import android.app.Application;

import com.cloneplanets.basicmvp.dagger.AppComponents;
import com.cloneplanets.basicmvp.dagger.AppModule;
import com.cloneplanets.basicmvp.dagger.DaggerAppComponents;

/**
 * Created by swapnilbhaisare on 13/04/18.
 */

public class BasicMVPApplication extends Application {

    AppComponents components;

    @Override
    public void onCreate() {
        super.onCreate();
        components= DaggerAppComponents.builder().appModule(new AppModule(this)).build();


    }

    public AppComponents getComponents() {
        return components;
    }
}
