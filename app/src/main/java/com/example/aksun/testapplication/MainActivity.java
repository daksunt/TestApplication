package com.example.aksun.testapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.testfairy.TestFairy;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TestFairy.begin(this, "f636d263a91be6510f1807cf6a9d6f727dd771b6");
        setContentView(R.layout.activity_main);
    }

    public void buttonOnClick(View v){
        EditText mainName = (EditText) findViewById(R.id.mainName);
        TextView greetingMessage = (TextView) findViewById(R.id.greetingMessage);
        String text = mainName.getText().toString();
        if(text.equals("lol")){
            int a = 0;
            int b = 5;
            int c = b/a;
        }
        greetingMessage.setText(text);

    }
}
