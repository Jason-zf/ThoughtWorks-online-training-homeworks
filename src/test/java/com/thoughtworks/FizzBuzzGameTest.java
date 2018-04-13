package com.thoughtworks;

import org.junit.Before;
import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;

import static org.junit.Assert.assertEquals;

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
    public void should_return_Fizz_when_have_3() {

    }
}
