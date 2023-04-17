package com.example.per_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText totalMarksEditText,marksObtainedEditText;
    TextView percentageTextView;
    Button calculateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        totalMarksEditText = findViewById(R.id.editTextNumber);
        marksObtainedEditText = findViewById(R.id.editTextNumber2);
        percentageTextView = findViewById(R.id.textView);
        calculateButton = findViewById(R.id.button);



        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculatePercentage();
            }
        });





    }
    private void calculatePercentage() {
        // Get the text from the total marks and marks obtained EditTexts
        String totalMarksText = totalMarksEditText.getText().toString();
        String marksObtainedText = marksObtainedEditText.getText().toString();

        // Parse the text to double values
        double totalMarks = Double.parseDouble(totalMarksText);
        double marksObtained = Double.parseDouble(marksObtainedText);

        // Calculate the percentage
        double percentage = (marksObtained / totalMarks) * 100.0;

        // Display the percentage in the TextView
        percentageTextView.setText(String.format("%.2f%%", percentage));
    }

}