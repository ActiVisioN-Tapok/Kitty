package com.example.kitty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvTextView;
    ImageButton ibKitty;
    EditText edText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvTextView = findViewById(R.id.tvName);
        ibKitty = findViewById(R.id.imageButton);
        edText = findViewById(R.id.edName);


    }

    public void clickClick(View view){
        if(edText.getText().length() == 0)
        {
            tvTextView.setText("До свидания!");
        }
        else {
            tvTextView.setText("Привет, " + edText.getText());
        }

    }
}