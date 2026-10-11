package whiledemo;

public class WhileDemo2 {
    public static void main(String[] args) {
        /*获取1-100之间的每一个数*/
       /* for(int i=1;i<=100;i++){
            System.out.println(i);
        }*/

        /*读取本地文件中的数据，一次读一个字*/
       /* int i=1;
        while(i<=10){
            System.out.println("第"+i+"个字");
            i++;
        }*/

       /*登录时，密码输入错误最多可以重复3次*/
        for(int i=1;i<=3;i++){
            System.out.println("请输入密码");
        }
    }
}
