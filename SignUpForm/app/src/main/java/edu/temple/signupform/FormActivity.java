package edu.temple.signupform;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {

    Button signUp;
    CharSequence notAllFilled = "Fill out all of the fields to continue.";
    CharSequence pwdNotEqual = "Both passwords are not equal.";
    int duration = Toast.LENGTH_LONG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        signUp = (Button) findViewById(R.id.signUpBtn);
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText nameUser = (EditText) findViewById(R.id.nameUserInput);
                EditText emailUser = (EditText) findViewById(R.id.emailUserInput);
                EditText pwdUser = (EditText) findViewById(R.id.password);
                EditText pwdConfirmInput = (EditText) findViewById(R.id.pwdConfirm);
                String name = nameUser.getText().toString().trim();
                String email = emailUser.getText().toString().trim();
                String pwd = pwdUser.getText().toString().trim();
                String pwdConfirm = pwdConfirmInput.getText().toString().trim();
                if(name.isEmpty() || name.length() == 0 || name.equals("") || name == null){
                    Toast emptyInputError = Toast.makeText(FormActivity.this, notAllFilled, duration);
                    emptyInputError.show();
                }
                else if(email.isEmpty() || email.length() == 0 || email.equals("") || email == null){
                    Toast emptyInputError = Toast.makeText(FormActivity.this, notAllFilled, duration);
                    emptyInputError.show();
                }
                else if(pwd.isEmpty() || pwd.length() == 0 || pwd.equals("") || pwd == null){
                    Toast emptyInputError = Toast.makeText(FormActivity.this, notAllFilled, duration);
                    emptyInputError.show();
                }
                else if(pwdConfirm.isEmpty() || pwdConfirm.length() == 0 || pwdConfirm.equals("") || pwdConfirm == null){
                    Toast emptyInputUser = Toast.makeText(FormActivity.this, notAllFilled, duration);
                    emptyInputUser.show();
                }
                else if(!pwd.equals(pwdConfirm)){
                    Toast pwdEqualsError = Toast.makeText(FormActivity.this, pwdNotEqual, duration);
                    pwdEqualsError.show();
                }
                else{
                    launchActivity();
                }
            }
        });
    }

    private void launchActivity(){
        Intent intent = new Intent(this, WelcomeActivity.class);
        EditText sendText = (EditText) findViewById(R.id.nameUserInput);
        intent.putExtra("NAME", sendText.getText().toString());

        startActivity(intent);
    }

}
