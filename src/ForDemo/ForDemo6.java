package ForDemo;

public class ForDemo6 {
    public static void main(String[] args) {
    /*有一组特殊的数字，从第三项开始，每一项都是前两项的数字和，请问第10项的数字是多少？*/
   int a=0;
   int b=1;
//   定义一个变量，赋值为0‘表示A和B后面的一项值
        int c=0;
//   利用循环不断获取每一项的值
        for(int i=3;i<=10;i++){
            c=a+b;
            /*不断地修改a和b的值（让b等于c，c等于a+b）*/
            a=b;
            b=c;
        }
        System.out.println("第10项的数字是"+c);
    }

}
