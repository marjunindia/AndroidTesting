package com.example.arjun27.a1firsttest;

import org.junit.runner.RunWith;

/**
 * Created by arjun27 on 4/21/2018.
 */

@RunWith(AndroidJUnit4.class)
public class MainActivityEspressoTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule =
            new ActivityTestRule(MainActivity.class);


    @Test
    public void editTextUpdatesTextView() {
       //arrange
        onView(withId()).
    }

}
