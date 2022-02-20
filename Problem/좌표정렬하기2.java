package algorithm_study.Problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class 좌표정렬하기2 {
    public static void main(String[] args) throws IOException {
        BufferedReader sc= new BufferedReader(new InputStreamReader(System.in));

        int N= Integer.parseInt(sc.readLine());

        int arr[][]=new int[N][2];

        for(int i=0;i<N;i++)
        {
            StringTokenizer in= new StringTokenizer(sc.readLine());
            arr[i][0]=Integer.parseInt(in.nextToken());
            arr[i][1]=Integer.parseInt(in.nextToken());
        }

        Comparator<int[]>comp=new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1]==o2[1])
                    return o1[0]-o2[0];
                else
                    return o1[1]-o2[1];
            }
        };

        Arrays.sort(arr,comp);

        StringBuilder sb=new StringBuilder();
        for(int i=0;i<N;i++)
        {
            sb.append(arr[i][0]+" "+arr[i][1]+"\n");
        }

        System.out.println(sb);

    }
}
