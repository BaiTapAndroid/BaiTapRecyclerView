package com.example.baitaprecyclerview_18093421_LeVanTai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NewMainActivity extends AppCompatActivity {

    TextView txtContent;
    Button btnFinish;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_main);
        txtContent = findViewById(R.id.txtContent);
        btnFinish = findViewById(R.id.btnFinish);
        Intent intent = getIntent();
        String title = intent.getStringExtra("name");
        txtContent.setText(title);
        btnFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}