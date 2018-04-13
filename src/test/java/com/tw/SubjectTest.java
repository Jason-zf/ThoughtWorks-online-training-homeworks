package com.tw;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class SubjectTest {
    private Subject subject;

    @Before
    public void setUp() {
        subject = new Subject("语文", 90);
    }

    @Test
    public void should_return_name_when_get_subject_name() {
        assertThat(subject.getName(), is("语文"));
    }

    @Test
    public void should_return_score_when_get_subject_score() {
        assertThat(subject.getId(), is(90.0));
    }

    @Test
    public void should_get_subject_when_new_subject_through_string() {
        String string = "语文：90";
        Subject subject1 = new Subject(string);
        assertEquals(subject1, subject);
    }
}
