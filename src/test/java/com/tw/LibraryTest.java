package com.tw;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.LinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LibraryTest {
    private Library classUnderTest;
    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        classUnderTest = new Library();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void should_correct_add_student_when_add() {
        classUnderTest.add("张小明，2015124001，语文：90，数学：95，英语：85");
        assertEquals(outContent.toString(), "");
    }

    @Test
    public void should_return_student_when_get_student_by_id() {
        classUnderTest.add("张小明，2015124001，语文：90，数学：95，英语：85");
        classUnderTest.add("李小鹏，2015124002，语文：80，数学：89，英语：90");

        assertEquals(classUnderTest.getStudent(2015124001), new Student("张小明，2015124001，语文：90，数学：95，英语：85"));
        assertEquals(classUnderTest.getStudent(2015124002), new Student("李小鹏，2015124002，语文：80，数学：89，英语：90"));
    }

    @Test
    public void should_output_correct_info_when_print_transcript() {
        classUnderTest.add("张小明，2015124001，语文：90，数学：95，英语：85");
        classUnderTest.add("李小鹏，2015124002，语文：80.5，数学：89，英语：90");
        classUnderTest.print("2015124001，2015124002，2015124005");

        String systemOut = "成绩单\n" + "姓名|语文|数学|英语|平均分|总分\n" + "========================\n" + "张小明|90|95|85|90|270\n" + "李小鹏|80.5|89|90|86.5|259.5\n" + "========================\n" + "全班总分平均数：264.75\n" +
                "全班总分中位数：264.75\n";
        assertEquals(outContent.toString().endsWith(systemOut), true);
    }

    @Test
    public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }

    @Test
    public void testMockClass() throws Exception {
        // you can mock concrete classes, not only interfaces
        LinkedList mockedList = mock(LinkedList.class);

        // stubbing appears before the actual execution
        String value = "first";
        when(mockedList.get(0)).thenReturn(value);

        assertEquals(mockedList.get(0), value);

    }

}
