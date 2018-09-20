package edu.temple.signupform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FormActivity extends AppCompatActivity {

    Button signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        signUp = (Button) findViewById(R.id.signUpBtn);
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchActivity();
            }
        });
    }

    private void checkEditText(){
        
    }

    private void launchActivity(){
        Intent intent = new Intent(this, WelcomeActivity.class);
        startActivity(intent);
    }

}
