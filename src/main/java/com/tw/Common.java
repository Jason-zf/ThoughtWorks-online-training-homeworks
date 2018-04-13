package com.tw;

//公有类
public class Common {
    private String name;
    private double id;

    public Common() {

    }

    public Common(String name, double id) {
        this.name = name;
        this.id = id;
    }

    public Common(String string) {
        String splitor = (string.contains("：") && string.contains("，")) == true ? "，" : "：";
        String[] strings = string.split(splitor);
        if ((strings.length < 2) || Student.isNumeric(strings[1]) == false) {
            System.out.print("请输入学生信息（格式：姓名, 学号, 学科: 成绩, ...），按回车提交：");
        }
        this.name = strings[0];
        this.id = Double.valueOf(strings[1]);
    }

    public String getName() {
        return name;
    }

    public Double getId() {
        return id;
    }

    public void outMessage() {
        System.out.print("请输入学生信息（格式：姓名, 学号, 学科: 成绩, ...），按回车提交：\n");
    }

    @Override
    public boolean equals(Object obj) {
        return (this == null || obj == null) ? false : this.name.equals(((Common) obj).getName()) && this.id == ((Common) obj).getId();
    }

    public static boolean isNumeric(String string) {
        for (int i = 0; i < string.length(); ++i) {
            if (Character.isDigit(string.charAt(i)) == false) {
                return false;
            }
        }
        return true;
    }

    public String getDisplay() {
        return "";
    }

    public static String numberToString(Double number) {
        return (number.intValue() - number) == 0.0 ? String.valueOf(number.intValue()) : number.toString();
    }


}
