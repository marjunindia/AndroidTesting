package com.example.arjun27.a1firsttest;

import android.graphics.Color;

/**
 * Created by arjun27 on 2/10/2018.
 */

public class MainActivityPresenter {

    MainActivityView view;

    public MainActivityPresenter(MainActivityView view) {
        this.view = view;
    }

    public void editTextUpdated(String text) {
        view.changeTextviewText(text);
    }

    public void colorSelected(int index) {
        switch (index) {
            case 0:
                view.changeBackgroundColor(Color.CYAN);
                break;
            case 1:
                view.changeBackgroundColor(Color.GREEN);
        }
    }

    public void launchother(Class activity) {
        view.launchOtherActivity(activity);

    }

}
