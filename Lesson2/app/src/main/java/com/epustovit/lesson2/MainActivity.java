package com.epustovit.lesson2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onMyButtonClick(View view){
        Button button = (Button)findViewById(R.id.button);
        button.setVisibility(View.GONE);
    }
}
