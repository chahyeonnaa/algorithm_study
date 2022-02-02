package algorithm_study.Problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 네번째점 {
    public static void main(String[] args) throws IOException {
        BufferedReader sc= new BufferedReader(new InputStreamReader(System.in));
        int []x=new int[3];
        int []y=new int[3];
        int x_result=0;
        int y_result=0;

        for(int i=0;i<3;i++)
        {
            StringTokenizer in= new StringTokenizer(sc.readLine());
            x[i]=Integer.parseInt(in.nextToken());
            y[i]=Integer.parseInt(in.nextToken());
        }

        // 배열 카운팅
        if(x[0]!=x[1])
        {

            if(x[0]==x[2])
            {
                x_result=x[1];
            }
            else
                x_result=x[0];
        }
        else
            x_result=x[2];


        if(y[0]!=y[1])
        {

            if(y[0]==y[2])
            {
                y_result=y[1];
            }
            else
                y_result=y[0];
        }
        else
            y_result=y[2];

        System.out.println(x_result+" "+y_result);
    }
}
