package com.example.arjun27.a1firsttest;


import android.view.inputmethod.EditorInfo;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by arjun27 on 2/4/2018.
 */
public class MainActivityTest {

    MainActivity activity;

    @Before
    public void setUp() throws Exception {
        activity = new MainActivity();
        activity.onCreate(null);
    }

    @Test
    public void editTextUpdatesTextview() throws Exception {

        // Arrange
        String givenString = "test123";
        activity.editText.setText(givenString);

        //Act
        activity.editText.onEditorAction(EditorInfo.IME_ACTION_DONE);

        // Assert
        String actualString = activity.mytextview.getText().toString();
        assertEquals(givenString, actualString);

    }
}