package com.cloneplanets.basicmvp.repository;

import com.cloneplanets.basicmvp.model.Login;

/**
 * Created by swapnilbhaisare on 13/04/18.
 */

public class LoginRepositoryIml implements LoginRepository {

    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

    @Override
    public boolean checkLogin(String email, String password) {


        if (checkEmail(email) && checkPassword(password))
            return true;
            else
                return  false;


    }

    @Override
    public boolean checkEmail(String email) {
        if (email.matches(emailPattern) && email.length() > 0)
        {
           return true;
        }
        else
        {
            return false;
        }
    }



    @Override
    public boolean checkPassword(String password) {
        if (!password.isEmpty())
            return true;
        else
            return  false;
    }
}
