package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class FizzBuzzGame {
    private List<String> results = new ArrayList<>();
    private Integer count;
    private List<Integer> specialNumbers = new ArrayList<>();

    private enum FizzBuzzWhizz {
        FIZZ, BUZZ, WHIZZ;

        @Override
        public String toString() {
            return super.toString().charAt(0) + super.toString().toLowerCase().substring(1, super.toString().length());
        }
    }

    public FizzBuzzGame() {
        specialNumbers.add(3);
        specialNumbers.add(5);
        specialNumbers.add(7);
        count = 20;
    }

    public void start(int count) {
        this.count = count;
    }

    public List<String> getResults() {
        List<String> results = new ArrayList<>();
        for (Integer i = 1; i <= count; ++i) {
            String singleResult = getSingleResult(i);
            if (!singleResult.isEmpty()) {
                results.add(singleResult);
                continue;
            }
            results.add(i.toString());
        }
        return results;
    }

    public String getSingleResult(Integer integer) {
        if (integer.toString().contains(specialNumbers.get(0).toString())) {
            return FizzBuzzWhizz.FIZZ.toString();
        }
        return ((integer % specialNumbers.get(0)) == 0 ? FizzBuzzWhizz.FIZZ.toString() : "") + ((integer % specialNumbers.get(1)) == 0 ? FizzBuzzWhizz.BUZZ.toString() : "") + ((integer % specialNumbers.get(2)) == 0 ? FizzBuzzWhizz.WHIZZ.toString() : "");
    }

    public Integer getCount() {
        return count;
    }

    public List<Integer> setSpecialNumbers() {
        Random random = new Random();
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < 3; ) {
            int num = random.nextInt(10);
            if (!res.contains(num)) {
                res.add(num);
                ++i;
            }
        }
        this.specialNumbers = res;
        return res;
    }
}


