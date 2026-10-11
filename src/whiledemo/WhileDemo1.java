package whiledemo;

public class WhileDemo1 {
    public static void main(String[] args) {
        /*利用while循环，实现游戏中连续跳跃10次，用输出语句模拟跳跃逻辑*/
        int i=1;
        while(i<=10){
            System.out.println("第"+i+"次跳跃");
            i++;
        }
    }
}
