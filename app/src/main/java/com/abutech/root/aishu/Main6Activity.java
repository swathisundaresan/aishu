package com.abutech.root.aishu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Main6Activity extends AppCompatActivity {
    Button b4,b5;
    TextView tx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        b4= (Button) findViewById(R.id.button4);
        b5= (Button) findViewById(R.id.button5);
        tx = (TextView) findViewById(R.id.textView8);
        tx.setVisibility(View.GONE);
        ImageView iv = (ImageView)findViewById(R.id.imageView);
        iv.setImageResource(R.drawable.dairy);
        ImageView iv1 = (ImageView)findViewById(R.id.imageView3);
        iv1.setImageResource(R.drawable.cupcake);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tx.setVisibility(View.VISIBLE);
                Intent myIntent1 = new Intent(Main6Activity.this, Main8Activity.class);
                startActivity(myIntent1);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent2 = new Intent(Main6Activity.this, Main9Activity.class);
                startActivity(myIntent2);
            }
        });


    }
}
