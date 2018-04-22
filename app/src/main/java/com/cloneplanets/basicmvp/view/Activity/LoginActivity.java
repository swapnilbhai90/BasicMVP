package com.cloneplanets.basicmvp.view.Activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.cloneplanets.basicmvp.BasicMVPApplication;
import com.cloneplanets.basicmvp.R;
import com.cloneplanets.basicmvp.Utils.BasicUtilitites;
import com.cloneplanets.basicmvp.presenter.LoginPresenter;
import com.cloneplanets.basicmvp.view.LoginView;

import javax.inject.Inject;

public class LoginActivity extends AppCompatActivity implements LoginView {

   @Inject LoginPresenter presenter;
    private TextView txt_login;
    private EditText edtPassword;
    private EditText edtEmailId;

    @Inject
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((BasicMVPApplication)getApplication()).getComponents().inject(this);
        txt_login=(TextView)findViewById(R.id.txt_login);
        edtEmailId=(EditText)findViewById(R.id.edtEmailId);
        edtPassword=(EditText)findViewById(R.id.edtPassword);
        txt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.checkLogin();
            }
        });
        checkLogin();



    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.setView(this);

    }

    @Override
    public String getEmailId() {
        return edtEmailId.getText().toString();
    }

    @Override
    public String getPassword() {
        return edtPassword.getText().toString();
    }

    @Override
    public void displayEmailMsg() {

        Toast.makeText(getApplicationContext(),"Please enter correct data!",Toast.LENGTH_SHORT).show();

    }

    @Override
    public void displayPasswordMsg() {

    }

    @Override
    public void displayErrorMsg() {
        Toast.makeText(getApplicationContext(),"Please enter correct data!",Toast.LENGTH_SHORT).show();

    }

    @Override
    public void gotoMainActivity() {


        Intent intent=new Intent(LoginActivity.this,MainActivity.class);
        startActivity(intent);
        finish();

    }

    @Override
    public void resetViews() {

    }

    @Override
    public void checkLogin() {

        if(BasicUtilitites.isLogin(sharedPreferences))
        {
            gotoMainActivity();
        }

    }

    @Override
    public void setLogin(String email, Boolean flag) {

        if(flag)
        {

            BasicUtilitites.setLogin(sharedPreferences,true);
            BasicUtilitites.setEmail(sharedPreferences,email);
        }
        else{
            BasicUtilitites.setLogin(sharedPreferences,false);
            BasicUtilitites.setEmail(sharedPreferences,"");
        }



    }
}
