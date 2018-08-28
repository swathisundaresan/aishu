package com.abutech.root.aishu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;

public class Main3Activity extends AppCompatActivity {
    Button b2;
    TextView tx4, tx5, tx6, tx7;
    EditText ed2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        b2 = (Button) findViewById(R.id.button3);
        ed2 = (EditText) findViewById(R.id.editText3);
        tx4 = (TextView) findViewById(R.id.textView);
        tx4.setVisibility(View.GONE);
        tx5 = (TextView) findViewById(R.id.textView3);
        tx5.setVisibility(View.GONE);
        tx6 = (TextView) findViewById(R.id.textView4);
        tx6.setVisibility(View.GONE);
        tx7 = (TextView) findViewById(R.id.textView5);
        tx7.setVisibility(View.GONE);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tx4.setVisibility(View.VISIBLE);
                tx5.setVisibility(View.VISIBLE);
                tx6.setVisibility(View.VISIBLE);
                Intent myIntent1 = new Intent(Main3Activity.this, Main4Activity.class);
                startActivity(myIntent1);


            }
        });
    }
}
