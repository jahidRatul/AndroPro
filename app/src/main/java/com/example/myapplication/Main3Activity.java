package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        TextView name =findViewById(R.id.textView1);
        TextView email =findViewById(R.id.textView2);

        String value = getIntent().getStringExtra("Name");
        String pass_val = getIntent().getStringExtra("Email");
        name.setText(value);
        email.setText(pass_val);





    }
}
