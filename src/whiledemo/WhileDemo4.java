package whiledemo;

public class WhileDemo4 {
    public static void main(String[] args) {
        /*珠穆朗玛峰高度是：8848.86米=8848860毫米
        * 假如有一张足够大的纸，厚度为0.1毫米
        * 请问：这张纸折叠多少次，可以折成珠穆朗玛峰的高度？*/
        double mountianHeight = 8848860;
        double paper=0.1;
        int count=0;
        while(paper<=8848860){
            paper=paper*2;
            count++;
        }
        System.out.println(count);
    }
}
