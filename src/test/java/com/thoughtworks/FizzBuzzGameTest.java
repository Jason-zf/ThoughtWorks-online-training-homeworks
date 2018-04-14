package com.thoughtworks;

import org.junit.Before;
import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FizzBuzzGameTest {
    private FizzBuzzGame fizzBuzzGame;

    @Before
    public void setFizzBuzzGame() {
        fizzBuzzGame = new FizzBuzzGame();
    }

    @Test
    public void should_return_student_count_when_getCount() {
        assertEquals(fizzBuzzGame.getCount(), null);
    }

    @Test
    public void should_init_count_when_start() {
        fizzBuzzGame.start(100);
        assertTrue(fizzBuzzGame.getCount() == 100);
    }

    @Test
    public void should_return_three_different_number_when_generate_numbers() {
        List<Integer> numbers = fizzBuzzGame.generateThreeDifferentNumbers();
        assertEquals(numbers.size(), 3);

        for (int i = 0; i < 3; ++i) {
            assertTrue(numbers.get(i) < 10);
            for (int j = i + 1; j < 3; ++j) {
                assertTrue(numbers.get(i) != numbers.get(j));
            }
        }
    }


    @Test
    public void should_return_Fizz_when_have_3() {
        String result = fizzBuzzGame.getResultsDividebySpecialNumbers(3);
        assertEquals(result, "Fizz");
    }

    @Test
    public void should_return_Fizz_when_have_5() {
        String result = fizzBuzzGame.getResultsDividebySpecialNumbers(5);
        assertEquals(result, "Buzz");
    }

    @Test
    public void should_return_Fizz_when_have_7() {
        String result = fizzBuzzGame.getResultsDividebySpecialNumbers(7);
        assertEquals(result, "Whizz");
    }

    @Test
    public void should_return_FizzBuzz_when_have_3_5() {
        String result = fizzBuzzGame.getResultsDividebySpecialNumbers(15);
        assertEquals(result, "FizzBuzz");
    }

    @Test
    public void should_return_BuzzWhizz_when_have_5_7() {
        String result = fizzBuzzGame.getResultsDividebySpecialNumbers(70);
        assertEquals(result, "BuzzWhizz");
    }

}
