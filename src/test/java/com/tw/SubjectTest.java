package com.tw;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

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
        assertTrue(subject.getScore() == 90);
    }

}
