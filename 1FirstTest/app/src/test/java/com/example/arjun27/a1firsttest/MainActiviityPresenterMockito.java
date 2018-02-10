package com.example.arjun27.a1firsttest;

import android.graphics.Color;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

/**
 * Created by arjun27 on 2/10/2018.
 */
@RunWith(MockitoJUnitRunner.class)
public class MainActiviityPresenterMockito {


    MainActivityPresenter presenter;

    @Mock
    MainActivityView view;



    @Before
    public void setUp() throws Exception {
        presenter=new MainActivityPresenter(view);
    }

    @Test
    public void editTextUpdated() throws Exception {
        //Arrange
        String givenString="test123";

        //Act
        presenter.editTextUpdated(givenString);

        //Assert
        Mockito.verify(view).changeTextviewText(givenString);

    }

    @Test
    public void colorSelected() throws Exception {
        //Arrange
        int index=1;
        int givencolor= Color.GREEN;

        //Act
        presenter.colorSelected(index);

        //Assert
        Mockito.verify(view).changeBackgroundColor(givencolor);

    }

    @Test
    public void launchother() throws Exception {

        //Arrange
        Class clazz=OtherActivity.class;

        //Act
        presenter.launchother(clazz);

        //Assert
        Mockito.verify(view).launchOtherActivity(clazz);
    }


}
