package arr;

import java.util.Random;

public class ArrDemo5 {
    public static void main(String[] args) {
        /*需求：已知数组元素为{1,2,3,4,5,6,7，8,9,10}
        * 需求：打乱数组中的数据*/
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        Random r=new Random();
        for (int i = 0; i < arr.length; i++) {
            int randomIndex=r.nextInt(arr.length);
            int temp=arr[i];
            arr[i]=arr[randomIndex];
            arr[randomIndex]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
