package Problem;

import java.util.Scanner;

public class 영화감독 {
    public static void main(String[] args) {

        // 반복문 끝까지 돌려서 찾아내기_ 성능 down
/*      Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();

        int num=666;
        int count=1;

        while(count!=N)
        {
            num++;
            if(String.valueOf(num).contains("666"))
                count++;

        }
        System.out.println(num);*/

        // 복잡하지만 빠른 방법_666을 포함하는지 숫자를 10으로 나눈 나머지값을 이용하여 확인
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();

        int num=666;
        int count=1;

        while(count!=N)
        {
            num++;
            if(check(num))
                count++;
        }
        System.out.println(num);
    }
    static boolean check(int num)
    {
        int count=0;
        while(count!=3)
        {
            int n=num%10; // 나머지가 n
            if(n==6)
            {
                count++;
            }
            else {
                count = 0;
            }
            num=num/10; // num값을 몫으로 대체
            if(num==0) // 몫이 0이면 빠져나옴
                break;
        }

        if(count==3)
            return true;
        else
            return false;
    }
}
