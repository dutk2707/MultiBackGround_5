package com.example.multibackground;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout constraintLayout;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btn_1);
        constraintLayout = (ConstraintLayout) findViewById(R.id.layout_1);
        final ArrayList<Integer> arrBackGroud = new ArrayList<>();
        arrBackGroud.add(R.drawable.beach_1);
        arrBackGroud.add(R.drawable.beach_2);
        arrBackGroud.add(R.drawable.beach_3);
        arrBackGroud.add(R.drawable.beach_4);
        Random random = new Random();
        do {
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    for (int vitri = 0; vitri < arrBackGroud.size(); vitri++) {
                        constraintLayout.setBackgroundResource(arrBackGroud.get(vitri));
                    }
                }
            });
        } while (true);
    }
}


