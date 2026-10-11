package IfDemo;

import java.util.Scanner;

public class IfDemo3 {
    public static void main(String[]agrs){
        /*需求：定义一个小数表示考试成绩
        * 判断学生的考试成绩，如果大于等于60分输出通过，否则不通过*/
        Scanner sc=new Scanner(System.in);
        double xiaoshu=sc.nextDouble();
//        判断学生的考试成绩
//        先对成绩是否合理进行判断
        if(xiaoshu>=0&&xiaoshu<=150) {
            if(xiaoshu>=60) {
                System.out.println("通过");
            }else{
                System.out.println("不通过");
            }

        }else{System.out.println("不合理");
        }

    }
}
