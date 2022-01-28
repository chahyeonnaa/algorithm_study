package algorithm_study.Problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class 소인수분해 {
    public static boolean prime[];
    public static void main(String[] args) throws IOException {
        BufferedReader sc= new BufferedReader(new InputStreamReader(System.in));

        int N=Integer.parseInt(sc.readLine());
        ArrayList<Integer>arr=new ArrayList<Integer>();
        StringBuilder result = new StringBuilder();
        // N이하의 소수 구하기_에라토스테네스의 체 사용
        make_prime(N);

        for(int i=2;i<=N;i++)
        {
            if(prime[i]==false)
                arr.add(i);
        }

        int i=0;
        while(true)
        {
            if(i>arr.size()-1) // 리스트에서 인덱스 런타임 에러 방지
                break;
            if(N%arr.get(i)==0) // i를 기록하고, 몫을 나눈다.
            {
                result.append(arr.get(i)).append("\n");
                N=N/arr.get(i);
                i=0;
            }
            else
            {
                // i값 증가시키면서 인수 찾기
                i++;
            }
            if(N==1)
                break;
        }

        System.out.println(result);

    }
    public static void make_prime(int n)
    {
        prime=new boolean[n+2];

        prime[0]=prime[1]=true;

        for(int i=0;i<Math.sqrt(prime.length);i++)
        {
            if(prime[i]==true)
                continue;
            for(int j=i*i;j<prime.length;j=j+i)
            {
                prime[j] = true;
            }
        }
    }
}
