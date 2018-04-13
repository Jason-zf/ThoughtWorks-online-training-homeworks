package com.tw;

import java.util.ArrayList;
import java.util.List;

public class Student extends Common {
    private List<Subject> subjects;

    public Student(String name, double id, List<Subject> subjects) {
        super(name, id);
        this.subjects = subjects;
    }

    public Student(String string) {
        super(string);
        String[] stuInfo = string.split("，");
        List<Subject> subjects = new ArrayList<>();
        for (int i = 2; i < stuInfo.length; ++i) {
            subjects.add(new Subject(stuInfo[i]));
        }
        this.subjects = subjects;
    }

    public Double getTotalScore() {
        double total = 0;
        for (Subject subject : subjects) {
            total += subject.getId();
        }
        return total;
    }

    @Override
    public String getDisplay() {
        String res = this.getName();
        for (Subject subject : subjects) {
            res = res + "|" + String.valueOf(subject.getDisplay());
        }
        res = res + "|" + numberToString(getTotalScore() / subjects.size()) + "|" + numberToString(getTotalScore()) + "\n";
        return res;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }
}
