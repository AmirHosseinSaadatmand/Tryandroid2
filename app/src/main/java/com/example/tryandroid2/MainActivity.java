package com.example.tryandroid2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.tryandroid2.Utility.MyTextUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Show Message
        getWelcomeString("myTextView");

        for (int counter = 0; counter < 10; counter++) {
            Log.i("MainActivity", "Value: "+counter);
        }
    }

    private void getWelcomeString(String textViewId) {
        MyTextUtil textUtil=new MyTextUtil();

        //TODO: get id from textViewId in method
        TextView tv=findViewById(R.id.myTextView);
        tv.setText(textUtil .GetText());
    }

    public void cleaDataEventHandler(View view) {
        for (int i = 0; i <100 ; i++) {
            
        }
    }

    private void showdataSize()
    {
        Log.d("MainActivity", "A message");
    }
}
