package com.example.arjun27.a1firsttest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PracticePresenterMockito {


    PracticcePresenter presenter;

    @Mock
    PracticeView practiceView;

    String string;


    @Before
    public void setUp() throws Exception {

        presenter=new PracticcePresenter(practiceView);
    }

    @Test
    public void gettext() {
        string=presenter.gettext();
        Mockito.verify(practiceView).gettext();
    }

    @Test
    public void settext() {
        presenter.settext(string);
        Mockito.verify(practiceView).settext(string);

    }
}
