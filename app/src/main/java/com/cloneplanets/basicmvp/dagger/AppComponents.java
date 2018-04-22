package com.cloneplanets.basicmvp.dagger;

import com.cloneplanets.basicmvp.view.Activity.LoginActivity;
import com.cloneplanets.basicmvp.view.Activity.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by swapnilbhaisare on 13/04/18.
 */
@Singleton
@Component(modules = {AppModule.class})
public interface AppComponents {

    void inject(LoginActivity activity);
    void inject(MainActivity activity);
}
