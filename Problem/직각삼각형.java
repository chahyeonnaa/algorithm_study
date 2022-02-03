package algorithm_study.Problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class 직각삼각형 {
    public static void main(String[] args) throws IOException {
        BufferedReader sv= new BufferedReader(new InputStreamReader(System.in));

        while(true)
        {
            StringTokenizer in= new StringTokenizer(sv.readLine());
            ArrayList<Integer>arr=new ArrayList<Integer>();

            int A=Integer.parseInt(in.nextToken());
            arr.add(A);
            int B=Integer.parseInt(in.nextToken());
            arr.add(B);
            int C=Integer.parseInt(in.nextToken());
            arr.add(C);

            // 오름차순 정렬
           Collections.sort(arr);
           if(arr.get(0)==0 && arr.get(1)==0 && arr.get(2)==0)
           {
               break;
           }

           if(Math.pow(arr.get(0),2) + Math.pow(arr.get(1),2) == Math.pow(arr.get(2),2))
               System.out.println("right");
           else
               System.out.println("wrong");


        }
    }
}
