package com.example.pj11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;


public class login extends AppCompatActivity {

    private TextView link_signup;
    private Button login;
    private TextView fgtPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        FacebookSdk.sdkInitialize(getApplicationContext());
        AppEventsLogger.activateApp(this);


    link_signup=(TextView)findViewById(R.id.link_signup);
    TextView linkSignup = (TextView) findViewById(R.id.link_signup);
    linkSignup.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent();
            i.setClass(login.this, signup.class);
            startActivity(i);
        }
    });


    login = (Button)findViewById(R.id.login);
    Button Login=(Button)findViewById(R.id.login);
    Login.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            Intent i = new Intent();
            i.setClass(login.this, createChain.class);
            startActivity(i);
        }
    });

    fgtPassword = (TextView)findViewById(R.id.forgetPassword);
     TextView newPassword=(TextView)findViewById(R.id.forgetPassword);
     newPassword.setOnClickListener(new View.OnClickListener(){

         @Override
         public void onClick(View v) {
             Intent i = new Intent();
             i.setClass(login.this, ForgetPassword.class);
             startActivity(i);
         }
     });
    }


}
