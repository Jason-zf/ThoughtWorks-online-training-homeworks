package com.tw;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Student> students;

    public Library() {
        students = new ArrayList<>();
    }

    public boolean add(String string) {
        Student student = new Student(string);
        if (student.isInit == false) {
            return false;
        }
        students.add(student);
        System.out.print("学生" + student.getName() + "的成绩被添加\n");
        return true;
    }

    public boolean print(String string) {
        if (!string.contains("，")) {
            System.out.print("请按正确的格式输入要打印的学生的学号（格式： 学号, 学号,...），按回车提交：\n");
            return false;
        }
        String[] strings = string.split("，");
        List<Double> scores = new ArrayList<>();
        String res = "成绩单\n" + "姓名";
        for (Subject subject : students.get(0).getSubjects()) {
            res += "|" + subject.getName();
        }
        res = res + "|平均分|总分\n" + "========================\n";

        for (int i = 0; i < strings.length; ++i) {
            if (Common.isNumeric(strings[i]) == false)
                System.out.print("请按正确的格式输入要打印的学生的学号（格式： 学号, 学号,...），按回车提交：\n");
            Student student = getStudent(Integer.valueOf(strings[i]));
            if (student != null) {
                res += student.getDisplay();
                scores.add(student.getTotalScore());
            }
        }
        Double avg = (scores.get(scores.size() / 2 - 1) + scores.get(scores.size() / 2)) / 2.0;
        String medimum = scores.size() % 2 == 0 ? Common.numberToString((scores.get(scores.size() / 2 - 1) + scores.get(scores.size() / 2)) / 2.0) : Common.numberToString(scores.get(scores.size() / 2));
        res = res + "========================\n" + "全班总分平均数：" + Common.numberToString(scores.stream().mapToDouble(value -> value).average().getAsDouble()) + "\n" + "全班总分中位数：" + medimum;
        System.out.print(res + "\n");
        return true;
    }

    public Student getStudent(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

}

