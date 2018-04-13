package com.tw;

import java.util.Scanner;

public class main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Library klass = new Library();

        while (true) {
            System.out.print("1. 添加学生\n" + "2. 生成成绩单\n" + "3. 退出\n" + "请输入你的选择（1～3）：\n");
            userOption(scanner.next(), klass, scanner);
        }
    }

    public static void userOption(String string, Library klass, Scanner scanner) {
        switch (Integer.valueOf(string)) {
            case 1:
                System.out.print("请输入学生信息（格式：姓名, 学号, 学科: 成绩, ...），按回车提交：\n");
                string = scanner.next();
                while (klass.add(string) == false)
                    string = scanner.next();
                break;
            case 2:
                System.out.print("请输入要打印的学生的学号（格式： 学号, 学号,...），按回车提交：\n");
                string = scanner.next();
                klass.print(string);
                break;
            default:
                System.exit(0);
                break;
        }
    }
}
