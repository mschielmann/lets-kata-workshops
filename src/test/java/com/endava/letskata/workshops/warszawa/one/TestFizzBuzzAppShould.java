package com.endava.letskata.workshops.warszawa.one;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TestFizzBuzzAppShould {

    @Test
    void return0AsStringForInput0() {


        String result = new FizzBuzzApp().test(0);

        assertThat(result).isEqualTo("0");
    }

    @Test
    public void return1AsStringForInput1() {
        // GIVEN
        FizzBuzzApp appUnderTest = new FizzBuzzApp();

        // WHEN
        String result = appUnderTest.test(1);

        // THEN
        assertThat(result).isEqualTo("1");
    }

    @Test
    public void returnFizzForInput3() {
        // GIVEN
        FizzBuzzApp appUnderTest = new FizzBuzzApp();

        // WHEN
        String result = appUnderTest.test(3);

        // THEN
        assertThat(result).isEqualTo("Fizz");
    }

    @Test
    public void returnBuzzForInput5() {
        // GIVEN
        FizzBuzzApp appUnderTest = new FizzBuzzApp();

        // WHEN
        String result = appUnderTest.test(5);

        // THEN
        assertThat(result).isEqualTo("Buzz");
    }

    @Test
    public void returnFizzForInput6() {
        // GIVEN
        FizzBuzzApp appUnderTest = new FizzBuzzApp();

        // WHEN
        String result = appUnderTest.test(6);

        // THEN
        assertThat(result).isEqualTo("Fizz");
    }

    @Test
    public void returnBuzzForInput10() {
        // GIVEN
        FizzBuzzApp appUnderTest = new FizzBuzzApp();

        // WHEN
        String result = appUnderTest.test(10);

        // THEN
        assertThat(result).isEqualTo("Buzz");
    }

    @Test
    public void returnFizzBuzzForInput15() {
        // GIVEN
        FizzBuzzApp appUnderTest = new FizzBuzzApp();

        // WHEN
        String result = appUnderTest.test(15);

        // THEN
        assertThat(result).isEqualTo("FizzBuzz");
    }
}
