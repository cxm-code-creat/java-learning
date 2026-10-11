package ForDemo;

import java.util.Scanner;

public class ForDemo7 {
    public static void main(String[] args) {
    /*描述：计算数列前n项的和：
    * S(n)=1-2+3-4+——
    * 实例1：输入：4
    *       说明：S（4）=1-2+3-4=-2
    *       输出：-2*/
//  1.输入一个变量
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int a=sc.nextInt();
//  2.定义一个求和变量
        int sum=0;
//  3.循环
        for(int i=1;i<=a;i++){
//            偶数
            if(i%2==0){
                sum=sum-i;
            }else{
                sum=sum+i;
            }
        }
        System.out.println("结果为："+sum);

    }
}
