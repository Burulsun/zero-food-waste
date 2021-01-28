package com.example.newfyp.Common.LoginPage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.newfyp.Common.Food_add;
import com.example.newfyp.R;
import com.google.android.gms.common.internal.service.Common;

import java.util.regex.Pattern;

public class LogIn extends AppCompatActivity {
    private static final Pattern PASSWORD_PATTERN =
            Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$*).{6,}" +
                    "$");

    Button callSignUp, go_btn;
    EditText userName, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        callSignUp = findViewById(R.id.signup);
        go_btn =findViewById(R.id.log_in_btn);
        userName =findViewById(R.id.username);
        password =findViewById(R.id.password);
    }

    private boolean validatePassword() {
        String strPassword = password.getText().toString().trim();
        if (strPassword.isEmpty()) {
            password.setError("Field cannot be empty");
            return false;
        }else if (!PASSWORD_PATTERN.matcher(strPassword).matches()) {
            password.setError("Password is weak");
            return false;
        }else {
            password.setError(null);
            return true;
        }
    }
    private boolean validateUserName() {
        String strUserName = userName.getText().toString().trim();
        if (strUserName.isEmpty()) {
            password.setError("Field cannot be empty");
            return false;
        }else if (strUserName.length()>15) {
            password.setError("User name is too long");
            return false;
        }else {
            password.setError(null);
            return true;
        }
    }


    public void confirmInput(View v){
        if(validatePassword() && validateUserName()){
            return;
        }
        String input = "User name: " +userName.getText().toString();
        input += "\n";

        input += "Password: " +password.getText().toString();
        input += "\n";


        Toast.makeText(this, input, Toast.LENGTH_SHORT).show();
        if (validatePassword() && validateUserName()){
            Intent i = new Intent(LogIn.this, Food_add.class);
            startActivity(i);
            //finish();
        }

    }
    public void newIn(View view){
        Intent i = new Intent(LogIn.this, SignUp.class);
        startActivity(i);
        //finish();
    }
}

//        callSignUp.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(LogIn.this, SignUp.class);
//                startActivity(intent);
//            }
//        });

