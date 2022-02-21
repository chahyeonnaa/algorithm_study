package algorithm_study.Problem;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 좌표압축 {
    public static void main(String[] args) throws IOException {
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(sc.readLine());
        StringBuilder sb=new StringBuilder();
        int arr[]=new int[N];
        StringTokenizer in=new StringTokenizer(sc.readLine());
        for(int i=0;i<N;i++)
        {
            arr[i]=Integer.parseInt(in.nextToken());
        }
        for(int i=0;i<N;i++)
        {
            int count=0;
            int num=0;
            for(int j=0;j<N;j++)
            {
                if(num==arr[j])
                    continue;
                if(arr[i]>arr[j])
                {
                    count++;
                    num=arr[j];
                }

            }
            sb.append(count).append(" ");
        }
        System.out.println(sb);
    }
}
