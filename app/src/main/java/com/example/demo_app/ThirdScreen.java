package com.example.demo_app;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

public class ThirdScreen extends AppCompatActivity {
    private EditText editText;
    private Context context;
    public static String MESSAGE_EXTRA = "message_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_screen);
        context = this.getApplicationContext();
        editText = (EditText)findViewById(R.id.plain_text_input);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (editText.getText().length() == 5){
                    Intent intent = new Intent(context, MainActivity.class );
                    String message = editText.getText().toString();
                    intent.putExtra(MESSAGE_EXTRA,message);
                    startActivity(intent);
                }
            }
        });
    }
}
