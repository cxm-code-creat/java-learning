package controllerloop;

public class Demo4 {
    public static void main(String[] args) {
        /*跳过4的倍数或含4的数，1<=n<=10*10*10*10*10*/
        for (int i = 1; i <= 100000; i++) {
            if(i%4==0||i%10==4||i/10==4){
                continue;
            }
            System.out.println(i);
        }
    }
}
