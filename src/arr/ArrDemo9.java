package arr;

public class ArrDemo9 {
    public static void main(String[]args){
        int[] arr1={1,3,5,7,9};
        int[] arr2={2,4,6,8,10};
        int[] arr3=new int[arr1.length+arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i]=arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[i+arr1.length]=arr2[i];
        }
//        排序
        for (int i = 0; i < arr3.length; i++) {
            for(int y=0;y<arr3.length-1-i;y++){
                if(arr3[y]>arr3[y+1]){
                    int temp=arr3[y];
                    arr3[y]=arr3[y+1];
                    arr3[y+1]=temp;
                }
            }
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
    }
}
