package com.tw;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int id;
    private List<Subject> subjects;

    public Student(String name, int id, List<Subject> subjects) {
        this.name = name;
        this.id = id;
        this.subjects = subjects;
    }

    public Student(String string) {
        String[] stuInfo = string.split("，");
        if (stuInfo.length < 2 || isNumeric(stuInfo[1]) == false) {
            System.out.print("请按正确的格式输入（格式：姓名, 学号, 学科: 成绩, ...）：");
            return;
        }
        List<Subject> subjects = new ArrayList<>();
        for (int i = 2; i < stuInfo.length; ++i) {
            subjects.add(new Subject(stuInfo[i]));
        }
        this.name = stuInfo[0];
        this.id = Integer.valueOf(stuInfo[1]);
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public Integer getTotalScore() {
        int total = 0;
        for (Subject subject : subjects) {
            total += subject.getScore();
        }
        return total;
    }

    public String getDisplay() {
        String res = name;
        for (Subject subject : subjects) {
            res = res + "|" + String.valueOf(subject.getScore());
        }
        res = res + "|" + String.valueOf((double) getTotalScore() / subjects.size()) + "|" + String.valueOf(getTotalScore());
        return res;
    }

    public static boolean isNumeric(String string) {
        for (int i = 0; i < string.length(); ++i) {
            if (Character.isDigit(string.charAt(i)) == false) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean equals(Object obj) {
        return (this == null || obj == null) ? false : this.id == ((Student) obj).getId();
    }
}
