package com.example.arjun27.a1firsttest;

class PracticcePresenter {

    PracticeView practiceView;

    public PracticcePresenter(PracticeView practiceView) {
        this.practiceView = practiceView;
    }


    public String gettext() {
        return  practiceView.gettext();

    }

    public void settext(String s) {
        practiceView.settext(s);
    }
}
