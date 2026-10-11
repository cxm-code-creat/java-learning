package controllerloop;

public class Demo9 {
    public static void main(String[] args) {
        /*打印菱形*/

//        1.数学思维
        for (int i = 1; i <= 3; i++) {
            for(int a=i;a<=3;a++) {
                System.out.print(" ");
            }for(int b=1;b<=2*i-1;b++) {
                System.out.print("*");
            }
            System.out.println();
            }
        for (int i =1; i <= 7; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int d = 1; d <= 3; d++) {
            for(int e=1;e<=d;e++) {
                System.out.print(" ");
            }for(int f=2*d-1;f<=5;f++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
