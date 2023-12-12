package com.example.viewmodelex;

import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {
    int counter = 0;

    public void increaseCounter() {
        counter++;

    }
//    0 + 1 = 1,
//    1 + 1 = 2,
//    1 + 2 = 3
    public int getCounter() {
        return counter;
    }
}
