package algorithm_study.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 소수구하는법
{
    public static boolean prime[];
    public static void main(String[] args) throws IOException {
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(sc.readLine());

        int M=Integer.parseInt(st.nextToken());
        int N=Integer.parseInt(st.nextToken());

        make_prime(N);
        for(int i=M;i<N;i++)
        {
            if(prime[i]==false)
                System.out.println(i);
        }

    }

    public static void make_prime(int n)
    {
        prime=new boolean[n+1];

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
