package controllerloop;

import java.util.Random;
import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        /*生成一个1-100之间的随机数，利用键盘录入模拟猜的动作，一直猜，直到猜中为止*/
//        小保底：在猜三次未猜中，提示用户随机数+-5之间
//        大保底：在猜三次未猜中，直接定义用户输入正确

//        1.生成一个1-100的随机数
        Random r=new Random();
        int number=r.nextInt(101);
        System.out.println(number);
        Scanner sc=new Scanner(System.in);
//        定义两个计数器
        int countA=0;
        int countB=0;
        while(true){
            System.out.println("请输入一个数字：");
            int guess=sc.nextInt();
//            只要用户猜一次，计数器就记一次
            countA++;
            countB++;
            if(countB==10){
                number=guess;
                break;
            }
            if(guess==number) {
                System.out.println("猜对了！");
                break;
            }else if(guess>number){
                System.out.println("猜大了，请重新输入:");
            }else{
                System.out.println("猜小了，请重新输入:");
            }
            if(countA%3==0){
                System.out.println("请在"+(number-5)+"到"+(number+5)+"之间猜");
            }
        }
    }
}
