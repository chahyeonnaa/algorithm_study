package Problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 백트래킹 문제_ 처음본다.
// 되추적, 어떤 노드의 유망성을 판단한 뒤, 해당 노드가 유망하지않다면 부모노드로 돌아가 다른 자식노드를 찾는 방법.
// 브루트포스 : 모든 경우의 수를 도는것
// DFS(깊이우선탐색) : 백트래킹에 사용하는 대표적인 탐색 알고리즘(트리순회형태), 재귀호출 형태

public class N과M {

    public static int[] arr;
    public static boolean[] visit;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());

        arr=new int[M];
        visit=new boolean[N];
        dfs(N,M,0);
        System.out.println(sb);

    }
    public static void dfs(int N,int M,int depth)
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

        for(int i=0;i<N;i++)
        {
            // 초기에는 0부터 끝까지 전부 false로 초기화되어있음
            if(visit[i]==false)
            {
                visit[i]=true; // 방문했음을 기록
                arr[depth]=i+1; // 숫자쓰기
                dfs(N,M,depth+1); // 깊이 더한 후 재귀호출 -> 0부터 차례대로 true로 만들어짐
                // return을 만나고 왔으면, 되돌아가면서 false로 지정 + 반복문 돌릴 수 있으면 돌리기
                visit[i]=false;
            }
        }
    }
}
