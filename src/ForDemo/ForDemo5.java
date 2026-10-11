package ForDemo;

import java.util.Scanner;

public class ForDemo5 {
    public static void main(String[] args) {
    /*需求：键盘录入两个数字，表示一个范围
    * 统计这个范围中，既能被3整除，又能被5整除的数字有多少个*/
//    键盘录入
        Scanner sc=new Scanner(System.in);
        System.out.println("键盘录入两个数字:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int max=a>b?a:b;
        int min=a<b?a:b;
        int count=0;
        for(int i=min;i<=max;i++){
            if(i%3==0&&i%5==0){
                count++;
            }
        }
        if(count==0) {
            System.out.println("没有既能被3整除，又能被5整除的数字");
        }
        System.out.println("总共有"+count+"个");
    }
}
