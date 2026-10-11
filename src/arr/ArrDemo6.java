package arr;

import java.util.Random;

public class ArrDemo6 {
    public static void main(String[] args) {
        /*需求：获取10个1-100之间的随机数并存入到数组当中，要求保证数据是唯一的*/
//        1.获取随机数
        int[] arr=new int[10];
        Random r=new Random();
//        2获取10个1-100之间的随机数
        for (int i = 0; i < arr.length;) {
            int randomNum = r.nextInt(101);
            int count=0;
            for (int j = 0; j <i; j++) {
                if(randomNum==arr[j]){
                    count++;
//                    跳出内循环
                    break;
                }
            }
            if(count==0){
                arr[i]=randomNum;
                i++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
