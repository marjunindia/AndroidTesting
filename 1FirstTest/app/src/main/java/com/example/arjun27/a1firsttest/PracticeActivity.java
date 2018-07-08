package com.example.arjun27.a1firsttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PracticeActivity extends AppCompatActivity implements PracticeView {

    EditText editText;
    Button button;
    TextView textView;
    String strval;

    PracticcePresenter  practiccePresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice);
        editText=(EditText)findViewById(R.id.editText1);
        button=(Button) findViewById(R.id.button1);
        textView=(TextView) findViewById(R.id.textView1);
        practiccePresenter=new PracticcePresenter(this);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                practiccePresenter.gettext();
                practiccePresenter.settext(practiccePresenter.gettext());
            }
        });
    }

    @Override
    public String gettext() {
       return strval= editText.getText().toString();
    }

    @Override
    public void settext(String s) {
        textView.setText(strval);

    }
}
