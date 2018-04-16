package com.tw;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class StudentTest {
    private Student student;

    @Before
    public void setUp() {
        student = new Student("张小明", 2015124001, Arrays.asList(new Subject("语文", 90), new Subject("数学", 95), new Subject("英语", 85)));
    }

    @Test
    public void shold_return_name_when_get_student_name() {
        assertEquals("张小明", student.getName());
    }

    @Test
    public void should_return_id_when_get_student_Id() {
        assertEquals(Integer.valueOf(2015124001), student.getId());
    }

    @Test
    public void should_return_student_info_when_getDisplay() {
        assertEquals("张小明|90|95|85|90|270\n", student.getDisplay());
    }

    @Test
    public void should_return_subjects_when_get_student_subjects() {
        assertEquals(Arrays.asList(new Subject("语文", 90), new Subject("数学", 95), new Subject("英语", 85)), student.getSubjects());
    }

}
