package com.mikuga.bitrisesample

import org.junit.After
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test
import org.junit.Rule
import android.support.test.rule.ActivityTestRule
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.assertion.ViewAssertions.matches
import org.junit.runner.RunWith


 class MainActivityTest {

    @Rule
    var mActivityRule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)

    private var mMainActivity: MainActivity?=null


    @Before
    fun setUp() {
        mMainActivity=mActivityRule.activity

    }

    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun simpleUITest(){
         assertEquals(2, 2 + 2)

    }



    @After
    fun tearDown() {
    }
}