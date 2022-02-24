package algorithm_study.Problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N과M_3 {
    public static int[] arr;
    public static StringBuilder sb= new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer in=new StringTokenizer(sc.readLine());
        int N=Integer.parseInt(in.nextToken());
        int M=Integer.parseInt(in.nextToken());

        arr=new int[M];

        dfs(N,M,0);

        System.out.println(sb);

    }
    // 깊이우선탐색
    public static void dfs(int N, int M,int depth)
    {
        if(depth==M)
        {
            for(int numbers : arr)
            {
                sb.append(numbers).append(" ");
            }
            sb.append("\n");
            return;
        }
        for(int i=0;i<N;i++)
        {
            arr[depth]=i+1;
            dfs(N,M,depth+1);
        }

    }
}



