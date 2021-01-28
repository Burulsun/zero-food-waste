package com.example.newfyp.Common.LoginPage;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.newfyp.Common.Choice;
import com.example.newfyp.Common.Food_add;
import com.example.newfyp.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SignUp extends AppCompatActivity {

    private static final Pattern PASSWORD_PATTERN =
            Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$*).{6,}" +
                    "$");


    EditText regName, regUsername, regEmail, regPhoneNo, regPassword;
    Button btnGo;
    Button alreadySigned;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

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
        }else if (!Patterns.EMAIL_ADDRESS.matcher(strEmail).matches()) {
            regEmail.setError("Please enter a valid email address");
            return false;
        }else {
            regEmail.setError(null);
            return true;
        }
    }
    private boolean validatePassword() {
        String strPassword = regPassword.getText().toString().trim();
        if (strPassword.isEmpty()) {
            regPassword.setError("Field cannot be empty");
            return false;
        }else if (!PASSWORD_PATTERN.matcher(strPassword).matches()) {
            regPassword.setError("Password is weak");
            return false;
        }else {
            regPassword.setError(null);
            return true;
        }
    }
    private boolean validateUserName() {
        String strUserName = regUsername.getText().toString().trim();
        if (strUserName.isEmpty()) {
            regPassword.setError("Field cannot be empty");
            return false;
        }else if (strUserName.length()>15) {
            regPassword.setError("User name is too long");
            return false;
        }else {
            regPassword.setError(null);
            return true;
        }
    }
    private boolean validatePhone() {
        String strPhone = regPhoneNo.getText().toString().trim();
        if (strPhone.isEmpty()) {
            regPhoneNo.setError("Field cannot be empty");
            return false;
        }else if (strPhone.length()!=10 ) {
            regPhoneNo.setError("Invalid number");
            return false;
        }else {
            regPhoneNo.setError(null);
            return true;
        }
    }

    private boolean validateName() {
        String strName = regName.getText().toString().trim();
        if (strName.isEmpty()) {
            regName.setError("Field cannot be empty");
            return false;

        }else {
            regName.setError(null);
            return true;
        }
    }

    public void confirmInput(View v){
        if(!validatePassword() | !validateName() | !validateEmail() | !validatePhone() | !validateUserName()){
            return;
        }
        String input = "Email: " +regName.getText().toString();
        input += "\n";
        input += "UserName: " +regUsername.getText().toString();
        input += "\n";
        input += "Password: " +regPassword.getText().toString();
        input += "\n";
        input += "Phone number: " +regPhoneNo.getText().toString();
        input += "\n";
        input += "Email: " +regEmail.getText().toString();

        Toast.makeText(this, input, Toast.LENGTH_SHORT).show();
        if (validatePassword() && validateUserName() && validateName() && validateEmail() && validatePhone()){
            Intent i = new Intent(SignUp.this, Food_add.class);
                startActivity(i);
                //finish();
        }

    }
    public void alreadySigned(View v){
        Intent i = new Intent(SignUp.this, LogIn.class);
        startActivity(i);
        //finish();
    }



}



//        alreadySigned.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(SignUp.this, LogIn.class);
//                startActivity(i);
//                finish();
//            }
//        });
//
//        btnGo.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String strName = regName.getText().toString().trim();
//                String strUserName = regUsername.getText().toString().trim();
//                String strEmail = regEmail.getText().toString().trim();
//                String emailPattern = "[a-zA-z0-9._-}+@[a-z]+\\.+[a-z]+";
//                String strPhone = regPhoneNo.getText().toString().trim();
//                String strPassword = regPassword.getText().toString().trim();

