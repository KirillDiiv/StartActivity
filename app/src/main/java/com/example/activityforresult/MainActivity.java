package com.example.activityforresult;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textViewMessage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewMessage = (TextView) findViewById(R.id.tv_main_result);

    }

    public void getMessage(View v){
        Intent intentGetMessage = new Intent(this, SecondActivity.class);
        startActivityForResult(intentGetMessage,2);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 2){
            if (data != null){
                String message = data.getStringExtra("Message");
                textViewMessage.setText("MessageFromSecondActivty:" + message);

            }
    }}}
