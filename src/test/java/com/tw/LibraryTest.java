package com.tw;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LibraryTest {
    private Library classUnderTest;
    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private String string, string1;
    List<Subject> subjects;

    @Before
    public void setUp() {
        classUnderTest = new Library();
        System.setOut(new PrintStream(outContent));
        string = "张小明，2015124001，语文：90，数学：95，英语：85";
        string1 = "李小鹏，2015124002，语文：80.5，数学：89，英语：90";
        subjects = Arrays.asList(new Subject("语文", 90), new Subject("数学", 95), new Subject("英语", 85));
    }

    @Test
    public void should_return_true_when_add_correct_student_info() {
        assertTrue(classUnderTest.add(string));
    }

    @Test
    public void should_return_student_when_get_student_by_id() {
        classUnderTest.add(string);
        classUnderTest.add(string1);

        assertEquals(new Student("", 2015124001, subjects), classUnderTest.getStudent(2015124001));
    }

    @Test
    public void should_print_correct_info_when_print_transcript() {
        classUnderTest.add(string);
        classUnderTest.add(string1);
        classUnderTest.print("2015124001，2015124002，2015124005");

        String systemOut = "成绩单\n" +
                "姓名|语文|数学|英语|平均分|总分\n" +
                "========================\n" +
                "张小明|90|95|85|90|270\n" +
                "李小鹏|80.5|89|90|86.5|259.5\n" +
                "========================\n" +
                "全班总分平均数：264.75\n" +
                "全班总分中位数：264.75\n";
        assertEquals(outContent.toString().endsWith(systemOut), true);
    }

    @Test
    public void testMockClass() throws Exception {
        Student student = mock(Student.class);

        when(student.getId()).thenReturn(2015124001);
        classUnderTest.getStudent(2015124001, Arrays.asList(student));

        assertTrue(classUnderTest.getStudent(2015124001, Arrays.asList(student)) == student);
    }

}
