package com.cloneplanets.basicmvp.presenter;

import com.cloneplanets.basicmvp.view.LoginView;

/**
 * Created by swapnilbhaisare on 13/04/18.
 */

public interface LoginPresenter {

   public void setView(LoginView view);

   public void checkLogin();

}

