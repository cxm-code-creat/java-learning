package controllerloop;

public class Demo10 {
    public static void main(String[] args) {
        /*打印空心菱形*/
        for (int i = 1; i <= 3; i++) {
            for(int a=i;a<=3;a++) {
                System.out.print(" ");
            }for(int b=1;b<=2*i-1;b++) {
                if (b == 1 || b == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i =1; i <= 7; i++) {
            if(i==1||i==7) {
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
        for (int d = 1; d <= 3; d++) {
            for(int e=1;e<=d;e++) {
                System.out.print(" ");
            }for(int f=1;f<=5-2*d;f++) {
                if(f==1||f==5-2*d) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
