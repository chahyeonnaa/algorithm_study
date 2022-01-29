package algorithm_study.Problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class 베르트랑공준 {
    public static boolean prime[];
    public static void main(String[] args) throws IOException {
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));

        while(true)
        {
            int N=Integer.parseInt(sc.readLine());
            if(N==0)
            {
                break;
            }

            // N보다크고 2N보다 작거나 같은 소수의 개수 구하기
            make_prime(N);
            int count=0;
            for(int i=N+1;i<=2*N;i++)
            {
                if(prime[i]==false)
                    count++;
            }
            System.out.println(count);

        }
    }

    public static void make_prime(int n)
    {
        prime=new boolean[(2*n)+1];

        prime[0]=prime[1]=true;

        for(int i=2;i<Math.sqrt(prime.length);i++)
        {
            if(prime[i]==true)
                continue;
            for(int j=i*i;j<prime.length;j=j+i)
                prime[j]=true;
        }

    }

}
