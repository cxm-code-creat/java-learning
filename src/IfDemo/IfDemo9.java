package IfDemo;

import java.util.Scanner;

public class IfDemo9 {
    public static void main(String[] args) {
    /*键盘输入任意三个大于0的小数，判断这三个数值构成什么类型的三角形？
    * 需要判断的类型如下：等边，等腰，直角，普通，无效
    * 条件：两边之和>第三边*/
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入三个大于0的小数：");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
//        判断类型
        if(a+b>c&&a+c>b&&b+c>a) {
            if (a == b && b == c) System.out.println("等边三角形");
            else if (a == b || a == c || b == c) System.out.println("等腰三角形");
            else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a)
                System.out.println("直角三角形");
            else System.out.println("普通三角形");
        }else {
            System.out.println("无效三角形");
        }
    }
}
