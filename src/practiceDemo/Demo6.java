package practiceDemo;

import java.util.Random;
import java.util.Scanner;

public class Demo6 {
        /*彩票规则：
        * 前区：1-35选五个号码
        * 后区：1-12选2个号码
        * 1.利用Random生成彩票号码
        * 2.利用Scanner买彩票
        * 3.判断是否中奖*/
        public static void main(String[]args){
//            1.定义数组接收彩票号码
            int[] lotterynumber=creatLotteryNumber();
            printLotterNumber(lotterynumber);
//            2.利用Scanner买彩票
            int[]mylotternumber=buyLotteryNumber();
            printLotterNumber(mylotternumber);
//            3.判断中奖
            getWinnerNumber(lotterynumber,mylotternumber);

    }
    public static int[] buyLotteryNumber(){
        int[] arr = new int[7];
        Scanner sc = new Scanner(System.in);
//        前区
        for (int i = 0; i < 5; ) {
            System.out.println("请输入第" + (i + 1) + "个彩票号码:");
            int number = sc.nextInt();
//            范围
            if (number < 1 || number > 35) {
                System.out.println("超出范围请重新输入：");
                continue;
            }
//            是否唯一
            boolean flag = contains(arr, number, 0, 4);
            if (flag) {
                System.out.println("当前号码已存在，请重新输入：");
                continue;
            }
            arr[i] = number;
            i++;
        }
//        后区
        for (int i = 0; i < 2; ) {
            System.out.println("请输入第" + (i + 1) + "个彩票号码:");
            int number = sc.nextInt();
//            范围
            if (number < 1 || number > 12) {
                System.out.println("超出范围请重新输入：");
                continue;
            }
//            是否唯一
            boolean flag = contains(arr, number, 5, 6);
            if (flag) {
                System.out.println("当前号码已存在，请重新输入：");
                continue;
            }
            arr[5+i] = number;
            i++;
        }
        return arr;
    }
    public static int[] creatLotteryNumber() {
        int[] arr = new int[7];
        Random r = new Random();
//        2.生成前区随机数
        for (int i = 0; i < 5; ) {
            int number = r.nextInt(35) + 1;
//            判断是否唯一（反复用）
            boolean flag=contains(arr,number,0,4);
            if(!flag){
                arr[i]=number;
                i++;
            }
        }
//        3.生成后区随机数
        for (int i = 0; i < 2; ) {
            int number = r.nextInt(12)+1;
            boolean flag = contains(arr, number, 5, 6);
            if(!flag){
                arr[5+i]=number;
                i++;
            }
        }

        return arr;
    }
    public static boolean contains(int[] arr,int number,int start,int end){
            for (int i =start; i <=end; i++) {
                if(arr[i]==number){
                    return true;
                }
            }
            return false;
    }
    public static void printLotterNumber(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.println("]");
    }
//    arr1:彩票号码  arr2:自己的号码
    public static void getWinnerNumber(int[] arr1,int[] arr2){
//            判断前区中了几个
        int coubt1 = getCount(arr1, arr2, 0, 4);
        int coubt2 = getCount(arr1, arr2, 5, 6);
//        判断中了几等奖
    }
//    判断中了几个球
    public static int getCount(int[] arr1,int[] arr2,int start,int end){
        int count=0;
        for (int i = start; i <=end; i++) {
            boolean flag = contains(arr1, arr2[i],start,end);
            if(flag){
                count++;
            }
        }
        return count;
    }
}
