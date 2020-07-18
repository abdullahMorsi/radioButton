package com.example.radiobutton;

import androidx.annotation.IdRes;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton radioButton;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = (RadioGroup) findViewById(R.id.radioGroupId);
        textView = findViewById(R.id.textView);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup,@IdRes int i) {
                radioButton = findViewById(i);
                switch(radioButton.getId()){
                    case R.id.pizzaId:{
                        textView.setVisibility(View.VISIBLE);
                        textView.setText("Pizza");
                    }
                    break;
                    case R.id.humburgerId:{
                        textView.setVisibility(View.VISIBLE);
                        textView.setText("Humburger");
                    }
                    break;
                    case R.id.steakId:{
                        textView.setVisibility(View.VISIBLE);
                        textView.setText("Steak");
                    }
                }

            }
        });
    }
}