package algorithm_study.Problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class 골드바흐의추측 {
    public static boolean prime[]=new boolean[10001];
    public static void main(String[] args) throws IOException {
        BufferedReader sc= new BufferedReader(new InputStreamReader(System.in));

        int T=Integer.parseInt(sc.readLine());
        make_prime();

        while(T-->0) // T를 1씩 줄여가면서, T가 0보다 클때만 반복문을 실행
        {
            int n = Integer.parseInt(sc.readLine());
            // 시간을 줄이는 핵심 아이디어_ 두 수를 n을 2로나눈 수에서 시작. n이 16이면 8에서 시작(8+8)
            // 하나는 줄이고, 하나는 늘려가면서 둘다 소수일때를 찾는다
            int first_partition = n / 2;
            int second_partition = n / 2;

            while (true) {

                // 두 파티션이 모두 소수일 경우
                if (!prime[first_partition] && !prime[second_partition]) {
                    System.out.println(first_partition + " " + second_partition);
                    break;
                }
                first_partition--;
                second_partition++;
            }

        }
        // 내가 한 방법은 결과는 바로 나오는데 시간초과가 뜬당.......
   /*     for(int i=0;i<T;i++)
        {
            int N=Integer.parseInt(sc.readLine());
            ArrayList<Integer>arr=new ArrayList<Integer>();
            int min=Integer.MAX_VALUE;
            int A=0,B=0;
            make_prime(N);
            for(int k=0;k<N;k++)
            {
                if(prime[k]==false)
                    arr.add(k);
            }

            for(int a=0;a<arr.size();a++)
            {
                for(int b=a;b<arr.size();b++)
                {
                    if(arr.get(a)+arr.get(b)==N) {
                        if(Math.abs(arr.get(a)-arr.get(b))<min)
                        {
                            min = Math.abs(arr.get(a) - arr.get(b));
                            A=arr.get(a);
                            B=arr.get(b);
                        }
                    }
                }

            }
            System.out.println(A+" "+B);
        }*/


    }
    public static void make_prime()
    {
        prime[0]=prime[1]=true;

        for(int i=2;i<Math.sqrt(prime.length);i++)
        {
            if(prime[i]==true)
                continue;
            for(int j=i*i;j<prime.length;j=j+i)
            {
                prime[j]=true;
            }
        }

    }

}
