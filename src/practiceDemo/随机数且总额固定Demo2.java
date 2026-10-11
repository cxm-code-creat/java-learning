package practiceDemo;

import java.util.Random;

public class 随机数且总额固定Demo2 {
    /*红包问题：
    * 给你两个整数M和N，M表示红包的总额，N表示红包的个数
    * 现在又N个人来抽红包，每个人都是随机的，打印每个人领的红包金额
    *
    * 注：1.每个人最少1分钱
    * 2.每个人领完后，至少预留1*n分钱
    * 3.最后一个人拿剩余的总额*/
    public static void main(String[]args) {
//        1.定义M和N
        int M = 10000;
        int N = 5;
        if (M < N) {
            System.out.println("金额不足请重新输入：");
        } else {
            int remain = M;
            Random R = new Random();
            for (int i = 1; i < N; i++) {
                int max = R.nextInt(remain - (N - i)) + 1;
                remain -= max;
                System.out.println("第" + i + "个人领的红包金额为:" + max + "分");
            }
            System.out.println("第" + N + "个人领的红包金额为:" + remain + "分");
        }
    }
}
