package algorithm_study.Problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 이전 문제와 다르게 (2,4) (4,2)는 같은 것으로 간주해야함
// 백트래킹 문제 : 어떤 노드의 유망성을 판단한 뒤, 해당 노드가 유망하지 않으면 부모 노드로 돌아가 다른 자식노드를 찾는 방법
//             : 브루트포스와 다르게 유망성을 판단한 뒤, 불가능한 경우는 탐색하지 않는다.
// 주로 dfs(깊이우선탐색) 알고리즘을 사용
public class N과M_2 {
    public static int[] arr;
    public static boolean[] visit;
    public static StringBuilder sb=new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader sc= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer in=new StringTokenizer(sc.readLine());
        int N=Integer.parseInt(in.nextToken());
        int M=Integer.parseInt(in.nextToken());

        // 1부터 N까지의 숫자들에서 M개 뽑기
        arr=new int[M]; // 결과를 담을 배열
        dfs(N,M,0,1);
        System.out.println(sb);

    }

    public static void dfs(int N,int M,int depth, int is)
    {
        if(depth==M) // 깊이가 M과 같아지면, 담았던 배열을 출력
        {
            for(int numbers: arr)
            {
                sb.append(numbers).append(" ");
            }
            sb.append("\n");
            return;
        }
        for(int i=is;i<=N;i++)
        {
            arr[depth]=i;
            dfs(N,M,depth+1,i+1);
        }
    }
    }

