package com.example.lab_exercise_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    private Button resetButton,countButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = findViewById(R.id.show_count);
        resetButton = findViewById(R.id.button_zero);
        countButton = findViewById(R.id.button_count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    public void countUp(View view) {
        resetButton.setBackgroundColor(ContextCompat.getColor(this,R.color.pink));
        mCount++;
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
            if (mCount % 2 == 0) {
                view.setBackgroundColor(ContextCompat.getColor(this,R.color.blue));
            } else {
                view.setBackgroundColor(ContextCompat.getColor(this,R.color.light_green));
            }
        }
    }

    public void resetToZero(View view) {
        view.setBackgroundColor(ContextCompat.getColor(this,R.color.gray));
        countButton.setBackgroundColor(ContextCompat.getColor(this,R.color.blue));
        mCount = 0;
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }
    }
}