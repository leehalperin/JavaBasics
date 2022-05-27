package com.sparta.lh;

import static com.sparta.lh.PalChecker.longestPal;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

public class AppTest {

    @Test
    @DisplayName("Check that when 'racecar' is entered, the palindrome is found")
    public void checkRacecar() {
        String s;
        Assertions.assertEquals(PalChecker.longestPal("racecar"), s = "racecar");
    }
    @Test
    @DisplayName("Check that when 'RacEcar' is entered, the palindrome is found")
    public void checkRacecarWithUpperCase() {
        String PalChecker.s = "RacEcar";
       assertThat(PalChecker.longestPal().isEqualTo("racecar");
    }
}
