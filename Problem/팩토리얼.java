package Problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 팩토리얼 {
    public static void main(String[] args) throws IOException {

        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        int N= Integer.parseInt(sc.readLine());
        int result=facto(N);

        System.out.println(result);

    }
    public static int facto(int n)
    {
        if(n==1 || n==0)
            return 1;
        else
            return n*facto(n-1);
    }
}
