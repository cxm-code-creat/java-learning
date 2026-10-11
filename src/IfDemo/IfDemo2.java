package IfDemo;

import java.util.Scanner;

public class IfDemo2 {
    public static void main(String[] args) {
        /*需求：初始最大生命200，受到X点伤害，技能恢复Y点血，X和Y由键盘录入而来
        * 假设，游戏人物不会死亡，最少1点血
        * 问：最终游戏人物血量是多少*/
        Scanner sc=new Scanner(System.in);
//        1.定义初始最大生命值，受到X点伤害，技能恢复Y点血
        int hp=200;
        System.out.println("请输入X:");
        int hurt=sc.nextInt();
        hp=hp-hurt;
        if(hp<=0){hp=1;}/*游戏人物不会死亡，生命最少为1*/
        System.out.println("最终游戏人物血量是:"+hp);
        System.out.println("请输入Y:");
        int add=sc.nextInt();
        hp=hp+add;
        if(hp>200){hp=200;}/*游戏人物不会超过最大生命值*/
        System.out.println("最终游戏人物血量是:"+hp);

    }
}
