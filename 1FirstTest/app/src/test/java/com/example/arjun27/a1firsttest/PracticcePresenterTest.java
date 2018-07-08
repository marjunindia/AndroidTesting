package com.example.arjun27.a1firsttest;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class PracticcePresenterTest {

    PracticcePresenter presenter;
    PracticeView practiceView;
    String string;

    class MockedView implements PracticeView {


        @Override
        public String gettext() {
            return "hi";
        }

        @Override
        public void settext(String s) {

        }
    }


    @Before
    public void setUp() throws Exception {
        practiceView =new MockedView();
        presenter=new PracticcePresenter(practiceView);
    }

    @Test
    public void gettext() {
        String s="hi";
        string=presenter.gettext();
        Assert.assertEquals(s,((MockedView) practiceView).gettext());
}

    @Test
    public void settext() {
        presenter.settext(string);

    }
}