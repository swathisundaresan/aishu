package com.abutech.root.aishu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText ed1;
    TextView tx1,tx2,tx3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button)findViewById(R.id.button);
        ed1 = (EditText)findViewById(R.id.editText5);
        tx1 = (TextView)findViewById(R.id.textView6);
        tx1.setVisibility(View.GONE);
        tx2 = (TextView)findViewById(R.id.textView7);
        tx2.setVisibility(View.GONE);
        tx3 = (TextView)findViewById(R.id.textView2);
        tx3.setVisibility(View.GONE);
        b1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        tx1.setVisibility(View.VISIBLE);
        tx2.setVisibility(View.VISIBLE);
        tx3.setVisibility(View.VISIBLE);
        Intent myIntent = new Intent(MainActivity.this, Main3Activity.class);
        startActivity(myIntent);

    }
    });
}
}