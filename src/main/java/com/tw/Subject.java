package com.tw;

public class Subject extends Common {

    public Subject(String name, int score) {
        super(name, score);
    }

    public Subject(String string) {
        super(string);
    }

    @Override
    public String getDisplay() {
        return numberToString(this.getId());
    }
}
