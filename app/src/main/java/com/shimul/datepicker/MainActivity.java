package com.shimul.datepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private DatePicker datePicker;
    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(getCurrentDate());

            }
        });




    }

    private void init() {
        datePicker = findViewById(R.id.datePickerVU);
        button = findViewById(R.id.selectBTN);
        textView = findViewById(R.id.currentDateTV);
    }

    private String getCurrentDate(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DAY: "+datePicker.getDayOfMonth()+" "+"MONTH: "+datePicker.getMonth()+" YEAR: "+datePicker.getYear());
        return String.valueOf(stringBuilder);
    }
}
