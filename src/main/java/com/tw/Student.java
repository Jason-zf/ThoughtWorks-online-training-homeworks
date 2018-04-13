package com.tw;

import java.util.ArrayList;
import java.util.List;

public class Student extends Common {
    private List<Subject> subjects;

    public Student() {
        subjects = new ArrayList<>();
    }

    public boolean initStu(String string) {
        if (!init(string)) {
            return false;
        }
        String[] stuInfo = string.split("，");
        List<Subject> subjects = new ArrayList<>();
        Subject subject = new Subject();
        for (int i = 2; i < stuInfo.length; ++i) {
            if (!subject.init(stuInfo[i])) {
                return false;
            }
            subjects.add(subject);
        }
        this.subjects = subjects;
        return true;
    }

    public List<Subject> getSubjects() {
        return subjects;
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

}
