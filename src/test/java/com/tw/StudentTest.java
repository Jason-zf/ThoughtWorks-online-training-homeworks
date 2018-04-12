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
        assertEquals(student.getName(), "张小明");
    }

    @Test
    public void should_return_id_when_get_student_Id() {
        assertEquals(student.getId(), Integer.valueOf(2015124001));
    }

    @Test
    public void should_return_student_info_when_getDisplay() {
        assertEquals(student.getDisplay(), "张小明|90|95|85|90.0|270");
    }

    @Test
    public void shold_get_student_when_new_student_through_string() {
        String string = "张小明，2015124001，语文：90，数学：95，英语：85";
        Student student1 = new Student(string);
        assertEquals(student1, student);
    }

}
