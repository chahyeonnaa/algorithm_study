package Problem;

import java.util.Scanner;

public class 신입사원 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int T=sc.nextInt();

        for(int i=0;i<T;i++)
        {
            int N=sc.nextInt();
            int arr[]=new int[N+1]; // 인덱스 1부터 들어갈거라서
            for(int k=0;k<N;k++)
            {
                int x=sc.nextInt();
                int y=sc.nextInt();
                arr[x]=y;
            }

            int cnt=1;
            int stand=arr[1];

            for(int j=2;j<=N;j++)
            {
                if(stand>arr[j])
                {
                    cnt++;
                    stand=arr[j];
                }
            }
            System.out.println(cnt);
        }
    }
}
