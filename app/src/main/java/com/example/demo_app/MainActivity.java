package com.example.demo_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView_tap_me;
    private Button button_Go_Fish;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView_tap_me = (TextView)findViewById(R.id.tap_on_me);
        button_Go_Fish = (Button)findViewById(R.id.go_fish);
        if(getIntent().getExtras() != null){
            String number = getIntent().getExtras().getString(ThirdScreen.MESSAGE_EXTRA);
            textView_tap_me.setText((CharSequence)("you have entered: " + number));
        }
        textView_tap_me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), ThirdScreen.class);
                startActivity(intent);
            }
        });
        button_Go_Fish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), SecondScreen.class);
                startActivity(intent);
            }
        });
    }
}
