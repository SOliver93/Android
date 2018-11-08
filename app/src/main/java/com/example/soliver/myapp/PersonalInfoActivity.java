package com.example.soliver.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PersonalInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personal_info_activity);
    }

    public void Otvorinoviacitvity(View view) {
        startActivity(new Intent(PersonalInfoActivity.this, StudentInfoActivity.class));

    }
}
