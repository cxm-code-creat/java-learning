package IfDemo;

import java.util.Scanner;

public class IfDemo8 {
    public static void main(String[] args) {
   /*用电量计算采取阶梯计费原理，规则如下：
   * 1.[0-100]度，按0.5元/度计费
   * 1.[100-200]度，按0.8元/度计费
   * 1.[超过200]度，按1.2元/度计费
   *
   * 输入变量usage表示实际用电量，输出总电费cost*/
        Scanner sc=new Scanner(System.in);
        double usage=sc.nextDouble();
        double cost=0;
        if(usage>0){
            if(usage<=100)cost=usage*0.5;
            if(usage<=200)cost=100*0.5+(usage-100)*0.8;
            if(usage>200)cost=100*0.5+100*0.8+(usage-200)*1.2;
            System.out.println("总电费为；"+cost);
        }else{
            System.out.println("输入错误");
        }
    }
}
