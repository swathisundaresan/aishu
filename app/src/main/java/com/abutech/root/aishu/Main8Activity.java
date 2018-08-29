package com.abutech.root.aishu;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.CheckBox;
import android.widget.Toast;

public class Main8Activity extends AppCompatActivity {
    Button b6;
    TextView tx1;
    CheckBox ch1, ch2, ch3, ch4, ch5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        ch1=(CheckBox)findViewById(R.id.checkBox);
        ch1.setVisibility(View.GONE);
        ch2=(CheckBox)findViewById(R.id.checkBox5);
        ch2.setVisibility(View.GONE);
        ch3=(CheckBox)findViewById(R.id.checkBox2);
        ch3.setVisibility(View.GONE);
        ch4=(CheckBox)findViewById(R.id.checkBox3);
        ch4.setVisibility(View.GONE);
        ch5=(CheckBox)findViewById(R.id.checkBox4);
        ch5.setVisibility(View.GONE);
        b6=(Button)findViewById(R.id.button5);
        tx1 = (TextView) findViewById(R.id.textView2);
        tx1.setVisibility(View.GONE);

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder sb=new StringBuilder("");

                if(ch1.isChecked()){
                    String s1=ch1.getText().toString();
                    sb.append(s1);
                }

                if(ch2.isChecked()){
                    String s2=ch2.getText().toString();
                    sb.append("\n"+s2);

                }
                if(sb!=null && !sb.toString().equals("")){
                    Toast.makeText(getApplicationContext(), sb, Toast.LENGTH_LONG).show();
                    Intent myIntent1 = new Intent(Main8Activity.this, Main10Activity.class);
                    startActivity(myIntent1);
                }
                else{
                    Toast.makeText(getApplicationContext(),"Nothing Selected", Toast.LENGTH_LONG).show();
                }

            }

        });
    }
}