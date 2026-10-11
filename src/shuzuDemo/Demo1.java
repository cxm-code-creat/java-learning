package shuzuDemo;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        /*跳水比赛有五个评委打分，分数在0-100之间。最终得分会去掉一个最高分，去掉一个最低分
         * 剩余的分数再求平均分，改平均数为选手最终得分
         * 1.利用键盘录入5个整数存入数组当中，如果分数超出范围要重新录入
         * 2.定义方法分别求出数组的最大值和最小值
         * 3.计算五名评委的总分
         * 4.总分-最大值-最小值，求选手最终平均分*/

//    1.定义数组
        int[] arr = new int[5];
//    2.键盘录入五个整数
        Scanner sc = new Scanner(System.in);
        int i=0;
        while(i<5){
            System.out.println("请输入第" + (i + 1) + "个评委的分数");
            arr[i] = sc.nextInt();
            if(arr[i]>100||arr[i]<0){
                System.out.println("分数超出范围请重新录入：");
            }else {
                i++;
            }
        }
//        4.计算五名评委的总分
        double sum=0;
        for (int j = 0; j <arr.length; j++) {
            sum+=arr[j];
        }
        sum-=getMax(arr);
        sum-=getMin(arr);
        sum=(double)sum/(arr.length-2);
        System.out.println("选手最终得分是："+sum);
    }
//    3.定义方法数组
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <min) {
                min = arr[i];
            }
        }
        return min;
    }
}