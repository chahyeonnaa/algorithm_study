package algorithm_study.Problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 스타트와_링크 {
    public static boolean check[];
    public static int N;
    public static int number[][];
    static int Min = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));

        int N=Integer.parseInt(sc.readLine());
        number=new int[N][N];
        check=new boolean[N];

        for(int i=0;i<N;i++)
        {
            StringTokenizer in=new StringTokenizer(sc.readLine());
            for(int j=0;j<N;j++)
            {
                number[i][j]=Integer.parseInt(in.nextToken());
            }
        }
        combination(0,0);
        System.out.println(Min);
    }
    public static void diff()
    {
        int start=0;
        int link=0;


        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {

                if (check[i] == true &&check[j] == true) {
                    start += number[i][j];
                    start += number[j][i];
                }

                else if (check[i] == false && check[j] == false) {
                    link += number[i][j];
                    link += number[j][i];
                }
            }
        }
        int val = Math.abs(start - link);

        if (val == 0) {
            System.out.println(val);
            System.exit(0);
        }

        Min = Math.min(val, Min);

    }
    public static void combination(int num, int idx)
    {
        if(idx==N/2)
        {
            diff();
            return;
        }

        for(int i=num;i<N;i++)
        {
            if(!check[i])
            {
                check[i]=true;
                combination(i+1,idx+1);
                check[i]=false;
            }
        }
    }
}
