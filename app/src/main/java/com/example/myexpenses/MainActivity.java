package com.example.myexpenses;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button record;
    private EditText amount_to_spend;
    private EditText spent;
    private EditText saved;

    private EditText purpose; //text source

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        record = findViewById(R.id.record);
        amount_to_spend = findViewById(R.id.amount_to_spend);

        record.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String amount = amount_to_spend.getText().toString();
                int a = Integer.parseInt(amount);

                String amount1 = spent.getText().toString();
                int b = Integer.parseInt(amount1);

                String amount2 = saved.getText().toString();
                int c = Integer.parseInt(amount2);

                String topic = purpose.getText().toString();
//                Toast.makeText(MainActivity.this, "Just verifying the input i.e, " + a, Toast.LENGTH_SHORT).show();
            }
        });

    }
}