package edu.temple.signupform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        Intent intent = getIntent();
        String userName = intent.getStringExtra("NAME");

        TextView welcome = (TextView) findViewById(R.id.welcomeText);
        welcome.setText("Welcome, "+userName+", to the SignUpForm App!");
    }
}
