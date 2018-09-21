package com.akai.geektech.lesson5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView1, textView2, textView3;
    private TextView rTextView1, rTextView2, rTextView3;
    private boolean isModeL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = findViewById(R.id.ltx1);
        textView2 = findViewById(R.id.ltx2);
        textView3 = findViewById(R.id.ltx3);

        rTextView1 = findViewById(R.id.rtxt1);
        rTextView2 = findViewById(R.id.rtxt2);
        rTextView3 = findViewById(R.id.rtxt3);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn1: click1(); break;
            case R.id.btn2: click2(); break;
        }

    }

    private void click1() {
        startActivity(Main2Activity.newInstance(this));
    }

    private void click2() {
        if (isModeL) {
            rTextView1.setVisibility(View.VISIBLE);
            rTextView2.setVisibility(View.VISIBLE);
            rTextView3.setVisibility(View.VISIBLE);

            textView1.setVisibility(View.INVISIBLE);
            textView2.setVisibility(View.INVISIBLE);
            textView3.setVisibility(View.INVISIBLE);
            isModeL = !isModeL;
        } else {
            textView1.setVisibility(View.VISIBLE);
            textView2.setVisibility(View.VISIBLE);
            textView3.setVisibility(View.VISIBLE);

            rTextView1.setVisibility(View.INVISIBLE);
            rTextView2.setVisibility(View.INVISIBLE);
            rTextView3.setVisibility(View.INVISIBLE);
            isModeL = !isModeL;
        }
    }

}
