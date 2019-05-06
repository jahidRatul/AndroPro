package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

public class Main2Activity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    String gender="male";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final EditText userName =  findViewById(R.id.placeName);
        final EditText userEmail = findViewById(R.id.placeEmail);
        final Spinner spinner = findViewById(R.id.divisionSpinner);




        final Button button = findViewById(R.id.go3rdActivity);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                Intent intent=new Intent(Main2Activity.this,Main3Activity.class);
                String NameValue = userName.getText().toString();
                String EmailValue = userEmail.getText().toString();
                String SpinnerText = spinner.getSelectedItem().toString();
                intent.putExtra("Name",NameValue);
                intent.putExtra("Email",EmailValue);
                intent.putExtra("SpinnerText",SpinnerText);
                intent.putExtra("checked",gender);

                startActivity(intent);

            }
        });




//       Spinner spinner = findViewById(R.id.genderSpinner);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.divisionArray, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }


    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_male:
                if (checked)
                    gender="male";
                break;
            case R.id.radio_female:
                if (checked)
                    gender="female";
                break;
        }
    }
}

