package controllerloop;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[]args){
        /*需求：初始最大生命值200，受到X点伤害，技能恢复Y点血，X和Y由键盘录入而来
        * 假设，游戏人物不会死亡，最少1点血
        * 问：最终游戏人物的血量是多少？*/
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入X的值：");
        int X=sc.nextInt();
        while(true){
            if(X>0) {
                break;
            }else{
                System.out.println("输入的X值无效，请重新输入：");
                X=sc.nextInt();
            }
        }
        System.out.println("请输入Y的值：");
        int Y=sc.nextInt();
//        1.定义初始血量
        int blood=200;
        blood=blood-X+Y;
        if(blood>0&&blood<=200) {
            blood = blood;
        }else if(blood>200) {
            blood = 200;
        }else{
            blood = 1;
        }
        System.out.println("最终游戏人物的血量是："+blood);
    }
}
