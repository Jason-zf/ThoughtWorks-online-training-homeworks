package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class FizzBuzzGame {
    private List<String> results = new ArrayList<>();
    private Integer count;
    private List<Integer> specialNumbers = new ArrayList<>();

    private enum FizzBuzzWhizz {
        Fizz, Buzz, Whizz, FizzBuzzWhizz
    }

    public FizzBuzzGame() {
        specialNumbers.add(3);
        specialNumbers.add(5);
        specialNumbers.add(7);
        count = 100;
    }

    public void start(int count) {
        this.count = count;
        specialNumbers = generateThreeDifferentNumbers();
    }

    public List<String> getResults() {
        List<String> results = new ArrayList<>();
        for (Integer i = 0; i < count; ++i) {
            if (i.toString().contains(specialNumbers.get(0).toString())) {
                results.add(FizzBuzzWhizz.Fizz.toString());
                continue;
            }
            if (getResultsDividebySpecialNumbers(i) != "") {
                results.add(getResultsDividebySpecialNumbers(i));
            }
        }
        return results;
    }

    public String getResultsDividebySpecialNumbers(Integer integer) {
        return ((integer % specialNumbers.get(0)) == 0 ? FizzBuzzWhizz.Fizz.toString() : "") + ((integer % specialNumbers.get(1)) == 0 ? FizzBuzzWhizz.Buzz.toString() : "") + ((integer % specialNumbers.get(2)) == 0 ? FizzBuzzWhizz.Whizz.toString() : "");
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


