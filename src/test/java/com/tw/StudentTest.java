package com.tw;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class StudentTest {
    private Student student;

    @Before
    public void setUp() {
        student = new Student("张小明", 2015124001, Arrays.asList(new Subject("语文", 90), new Subject("数学", 95), new Subject("英语", 85)));
    }

    @Test
    public void shold_return_name_when_get_student_name() {
        assertThat(student.getName(), is("张小明"));
    }

    @Test
    public void should_return_id_when_get_student_Id() {
        assertThat(student.getId(), is(2015124001));
    }

    @Test
    public void should_return_student_infos_when_getDisplay() {
        assertThat(student.getDisplay(),is("张小明|90|95|85|90.0|270"));
    }

}
