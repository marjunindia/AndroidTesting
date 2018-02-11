package com.example.arjun27.a1firsttest;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.inputmethod.EditorInfo;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import static org.junit.Assert.assertEquals;

/**
 * Created by arjun27 on 2/11/2018.
 */
@RunWith(RobolectricTestRunner.class)
public class MainActivityRoboelectriicTest {

    MainActivity activity;

    @Before
    public void setUp() throws Exception {
        activity = Robolectric.setupActivity(MainActivity.class);
    }

    @Test
    public void editTextUpdated() throws Exception {
        //arrange
        String givenString="test123";
        activity.editText.setText(givenString);

        //act
        activity.editText.onEditorAction(EditorInfo.IME_ACTION_DONE);

        //assert
        String actual=activity.mytextview.getText().toString();

        assertEquals(givenString,actual);
    }

    @Test
    public void colorSelected() throws Exception {

        //arrange
        int index=2;
        int givenColor= Color.GREEN;

        //act
        activity.spinner.setSelection(index);

        //assert
        int expectedColor=((ColorDrawable)activity.relativeLayout.getBackground()).getColor();
        assertEquals(givenColor,expectedColor);
    }

    @Test
    public void launchother() throws Exception {

//        //arrange
//        Class clazz=OtherActivity.class;
//        Intent expectedIntent=new Intent(activity,clazz);
//
//        //act
//        activity.launchActivity.callOnClick();
//
//        //assert
//        ShadowActivity shadowActivity= Shadows.shadowOf(activity);
//        Intent actualIntent=shadowActivity.getNextStartedActivity();
//       // assertEquals(expectedIntent,actualIntent);
//        assertTrue(expectedIntent.filterEquals(actualIntent));
//

    }

}