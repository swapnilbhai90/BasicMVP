package com.cloneplanets.basicmvp.view;

/**
 * Created by swapnilbhaisare on 13/04/18.
 */

public interface LoginView {

    public  String getEmailId();
    public  String getPassword();
    public  void displayEmailMsg();
    public  void displayPasswordMsg();
    public  void displayErrorMsg();
    public  void gotoMainActivity();
    public  void resetViews();
    public  void checkLogin();
    public  void setLogin(String email,Boolean flag);





}
