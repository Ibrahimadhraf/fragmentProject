package com.example.android.fragmentprogect;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
private SharedViewModel ViewModel;
private ExampeFragment exampeFragment;
private ExampeFragment2 exampeFragment2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     exampeFragment=new ExampeFragment();
     exampeFragment2=new ExampeFragment2();
     getSupportFragmentManager().beginTransaction()
             .replace(R.id.container_1,exampeFragment)
             .replace(R.id.container_2,exampeFragment2)
             .commit();
    }


}