//
//
//                try {
//
//                    if (TextUtils.isEmpty(strUserName)) {
//                        regUsername.setError("Field cannot be empty");
//                        return;
//                    }
//                    if (strUserName.length() >= 15) {
//                        regUsername.setError("Username too long");
//                        return;
//                    }
//
//                    if (!strEmail.matches((emailPattern))) {
//                        regEmail.setError("Invalid email address");
//                        return;
//                    }
//                    if (TextUtils.isEmpty(strPhone)) {
//                        regPhoneNo.setError("Field cannot be empty");
//                        return;
//                    }
////                if (validatePhoneNo()==false){
////                    regPhoneNo.setError("Invalid phone number");
////                    return;
////
////                }
//                    if (TextUtils.isEmpty(strPassword)) {
//                        regPassword.setError("Field cannot be empty");
//                        return;
//                    }
//
//                    if (!TextUtils.isEmpty(strName) && !TextUtils.isEmpty(strUserName) && !TextUtils.isEmpty(strEmail) && !TextUtils.isEmpty(strPhone) && !TextUtils.isEmpty(strPassword)
//                            && !strEmail.matches((emailPattern)) && strUserName.length() <= 15) {
//                        Intent i = new Intent(SignUp.this, LogIn.class);
//                        startActivity(i);
//                        finish();
//                    }
//                }catch (Exception e){
//                    Toast.makeText(SignUp.this, "User Created", Toast.LENGTH_SHORT).show();
//                }
//

//                if(validatePassword()==false){
//                    regPassword.setError("Invalid password");
//                    return;
//                }

//                fAuth.createUserWithEmailAndPassword(strEmail, strPassword).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
//                    @Override
//                    public void onComplete(@NonNull Task<AuthResult> task) {
//                        if (task.isSuccessful()) {
//                            Toast.makeText(SignUp.this, "User Created", Toast.LENGTH_SHORT).show();
                            //startActivity(new Intent(getApplicationContext(), Choice.class));




//                        } else {
//                            Toast.makeText(SignUp.this, "Error!" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
//                        }
//                    }
//                });




//            }
//        });
//
//
//    }
//}

//    private Boolean validatePhoneNo() {
//        String val = regPhoneNo.getText().toString().trim();
//        String regex = "[0]{1}\\d{9}";
//        Pattern p3 = Pattern.compile(regex);
//        Matcher m3 = p3.matcher(val);
//        if (val.isEmpty()) {
//            regPhoneNo.setError("Field cannot be empty");
//            return false;
//        } else if (!val.isEmpty()) {
//            if (m3.matches())
//                return true;
//        } else {
//            regPhoneNo.setError(null);
//            //regPhoneNo.setErrorEnabled(false);
//            return false;
//        }
//        return true;
//    }
//
//    private Boolean validatePassword(){
//        String val = regPassword.getText().toString().trim();
//
////        if(val.isEmpty()){
////            regPassword.setError("Field cannot be empty");
////            return false;
////        }
////        else{
////            regPassword.setError(null);
////            return true;
////        }
//
//        char c;
//        int digit = 0, lower = 0, upper = 0, special = 0;
//        //String[] symbol = new String[]{"@", "#", "$", "%"};
//        int length = val.length();
//
//
//        if (length >= 8 && length <= 20) {
//            for (int i = 0; i < length; i++) {
//                c = val.charAt(i);
//                if (Character.isDigit(c)) {
//                    digit += 1;
//                } else if (Character.isLowerCase(c)) {
//                    lower += 1;
//                } else if (Character.isUpperCase(c)) {
//                    upper += 1;
//                } else if (Character.isLowerCase(c) == false && Character.isDigit(c) == false && Character.isUpperCase(c) == false) {
//                    switch (String.valueOf(c)) {
//                        case "@":
//                            special += 1;
//                            break;
//                        case "#":
//                            special += 1;
//                            break;
//
//                        case "$":
//                            special += 1;
//                            break;
//
//                        case "%":
//                            special += 1;
//                            break;
//                        default:
//                            throw new IllegalStateException("Unexpected value: " + c);
//                    }
//                }
//
//
//            }
//            if (digit >= 1 && upper >= 1 && lower >= 1 && special >= 1) {
//                return true;
//            }
//
//        }
//
//        return false;

//    }






//}