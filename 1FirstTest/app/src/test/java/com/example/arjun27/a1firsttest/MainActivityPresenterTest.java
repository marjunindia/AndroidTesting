package com.example.arjun27.a1firsttest;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import static android.os.Build.VERSION_CODES.M;

/**
 * Created by arjun27 on 2/10/2018.
 */
public class MainActivityPresenterTest {

    MainActivityPresenter presenter;

    MainActivityView view;

    class MockedView implements MainActivityView {

        String textviewtext;

        @Override
        public void changeTextviewText(String text) {
            textviewtext=text;
        }

        @Override
        public void changeBackgroundColor(int color) {

        }

        @Override
        public void launchOtherActivity(Class activity) {

        }
    }


    @Before
    public void setUp() throws Exception {

        view=new MockedView();
        presenter=new MainActivityPresenter(view);

    }

    @Test
    public void editTextUpdated() throws Exception {
        //Arrange
        String givenString="test123";

        //Act
        presenter.editTextUpdated(givenString);

        //Assert
        Assert.assertEquals(givenString,((MockedView)view).textviewtext); //cast our view into mockedview

    }

    @Test
    public void colorSelected() throws Exception {

    }

    @Test
    public void launchother() throws Exception {

    }

}