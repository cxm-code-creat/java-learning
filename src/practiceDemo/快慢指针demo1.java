package practiceDemo;

public class 快慢指针demo1 {
    /*移除元素
    * 给你一个数组nums和一个值val，你需要删除所有数值等于val的元素
    * eg1：
    * 输入：nums=[3,2,2,3] val=3
      输出: nums=[2,2],剩余两个元素
     */
    public static void main(String[]args){
//        1.定义一个数组
        int[] nums={3,2,2,3,5,4,6};
        int val=3;
        int slow=0;
        for (int fast= 0; fast < nums.length; fast++) {
            if(nums[fast]!=val){
                nums[slow]=nums[fast];
                slow++;
            }
        }
        System.out.print("[");
        for (int i = 0; i < slow; i++) {
            if(i>0&&i<slow){
                System.out.print(",");
            }
            System.out.print(nums[i]);
        }
        System.out.print("]");
        }
}
/*第二种循环的写法：
int fast=0;
* while(fast<arr.length){
* if(nums[fast]!=val){
* nums[slow]=nums[fast];
* slow++;
* }
* fast++;
* }*/