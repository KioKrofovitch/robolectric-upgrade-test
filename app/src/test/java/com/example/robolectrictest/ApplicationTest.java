package com.example.robolectrictest;

import android.app.Activity;

import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static junit.framework.Assert.assertTrue;

@Config(emulateSdk = 18)
@RunWith(RobolectricTestRunner.class)

public class ApplicationTest {

    @org.junit.Test
    public void testDummy() throws Exception {

        Activity activity = Robolectric.setupActivity(MainActivity.class);

        assertTrue(true);
    }

}