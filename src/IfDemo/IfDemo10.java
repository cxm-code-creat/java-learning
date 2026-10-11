package IfDemo;

import java.util.Scanner;

public class IfDemo10 {
    public static void main(String[] args) {
    /*规则：
    * 输入变量x,y，判断点所在的区域：
    * 情况1：原点（x=0且y=0)
    * 情况2：第一象限，第二象限，第三象限，第四象限
    * 情况3：在y轴上（x=o且y≠0）
    * 情况4：在x轴上（x≠0且y=0）*/
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入x的值：");
        int x=sc.nextInt();
        System.out.println("请输入y的值：");
        int y=sc.nextInt();
//        判断点所在的位置
        if(x==0&&y==0)System.out.println("原点");
        else if(x>0&&y>0)System.out.println("第一象限");
        else if(x<0&&y>0)System.out.println("第二象限");
        else if(x<0&&y<0)System.out.println("第三象限");
        else if(x>0&&y<0)System.out.println("第四象限");
        else if(x==0&&y!=0)System.out.println("在y轴上");
        else System.out.println("在x轴上");
    }
}
