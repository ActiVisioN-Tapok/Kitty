package com.example.sposob2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvTextView;
    Button btnOK, btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sposob3);
        tvTextView = findViewById(R.id.tvOut);
        btnOK = findViewById(R.id.btnOK);
        btnCancel = findViewById(R.id.btnCancel);

        View.OnClickListener oclBtn = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId() == R.id.btnOK)
                {
                    tvTextView.setText("Нажата кнопка ОК");
                }
                else if(v.getId() == R.id.btnCancel)
                {
                    tvTextView.setText("Нажата кнопка Cancel");
                }
            }
        };

        btnOK.setOnClickListener(oclBtn);
        btnCancel.setOnClickListener(oclBtn);
    }
}