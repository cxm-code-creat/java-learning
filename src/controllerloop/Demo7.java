package controllerloop;

public class Demo7 {
    public static void main(String[] args) {
        /*打印平行四边形
        *    *****
        *   *****
        *  *****      */


//        1.首先现将其补成长方形
//        外循环
        for (int i = 1; i <= 3; i++) {
//            内循环
            for (int a = i; a <= 2; a++) {
                System.out.print(" ");
            }
//            内循环
            for (int b = 1; b <= 5; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
