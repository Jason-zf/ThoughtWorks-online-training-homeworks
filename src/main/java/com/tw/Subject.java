package com.tw;

public class Subject {
    private String name;
    private int score;

    public Subject(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public Subject(String string) {
        String[] subInfo = string.split("：");
        if ((subInfo.length != 2) || Student.isNumeric(subInfo[1]) == false) {
            System.out.print("请输入学生信息（格式：姓名, 学号, 学科: 成绩, ...），按回车提交：");
        }
        this.name = subInfo[0];
        this.score = Integer.valueOf(subInfo[1]);
    }

    public String getName() {
        return name;
    }

    public Integer getScore() {
        return score;
    }

    @Override
    public boolean equals(Object obj) {
        return (this == null || obj == null) ? false : this.name.equals(((Subject) obj).getName()) && this.score == ((Subject) obj).getScore();
    }
}
