package com.tw;

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
}
