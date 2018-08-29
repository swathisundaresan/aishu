package com.abutech.root.aishu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.view.View;

public class Main4Activity extends AppCompatActivity {
    Button b3;
    EditText ed3, ed4, ed5;
    RadioGroup radioSexGroup;
    RadioButton r1,r2;
    int checkedId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        ed3 = (EditText) findViewById(R.id.editText);
        ed4 = (EditText) findViewById(R.id.editText6);
        ed5 = (EditText) findViewById(R.id.editText7);

        addListenerOnButton();
    }

    public void addListenerOnButton() {
        radioSexGroup = (RadioGroup) findViewById(R.id.radioSex);
        b3 = (Button) findViewById(R.id.button2);
        b3.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v)
            {
                int selectedId = radioSexGroup.getCheckedRadioButtonId();
                if(checkedId==R.id.radioButton)
                {
                    r1 = (RadioButton) findViewById(selectedId);
                }
                else if(checkedId==R.id.radioButton2)
                {
                    r2=(RadioButton) findViewById(selectedId);
                }

                Intent myIntent2 = new Intent(Main4Activity.this, Main5Activity.class);
                startActivity(myIntent2);
            }
        });
    }
}