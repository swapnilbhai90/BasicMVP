package com.cloneplanets.basicmvp.repository;

import com.cloneplanets.basicmvp.model.Login;

/**
 * Created by swapnilbhaisare on 13/04/18.
 */

public interface LoginRepository {

    boolean checkLogin(String email,String password);

    boolean checkEmail(String email);
    boolean checkPassword(String password);


}
