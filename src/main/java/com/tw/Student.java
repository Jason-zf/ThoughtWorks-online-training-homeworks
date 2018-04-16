package com.tw;

import java.util.List;
import java.util.Objects;

public class Student {
    private String name;
    private Integer id;
    private List<Subject> subjects;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, subjects);
    }

    public Student(String name, int id, List<Subject> subjects) {
        this.name = name;
        this.id = id;
        this.subjects = subjects;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public Integer getId() {
        return id;
    }

    public Double getTotalScore() {
        double total = 0;
        for (Subject subject : subjects) {
            total += subject.getScore();
        }
        return total;
    }

    public String getDisplay() {
        String res = name;
        for (Subject subject : subjects) {
            res = res + "|" + subject.getDisplay();
        }
        res = res + "|" + numberToString(getTotalScore() / subjects.size()) + "|" + numberToString(getTotalScore()) + "\n";
        return res;
    }

    public static String numberToString(Double number) {
        return (number.intValue() - number) == 0.0 ? String.valueOf(number.intValue()) : number.toString();
    }

}
