package arr;

public class ArrDemo8 {
    public static void main(String[]args){
        /*给两个有序数组arr1和arr2，
        * 将两个数组中的数据合并到一个大数据中
        * 要求：合并之后的的数组也是有序的
        * 举例1：
        * arr1:1 3 5 7 9
        * arr2:2 4 6 8 10
        * arr3:1 2 3 4 5 6 7 8 9 10*/

//        1.定义数组
        int[] arr1={1,3,5,7,9};
        int[] arr2={2,4,6,8,10};
//        2.定义新数组
        int[] arr3=new int[arr1.length+arr2.length];
//        定义指针
        int a=0;
        int b=0;
        int c=0;
        while(a<arr1.length&&b<arr2.length){
            if(arr1[a]>arr2[b]){
                arr3[c]=arr2[b];
                b++;
                c++;
            }else{
                arr3[c]=arr1[a];
                a++;
                c++;
            }
        }
        while(a<arr1.length) {
            arr3[c] = arr1[a];
            a++;
            c++;
        }
        while(b<arr2.length) {
            arr3[c] = arr2[b];
            b++;
            c++;
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
        }
    }
