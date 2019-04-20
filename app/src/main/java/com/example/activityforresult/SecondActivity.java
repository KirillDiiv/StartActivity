package com.example.activityforresult;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    EditText editTextMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        editTextMessage = (EditText) findViewById(R.id.et_second_input);
    }

    public void submitMessage (View v){
        String message = editTextMessage.getText().toString();

        Intent intentMessage = new Intent();
        intentMessage.putExtra("Message",message);
        setResult(2, intentMessage);

        finish();
    }
}
