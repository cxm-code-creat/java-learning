package whiledemo;

import java.util.Scanner;

public class WhileDemo5 {
    public static void main(String[] args){
        /*描述：给定一个整数n，请计算其所有数位之和。若n为负数，请先取其绝对值。
        * 实例1：
        * 输入：12  说明：1+2=3  输出：3*/
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个整数");
        int n=sc.nextInt();
        int sum=0;
        if(n<0){
            n=-n;
        }
        while(n!=0){
            sum=n%10+sum;
            n=n/10;
        }
        System.out.println("所有数位之和为："+sum);
    }
}
