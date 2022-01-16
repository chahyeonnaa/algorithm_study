package Problem;

import java.util.Scanner;
import java.math.BigInteger;
// BigInteger 안쓰는 알고리즘 구현

public class 큰수 {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        int max_length=Math.max(A.length(),B.length());

        int []Aa = new int[max_length+1]; // 가장 큰 자릿수에서 덧셈이 발생할 수 있음
        int []Bb = new int[max_length+1];

        // A배열 초기화_ 가장 큰 자릿수부터 거꾸로 채우기
        for(int i=A.length()-1, idx=0; i>=0;i--,idx++)
        {
            Aa[idx]=A.charAt(i)-'0';
        }

        for(int i=B.length()-1, idx=0; i>=0;i--,idx++)
        {
            Bb[idx]=B.charAt(i)-'0';
        }

        // 두 수를 더해서 더한값과 10으로 나눈 나머지는 그 자릿수에 들어가고,
        // 몫은 다음 자릿수에 더해줌
        for(int i=0;i<max_length;i++)
        {
            int value=Aa[i]+Bb[i];
            Aa[i]=value%10;
            Aa[i+1]+=value/10;
        }

        StringBuilder sb= new StringBuilder();
        // 가장 큰 자릿수가 0이 아니면, 해당 숫자를 추가해야 정상적인 숫자가 완성됨
        // 이 과정이 꼭 필요함-> 아니면 맨 앞자릿수가 0인 경우도 있음(숫자가 0으로 시작)
        if(Aa[max_length]!=0)
            sb.append(Aa[max_length]);

        for(int i=max_length;i>=0;i--)
        {
            sb.append(Aa[i]);
        }
        System.out.println(sb);
    }
    // BigInteger 클래스 사용
    /*public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        BigInteger A = new BigInteger(in.next());
        BigInteger B = new BigInteger(in.next());

        A = A.add(B);

        System.out.println(A.toString());
    }*/
}
