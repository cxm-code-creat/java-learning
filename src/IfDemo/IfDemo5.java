package IfDemo;

import java.util.Scanner;

public class IfDemo5 {
    public static void main(String[] args) {
    /*卡拉兹函数：给定正整数n
    * 若n为奇数，则f(n)=3n+1
    * 若n为偶数，则f(n)=n/2*/
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
//        1.判断正整数n是奇数还是偶数
         if(n%2==0) {
             n =n/2;
         }else{
             n=3*n+1;
         }
         System.out.println(n);
    }
}
