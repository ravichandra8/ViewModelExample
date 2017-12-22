package com.example.ravichandra.viewmodelexample;

import android.arch.lifecycle.ViewModel;

/**
 * Created by Ravichandra on 12/22/2017.
 */

public class SampleViewModel extends ViewModel {

    private int count;

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }
}
