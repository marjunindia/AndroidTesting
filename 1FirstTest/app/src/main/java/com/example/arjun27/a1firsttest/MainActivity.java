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

public class MainActivity extends AppCompatActivity implements MainActivityView {


    RelativeLayout relativeLayout;
    EditText editText;
    TextView mytextview;
    Spinner spinner;
    Button launchActivity;
    String[] country = { "India", "USA" };
    MainActivityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new MainActivityPresenter(this);
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
                    presenter.editTextUpdated(text);
                }
                return false;
            }
        });

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                presenter.colorSelected(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        launchActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.launchother(OtherActivity.class);
            }
        });

    }

    @Override
    public void changeTextviewText(String text) {
        mytextview.setText(text);

    }

    @Override
    public void changeBackgroundColor(int color) {
        relativeLayout.setBackgroundColor(color);

    }

    @Override
    public void launchOtherActivity(Class activity) {
        startActivity(new Intent(MainActivity.this, activity));

    }
}
