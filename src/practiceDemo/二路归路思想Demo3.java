package practiceDemo;

public class 二路归路思想Demo3 {
    /*给定两个正序数数组arr1和arr2，请先合并数组，并找出合并之后数组的中位数*/
    public static void main(String[]args){
//  1.定义两个正序数组
        int[] arr1={1,3,5,7};
        int[] arr2={2,3,6,8};
        double number=getSum(arr1,arr2);
        System.out.println(number);
    }
//    2.定义方法
    public static double getSum(int[] arr1,int[] arr2){
//        3.合并两个数组
        int[] arr3=new int[arr1.length+arr2.length];
        int a=0;
        int b=0;
        /*int c=0;
        while(a<arr1.length&&b<arr2.length){
            if(arr1[a]<arr2[b]) {
                arr3[c] = arr1[a];
                a++;
            }else{
                arr3[c]=arr2[b];
                b++;
            }
            c++;
        }
        while(a<arr1.length){
            arr3[c]=arr1[a];
            a++;
            c++;
        }
        while(b<arr2.length){
            arr3[c]=arr2[b];
            b++;
            c++;
        }*/
        for (int i = 0; i < arr3.length; i++) {
            if(a==arr1.length){
                arr3[i]=arr2[b];
                b++;
                continue;
            }
            if(b==arr2.length){
                arr3[i]=arr1[a];
                a++;
                continue;
            }
            if(arr1[a]<arr2[b]){
                arr3[i]=arr1[a];
                a++;
            }else{
                arr3[i]=arr2[b];
                b++;
            }
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
//        4.算中间值
        if(arr3.length%2==0){
            return(arr3[arr3.length/2]+arr3[(arr3.length/2)-1])/2.0;
        }else{
            return arr3[arr3.length/2];
        }
    }
}
