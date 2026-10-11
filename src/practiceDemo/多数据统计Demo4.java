package practiceDemo;

import java.util.Random;

public class 多数据统计Demo4 {
    /*学校选举学生会主席，有五个候选人
    * 全校1000名同学参与投票（每人一票，可以弃权，或者选1-5号）。
    * 投票使用Random模拟。0：弃权，1-5：给对应候选人投票
    *
    * 要求1：统计每个候选人的得票数和得票率，找出得票最多的候选人
    * 要求2：统计弃票数和弃票率是多少*/
    public static void main(String[]args) {
        Random r = new Random();
        /*int count0=0;
        int count1=0;
        int count2=0;
        int count3=0;
        int count4=0;
        int count5=0;
        for (int i = 1; i <= 1000; i++) {
            int num=r.nextInt(6);
            if(num==0){
                count0++;
            }else if(num==1){
                count1++;
            }else if(num==2){
                count2++;
            }else if(num==3){
                count3++;
            }else if(num==4){
                count4++;
            }else if(num==5){
                count5++;
            }
        }
        System.out.println("弃票数："+count0+"弃权票率："+getRate(count0));
        System.out.println("候选人1数："+count1+"候选人1得票率："+getRate(count1));
        System.out.println("候选人2数："+count2+"候选人2得票率："+getRate(count2));
        System.out.println("候选人3数："+count3+"候选人3得票率："+getRate(count3));
        System.out.println("候选人4数："+count4+"候选人4得票率："+getRate(count4));
        System.out.println("候选人5数："+count5+"候选人5得票率："+getRate(count5));
    }*/
//        简化版
        int[] count=new int[6];
        for (int i = 1; i <= 1000; i++) {
            /*num代表：
            * 1：投票的号数
            * 2：数组的索引*/
            int num=r.nextInt(6);
            count[num]++;
        }
        System.out.println("弃票数："+count[0]+"弃权票率："+getRate(count[0]));
        for (int i = 0; i < 5; i++) {
            System.out.println("候选人"+(i+1)+"数："+count[i+1]+"候选人"+(i+1)+"得票率："+getRate(count[i+1]));
        }
//        比大小
        int max=0;
        for (int i = 0; i < count.length; i++) {
            if(count[i]>max){
                max=count[i];
            }
        }
        /*因为0代表的是弃票数，所以从1开始比较，maxIndex=1*/
        int maxIndex=1;
        for (int i = 2; i < count.length; i++) {
            if(count[i]==max){
                maxIndex=i;
            }
        }
        System.out.println("得票数最多的候选人是："+(maxIndex));
    }
    public static String getRate(int count){
        return (count/1000.0)*100+"%";
    }
}
