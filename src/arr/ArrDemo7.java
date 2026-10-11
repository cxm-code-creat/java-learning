package arr;

public class ArrDemo7 {
    public static void main(String[] args) {
        /*给定一个整数数组nums和一个整数目标值target，请在该数组中找出
         * 和为目标值target的那两个整数，并输出它们的数组索引
         *
         * 提示：先不用考虑效率问题，两层循环即可完成
         * 要求1：只要输出第一对满足要求的情况
         * 要求2：输出所有满足要求的情况*/

//        1.定义数组
        int[] nums = {1, 2, 3, 4, 5, 6};
//        2.定义目标值
        int target = 7;
//        3.遍历数组
        int count=0;
        int slow = 0;
        while (slow< nums.length&&count<1) {
            for (int fast = slow+1; fast < nums.length; fast++) {
                if (nums[fast] + nums[slow] == target) {
                    count++;
                    System.out.println(nums[slow] + "和" + nums[fast]);
                    break;
                }
            }
            slow++;
        }
    }
}
