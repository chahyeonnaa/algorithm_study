package algorithm_study.Problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 같은 수 뽑기 가능
// 오름차순 정렬 -> (4,3) 이나 (3,4)나 같다.
public class N과M_4 {
    public static int arr[];
    public static boolean visit[];
    public static StringBuilder sb=new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer in= new StringTokenizer(sc.readLine());
        int N=Integer.parseInt(in.nextToken());
        int M=Integer.parseInt(in.nextToken());

        arr=new int[M];
        visit=new boolean[N];
        dfs(N,M,0,0);

        System.out.println(sb);

    }
    public static void dfs(int N,int M,int depth,int is)
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

        for(int i=is;i<N;i++)
        {
            arr[depth]=i+1;
            dfs(N,M,depth+1,i);
        }
    }
}
