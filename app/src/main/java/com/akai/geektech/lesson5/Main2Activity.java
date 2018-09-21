package com.akai.geektech.lesson5;

import android.content.Context;
import android.content.Intent;
import android.support.constraint.Group;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView textView;
    private boolean isModeC;
    private Group group;

    public static Intent newInstance(Context context) {
        return new Intent(context, Main2Activity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView = findViewById(R.id.txr2);
        group = findViewById(R.id.group);
    }

    public void onClick2(View view) {
        Log.d("TAG", "click");
//        if (!isModeC) {
            group.setVisibility(View.GONE);
//            isModeC = !isModeC;
//        } else {
//            group.setVisibility(View.VISIBLE);
//            isModeC = !isModeC;
//        }
    }
}
