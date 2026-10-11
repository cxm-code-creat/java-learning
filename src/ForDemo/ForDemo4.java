package ForDemo;

public class ForDemo4 {
    public static void main(String[]args){
        /*需求；在实际开发中，如果要获取一个范围中的每一个数据时，会用到循环
        * 但是，如果只想获取其中符合要求的数据，此时就需要循环和其他语句结合使用
        * 例如：求1-100之间的偶数和*/
        int sum=0;
//        将偶数分出来
       for(int i=1;i<=100;i++){
           if(i%2==0){
               sum=sum+i;/*或者；sum+=i*/
           }
       }
       System.out.println(sum);
    }
}
