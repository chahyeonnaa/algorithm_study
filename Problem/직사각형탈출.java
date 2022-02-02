package algorithm_study.Problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 직사각형탈출 {
    public static void main(String[] args) throws IOException {
        BufferedReader sc= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer in= new StringTokenizer(sc.readLine());

        int X=Integer.parseInt(in.nextToken());
        int Y=Integer.parseInt(in.nextToken());
        int W=Integer.parseInt(in.nextToken());
        int H=Integer.parseInt(in.nextToken());

        int one=W-X;
        int two=H-Y;

        int result=Math.min(one,two);
        int result2=Math.min(X,Y);
        int last_result=Math.min(result,result2);

        System.out.println(last_result);

    }
}
