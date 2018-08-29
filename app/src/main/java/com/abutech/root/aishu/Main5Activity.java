package com.abutech.root.aishu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ImageView;


public class Main5Activity extends AppCompatActivity {
    Button b3;
    TextView tx8, tx9, tx10;
    EditText ed3,ed4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        b3= (Button) findViewById(R.id.button6);
        ed3 = (EditText) findViewById(R.id.editText);
        ed4 = (EditText) findViewById(R.id.editText2);
        tx8 = (TextView) findViewById(R.id.textView);
        tx8.setVisibility(View.GONE);
        tx9 = (TextView) findViewById(R.id.textView2);
        tx9.setVisibility(View.GONE);
        tx10 = (TextView) findViewById(R.id.textView3);
        tx10.setVisibility(View.GONE);
        ImageView iv = (ImageView)findViewById(R.id.imageView2);
        iv.setImageResource(R.drawable.location);

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tx8.setVisibility(View.VISIBLE);
                tx9.setVisibility(View.VISIBLE);
                tx10.setVisibility(View.VISIBLE);

                    Intent myIntent1 = new Intent(Main5Activity.this, Main6Activity.class);
                    startActivity(myIntent1);


            }
        });
    }
}
