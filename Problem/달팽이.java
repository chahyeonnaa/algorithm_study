package Problem;

import java.util.Scanner;

public class 달팽이 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int V=sc.nextInt();

        int result=hiking(A,B,V);
        System.out.println(result);
    }
    static int hiking(int a, int b, int v) {
        // 반복문 돌려서 하면 시간초과뜸
/*      int current=0;
        int count=1;

        while(true)
        {
            current=current+a-b;
            count++;
            if(current+a>=v)
                break;
        }*/

        // 안돌리는 방법_ 자바 11제출_이래도 시간초과뜸_ 스캐너 이용하면 안됨
        int day = (v - b) / (a - b);
        if ((v - b) % (a - b) != 0)
            day++;

        return day;
    }
}
