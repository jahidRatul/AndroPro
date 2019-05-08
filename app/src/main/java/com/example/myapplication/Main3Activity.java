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
        TextView spinnerText =findViewById(R.id.textView3);
        TextView gender =findViewById(R.id.textView4);
        TextView agreement = findViewById(R.id.textView5);

        String pass_name = getIntent().getStringExtra("Name");
        String pass_email = getIntent().getStringExtra("Email");
        String pass_spinner = getIntent().getStringExtra("SpinnerText");
        String pass_gender = getIntent().getStringExtra("checked");
        String pass_agreement = getIntent().getStringExtra("agreementCheck");
        
        name.setText(pass_name);
        email.setText(pass_email);
        spinnerText.setText(pass_spinner);
        gender.setText(pass_gender);
        agreement.setText(pass_agreement);









    }
}
