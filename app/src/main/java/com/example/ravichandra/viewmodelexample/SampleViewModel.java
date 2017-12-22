package com.example.ravichandra.viewmodelexample;

import android.arch.lifecycle.ViewModel;

/**
 * Created by Ravichandra on 12/22/2017.
 */

public class SampleViewModel extends ViewModel {

    private int count;
    private String editstr;

    public String getEditstr() {
        return editstr;
    }

    public void setEditstr(String editstr) {
        this.editstr = editstr;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }
}
