package algorithm_study.Problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 백트래킹 문제
public class 연산자_끼워넣기 {
    public static int N;
    public static int number[];
    public static int operator[]=new int[4];
    public static int MAX = Integer.MIN_VALUE;
    public static int MIN = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {

        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));

        N=Integer.parseInt(sc.readLine());
        number=new int[N];

        StringTokenizer in=new StringTokenizer(sc.readLine()," ");
        for(int i=0;i<N;i++)
        {
            number[i]=Integer.parseInt(in.nextToken());
        }

        in=new StringTokenizer(sc.readLine()," ");
        for(int i=0;i<4;i++)
        {
            operator[i]=Integer.parseInt(in.nextToken());
        }
        dfs(number[0],1);

        System.out.println(MAX);
        System.out.println(MIN);
    }

    public static void dfs(int arr,int id)
    {
        if(id==N)
        {
            MAX=Math.max(MAX,arr);
            MIN=Math.min(MIN,arr);
            return;
        }

        for(int i=0;i<4;i++)
        {
            if(operator[i]!=0)
            {
                operator[i]--;

                switch (i)
                {
                    case 0: dfs(arr+number[id],id+1);
                            break;
                    case 1: dfs(arr-number[id],id+1);
                            break;
                    case 2: dfs(arr*number[id],id+1);
                            break;
                    case 3: dfs(arr/number[id],id+1);
                            break;
                }

                operator[i]++;
            }
        }

    }
}
