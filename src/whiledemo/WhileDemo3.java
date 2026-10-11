package whiledemo;

public class WhileDemo3 {
    public static void main(String[] args) {
        /*假设在银行投资了100000元，银行给出的复利是1.7%，问多少年后本金翻倍*/
        double principal = 100000;
        double year=0;
        while(principal<=200000){
            principal=principal+principal*0.017;
            year++;
        }
        System.out.println(year);
    }
}
