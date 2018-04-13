package com.tw;

public class Subject extends Common {

    public Subject() {

    }

    public Subject(String name, int score) {
        super(name, score);
    }

    @Override
    public String getDisplay() {
        return numberToString(this.getId());
    }
}
