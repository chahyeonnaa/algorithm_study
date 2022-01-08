package Problem;

import java.util.Scanner;

public class 분해합 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int M=in.nextInt(); // 입력받는수, 합이 M이되는 가장작은 N찾기

        int result = hap(M);
        System.out.println(result);
    }
    static int hap(int M) {
        int temp=0;
        for(int i=0;i<=M;i++)
        {
            int sum=0;
            int number=i; // 밑에서 i를 써야해서 넘버로 지정
            while (number != 0)
            {
                sum = sum + (number % 10); // 각 자릿수 더하기
                number = number / 10;
            }
            if(sum+i==M)
            {
                temp = i;
                break;
            }
        }
        return temp;
    }
}
