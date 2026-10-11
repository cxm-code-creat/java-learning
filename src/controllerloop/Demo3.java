package controllerloop;

public class Demo3 {
    public static void main(String[] args){
        /*循环打印1-100之间的数字，如果数字包含7或是7的倍数，输出过*/
        for (int i = 1; i <= 100; i++) {
            if(i%7==0||i%10==7||i/10==7){
                System.out.print("过");
                continue;
            }
            System.out.print(i);
        }
    }
}

//1.先考虑题目条件，7或7的倍数
//2.7的倍数可以想到取余，包含7，那么7可以在十位也可以在百位，就要考虑怎么样去避免