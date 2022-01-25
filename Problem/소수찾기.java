package algorithm_study.Problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 소수찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader sc= new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(sc.readLine());

        StringTokenizer st = new StringTokenizer(sc.readLine()," ");
        int sosu=0;

        for(int i=0;i<N;i++)
        {
            int count=0;
            int M=Integer.parseInt(st.nextToken());
            for(int j=1;j<=M;j++)
            {
                if(M%j==0)
                    count++;
            }
            if(count==2)
                sosu++;
        }
        System.out.println(sosu);

    }
}
