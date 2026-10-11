package shuzuDemo;

import java.util.Scanner;

public class Demo2 {
    /*班主任需要统计10名学生的成绩（0-100），计算及格率，平均分，并找出最高分。
    * 1.键盘录入10名学生的成绩，存入数组，超出范围，提示“成绩无效，请重新输入：”
    * 2.定义方法，求及格人数，根据及格人数，求及格率
    * 3.定义方法求总分，根据总分求平均分
    * 4.定义方法求最大值*/
    public static void main(String[]args){
//        1.定义数组
        int[] arr=new int[10];
//        2.键盘录入10名学生的成绩
        Scanner sc=new Scanner(System.in);
        int i=0;
        while(i<arr.length){
            System.out.println("请输入第"+(i+1)+"个学生的成绩：");
            arr[i]=sc.nextInt();
            if(arr[i]>100||arr[i]<0){
                System.out.println("成绩无效，请重新输入：");
            }else {
                i++;
            }
        }
        //        3.调用方法，求及格人数，及格率
        int passCount=getPassCount(arr);
        double passRate=passCount/arr.length;
        System.out.println("及格人数为："+passCount);
        System.out.println("及格率为为："+passRate);
        //        4.调用方法，求总分，平均分
        double sum=getSum(arr);
        double avg=sum/arr.length;
        System.out.println("总分为为："+sum);
        System.out.println("平均分为为："+avg);
    }
//    3.定义方法，求及格人数，根据及格人数，求及格率
    public static int getPassCount(int[] arr){
        int count=0;
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]>=60){
                count++;
            }
        }
        return count;
    }
    //    4.定义方法求总分，根据总分求平均分
    public static double getSum(int[] arr){
        double sum=0;
        for (int i = 0; i <arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
}
