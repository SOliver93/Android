package com.example.soliver.myapp;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StudentInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_info);
    }

    public void Otvoritreciactivity(View view) {
        startActivity(new Intent(StudentInfoActivity.this, SummaryActivity.class));

    }

}
