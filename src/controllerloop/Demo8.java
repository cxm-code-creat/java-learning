package controllerloop;

public class Demo8 {
    public static void main(String[] args) {
        /*打印梯形
        *      ***
        *     *****
        *    *******    */

//        1.数学思维打印梯形
        for (int i = 1; i <= 3; i++) {
            for (int b =i; b<3;b++) {
                System.out.print(" ");
            }
            for(int a=1;a<=2*i+1;a++){
                System.out.print("*");
            }
            System.out.println();
        }

//        2.图像思维打印梯形
        for (int i = 1; i <= 3; i++) {
            for(int a=i;a<=2;a++) {
                System.out.print(" ");
            }
            for(int b=2;b<=i;b++){
                System.out.print("*");
            }
            for (int c= 1; c<= 3;c++) {
                System.out.print("*");
            }
            for(int b=2;b<=i;b++){
                System.out.print("*");
            }
            for(int a=i;a<=2;a++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
