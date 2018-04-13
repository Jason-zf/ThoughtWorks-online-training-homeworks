package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


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

    public List<Integer> generateThreeDifferentNumbers() {
        Random random = new Random();
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < 3; ) {
            int num = random.nextInt(10);
            if (!res.contains(num)) {
                res.add(num);
                ++i;
            }
        }
        return res;
    }
}


