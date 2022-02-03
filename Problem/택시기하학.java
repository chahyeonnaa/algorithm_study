package algorithm_study.Problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 택시기하학 {
    public static void main(String[] args) throws IOException {
        BufferedReader sv= new BufferedReader(new InputStreamReader(System.in));

        int N=Integer.parseInt(sv.readLine());

        System.out.println(N*N*Math.PI);
        System.out.println(N*N*2);
    }
}
