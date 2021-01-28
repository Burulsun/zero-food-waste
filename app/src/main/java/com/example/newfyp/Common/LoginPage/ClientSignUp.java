package com.example.newfyp.Common.LoginPage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.newfyp.Common.MainPage;
import com.example.newfyp.R;

import java.util.regex.Pattern;

public class ClientSignUp extends AppCompatActivity {
    private static final Pattern PASSWORD_PATTERN =
            Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$*).{6,}" +
                    "$");


    EditText regName, regUsername, regEmail, regPhoneNo, regPassword;
    Button btnGo;
    Button alreadySigned;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client_sign_up);

        regName = (EditText) findViewById(R.id.name);
        regUsername = (EditText) findViewById(R.id.username);
        regEmail = (EditText) findViewById(R.id.email);
        regPassword = (EditText) findViewById(R.id.password);
        regPhoneNo = (EditText) findViewById(R.id.number);
        btnGo = (Button) findViewById(R.id.reg_btn);
        alreadySigned = (Button) findViewById(R.id.login_btn);
    }

    private boolean validateEmail() {
        String strEmail = regEmail.getText().toString().trim();
        if (strEmail.isEmpty()) {
            regEmail.setError("Field cannot be empty");
            return false;
        } else if (!Patterns.EMAIL_ADDRESS.matcher(strEmail).matches()) {
            regEmail.setError("Please enter a valid email address");
            return false;
        } else {
            regEmail.setError(null);
            return true;
        }
    }

    private boolean validatePassword() {
        String strPassword = regPassword.getText().toString().trim();
        if (strPassword.isEmpty()) {
            regPassword.setError("Field cannot be empty");
            return false;
        } else if (!PASSWORD_PATTERN.matcher(strPassword).matches()) {
            regPassword.setError("Password is weak");
            return false;
        } else {
            regPassword.setError(null);
            return true;
        }
    }

    private boolean validateUserName() {
        String strUserName = regUsername.getText().toString().trim();
        if (strUserName.isEmpty()) {
            regUsername.setError("Field cannot be empty");
            return false;
        } else if (strUserName.length() > 15) {
            regUsername.setError("User name is too long");
            return false;
        } else {
            regUsername.setError(null);
            return true;
        }
    }

    private boolean validatePhone() {
        String strPhone = regPhoneNo.getText().toString().trim();
        if (strPhone.isEmpty()) {
            regPhoneNo.setError("Field cannot be empty");
            return false;
        } else if (strPhone.length() != 10) {
            regPhoneNo.setError("Invalid number");
            return false;
        } else {
            regPhoneNo.setError(null);
            return true;
        }
    }

    private boolean validateName() {
        String strName = regName.getText().toString().trim();
        if (strName.isEmpty()) {
            regName.setError("Field cannot be empty");
            return false;
        
        } else {
            regName.setError(null);
            return true;
        }
    }

    public void confirmInput(View v) {
        if (!validatePassword() | !validateName() | !validateEmail() | !validatePhone() | !validateUserName()) {
            return;
        }
        String input = "Email: " + regName.getText().toString();
        input += "\n";
        input += "UserName: " + regUsername.getText().toString();
        input += "\n";
        input += "Password: " + regPassword.getText().toString();
        input += "\n";
        input += "Phone number: " + regPhoneNo.getText().toString();
        input += "\n";
        input += "Email: " + regEmail.getText().toString();

        Toast.makeText(this, input, Toast.LENGTH_SHORT).show();
        if (validatePassword() && validateUserName() && validateName() && validateEmail() && validatePhone()) {
            Intent i = new Intent(ClientSignUp.this, MainPage.class);
            startActivity(i);
            //finish();
        }

    }

    public void alreadySigned(View v){
        Intent i = new Intent(ClientSignUp.this, LogIn.class);
        startActivity(i);
        //finish();
    }
}
