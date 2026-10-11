package practiceDemo;

public class Demo5 {
    /*接雨水
    * 给定n个非负整数表示每个宽度为1的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水
    * 输入：height={0,1,0,2,1,2,1,3,2,1,2,1}
    * 输出：6
    * 解释：下面是由数组{0,1,0,2,1,2,1,3,2,1,2,1}表示的高度图，在这种情况下，可以接6个单位的雨水*/
    public static void main(String[]args){
//        1.定义一个数组
        int[] height={0,1,0,2,1,2,1,3,2,1,2,1};
//        2.动态规划思想
//        右边边缘柱子无限大
        int max=0;
//        3.改动数组值
        int[] height1=new int[height.length];
        for (int i = 0; i < height.length; i++) {
           if(height[i]>max){
               max=height[i];
           }
           height1[i]=max;
        }
        int sum1=getWater(height1);
//        4.左边的值无限大
        int max2=0;
        int[] height2=new int[height.length];
        for(int i=height.length-1;i>=0;i--){
            if(height[i]>max2){
                max2=height[i];
            }
            height2[i]=max2;
        }
        int sum2=getWater(height2);
        int water=sum1-sum2;
        if(water<0){
            water=-1*water;
        }
        System.out.println("可以接"+water+"个单位的水");
    }
    //        5.定义一个方法，计算数组中所有元素的和
    public static int getWater(int[] height){
        int sum=0;
        for (int i = 0; i < height.length; i++) {
            sum+=height[i];
        }
        return sum;
    }
}
