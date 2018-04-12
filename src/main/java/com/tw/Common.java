package com.tw;

//公有类
public class Common {
    private String name;
    private int id;

    public Common() {

    }

    public Common(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
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

}
