package arr;

import java.util.Scanner;

public class ArrDemo2 {
    public static void main(String[]args){
        /*需求：键盘录入5个整数，存入数组当中，并进行遍历*/
        int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第"+(i+1)+"个整数");
            int num=sc.nextInt();
            arr[i]=num;
            System.out.println(arr[i]);
        }
    }
}
