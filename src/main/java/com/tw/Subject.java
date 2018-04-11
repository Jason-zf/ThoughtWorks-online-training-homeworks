package com.tw;

public class Subject {
    private String name;
    private int score;

    public Subject(String name, int score) {
        this.name=name;
        this.score=score;
    }

    public String getName() {
        return name;
    }

    public Integer getScore() {
        return score;
    }
}
