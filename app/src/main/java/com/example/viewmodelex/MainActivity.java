package com.example.viewmodelex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;

import com.example.viewmodelex.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding activityMainBinding;
    MyViewModel myViewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        myViewModel = new ViewModelProvider(this).get(MyViewModel.class);

        activityMainBinding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myViewModel.increaseCounter();

                activityMainBinding.textView1.setText("" + myViewModel.getCounter());
            }
        });

        activityMainBinding.textView1.setText("" + myViewModel.getCounter());


    }

}