package algorithm_study.Problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 헐.. Math.sqrt() 쓰면 안된다........ 0.1+0.2==0.3 은 거짓임.
// 좌표를 비교할 때 우리는 == 연산자를 써야하는데 double 형(또는 float형) 의 경우는 약간의 오차가 발생할 수 있음
// 모든 경우의 수를 고려해야함_ 같은 값이 나온다고해서 고려해주지 않으면 X
// 나는 2-2랑 3-1을 고려하지 못했다.......


public class 터렛 {
    public static void main(String[] args) throws IOException {
        BufferedReader sc= new BufferedReader(new InputStreamReader(System.in));

        int T=Integer.parseInt(sc.readLine());

        for(int i=0;i<T;i++)
        {
            StringTokenizer in= new StringTokenizer(sc.readLine());
            int x1=Integer.parseInt(in.nextToken());
            int y1=Integer.parseInt(in.nextToken());
            int r1=Integer.parseInt(in.nextToken());


            int x2=Integer.parseInt(in.nextToken());
            int y2=Integer.parseInt(in.nextToken());
            int r2=Integer.parseInt(in.nextToken());

            int distance_pow = (int)(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

            // case 1 : 중점이 같으면서 반지름도 같을 경우
            if(x1 == x2 && y1 == y2 && r1 == r2) {
                System.out.println(-1);
            }

            // case 2-1 : 두 원의 반지름 합보다 중점간 거리가 더 길 때
            else if(distance_pow > Math.pow(r1 + r2, 2)) {
                System.out.println(0);
            }

            // case 2-2 : 원 안에 원이 있으나 내접하지 않을 때
            else if(distance_pow < Math.pow(r2 - r1, 2)) {
                System.out.println(0);
            }

            // case 3-1 : 내접할 때
            else if(distance_pow == Math.pow(r2 - r1, 2)) {
                System.out.println(1);
            }


            // case 3-2 : 외접할 때
            else if(distance_pow == Math.pow(r1 + r2, 2)) {
                System.out.println(1);
            }

            else {
                System.out.println(2);
            }
        }
    }
}
