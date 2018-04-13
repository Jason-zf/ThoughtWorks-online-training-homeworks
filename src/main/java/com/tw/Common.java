package com.tw;

//公有类
public class Common {
    private String name;
    private double id;
    public boolean isInit;

    public Common() {
        isInit=false;

    }

    public Common(String name, double id) {
        this.name = name;
        this.id = id;
    }

    public Common(String string) {
        String splitor = (string.contains("：") && string.contains("，")) == true ? "，" : "：";
        String[] strings = string.split(splitor);
        if ((strings.length < 2) || Student.isNumeric(strings[1]) == false) {
            isInit=false;
            return;
        }
        this.name = strings[0];
        this.id = Double.valueOf(strings[1]);
        isInit=true;
    }

    public String getName() {
        return name;
    }

    public Double getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        return (this == null || obj == null) ? false : this.name.equals(((Common) obj).getName()) && this.id == ((Common) obj).getId();
    }

    public static boolean isNumeric(String string) {
        return string.matches("-?[0-9]+.*[0-9]*");
    }

    public String getDisplay() {
        return "";
    }

    public static String numberToString(Double number) {
        return (number.intValue() - number) == 0.0 ? String.valueOf(number.intValue()) : number.toString();
    }


}
