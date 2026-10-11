package controllerloop;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        /*键盘录入一个大于等于2的整数，判断是否为质数*/
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个大于等于2的整数：");
        int num=sc.nextInt();
        while(true){
            if(num>=2) {
                break;
            }else{
                System.out.println("输入的整数无效，请重新输入：");
                num=sc.nextInt();
            }
        }
        int count=0;
        for (int i = 2; i < num; i++) {
            if(num%i==0) {
                count++;
            }
        }
        if(count==0) {
            System.out.println(num + "是质数");
        }else{
            System.out.println(num + "不是质数");
        }
    }
}

