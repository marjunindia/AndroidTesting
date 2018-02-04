package com.example.arjun27.a1firsttest;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;

import static android.R.attr.country;

public class MainActivity extends AppCompatActivity {


    RelativeLayout relativeLayout;
    EditText editText;
    TextView mytextview;
    Spinner spinner;
    Button launchActivity;
    String[] country = { "India", "USA" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mytextview= (TextView) findViewById(R.id.textView);
        relativeLayout= (RelativeLayout) findViewById(R.id.layout);
        editText= (EditText) findViewById(R.id.editText);
        spinner= (Spinner) findViewById(R.id.myspinner);
        launchActivity= (Button) findViewById(R.id.button);

        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,country);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spinner.setAdapter(aa);
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {

                if(i== EditorInfo.IME_ACTION_DONE){
                    String text=textView.getText().toString();
                    mytextview.setText(text);
                }
                return false;
            }
        });

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        relativeLayout.setBackgroundColor(Color.CYAN);
                        break;
                    case 1:
                        relativeLayout.setBackgroundColor(Color.GREEN);

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        launchActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,OtherActivity.class));
            }
        });

    }
}
