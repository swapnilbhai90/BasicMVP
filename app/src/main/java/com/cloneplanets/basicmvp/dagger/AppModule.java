package com.cloneplanets.basicmvp.dagger;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.cloneplanets.basicmvp.presenter.LoginPreseneterImpl;
import com.cloneplanets.basicmvp.presenter.LoginPresenter;
import com.cloneplanets.basicmvp.repository.LoginRepository;
import com.cloneplanets.basicmvp.repository.LoginRepositoryIml;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by swapnilbhaisare on 13/04/18.
 */

@Module
public class AppModule {

   Application application;


    public AppModule(Application application) {
        this.application = application;
    }


    @Provides @Singleton
    public Context provideContext() {return  application;}

    @Provides @Singleton
    public  SharedPreferences provideSharedPref(Context context){
        return context.getSharedPreferences("app",Context.MODE_PRIVATE);
    }



    @Provides @Singleton
    public LoginRepository provideLoginRepository()
    {
        return  new LoginRepositoryIml();
    }

    @Provides @Singleton
    public LoginPresenter provideLoginPresenter(LoginRepository userRepo)
    {

        return new LoginPreseneterImpl(userRepo);

    }


}
