package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;


public class FizzBuzzGame {
    private List<String> results = new ArrayList<>();
    private Integer count;

    public void start(int count) {
        this.count = count;
    }

    public List<String> getResults() {
        return results;
    }

    public Integer getCount() {
        return count;
    }
}


