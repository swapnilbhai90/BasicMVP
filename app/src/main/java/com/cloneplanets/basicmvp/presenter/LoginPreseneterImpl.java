package com.cloneplanets.basicmvp.presenter;

import android.content.SharedPreferences;
import android.util.Log;

import com.cloneplanets.basicmvp.Utils.BasicUtilitites;
import com.cloneplanets.basicmvp.repository.LoginRepository;
import com.cloneplanets.basicmvp.view.LoginView;

import javax.inject.Inject;

/**
 * Created by swapnilbhaisare on 13/04/18.
 */

public class LoginPreseneterImpl implements LoginPresenter {

    @Inject
    SharedPreferences preferences;
    LoginView view;
    LoginRepository repository;
    public LoginPreseneterImpl(LoginRepository userRepo) {
        repository=userRepo;

    }

    @Override
    public void setView(LoginView view) {
        this.view=view;

    }

    @Override
    public void checkLogin() {



        if(repository.checkLogin(view.getEmailId(),view.getPassword()))
        {

            view.setLogin(view.getEmailId(),true);
            view.gotoMainActivity();

        }
        else
        {
            view.setLogin(view.getEmailId(),false);

            view.displayErrorMsg();
        }






    }
}
