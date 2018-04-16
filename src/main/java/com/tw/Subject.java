package com.tw;

import java.util.Objects;

public class Subject {
    private String name;
    private Double score;

    public Subject(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public String getDisplay() {
        return Student.numberToString(score);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject = (Subject) o;
        return Objects.equals(name, subject.name) &&
                Objects.equals(score, subject.score);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, score);
    }

    public Double getScore() {
        return score;

    }
}
