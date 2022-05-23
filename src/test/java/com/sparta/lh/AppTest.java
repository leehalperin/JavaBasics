package com.sparta.lh;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    @DisplayName("check that 5 == 5")
    void simpleTest() {
        Assertions.assertEquals(true, 5 == 5);
    }

    @Test
    @DisplayName("check that we can return Good Morning")
    void checkWeCanReturnGoodMorning() {
        Assertions.assertEquals("Good Morning!", App.greeting(6));
    }

    @Test
    @DisplayName("check that we can return Good Afternoon")
    void checkWeCanReturnGoodAfternoon() {
        Assertions.assertEquals("Good Afternoon!", App.greeting(14));
    }

    @Test
    @DisplayName("check that we can return Good Evening")
    void checkWeCanReturnGoodEvening() {
        Assertions.assertEquals("Good Evening!", App.greeting(21));
    }

    @Test
    @DisplayName("check that we can return Good Night")
    void checkWeCanReturnGoodNight() {
        Assertions.assertEquals("Good Night!", App.greeting(1));
    }

    @Test
    @DisplayName("check that we get an error when entering invalid format")
    void checkWeGetErrorMessage() {
        Assertions.assertEquals("Invalid, please try again...", App.greeting(42));
    }

}
