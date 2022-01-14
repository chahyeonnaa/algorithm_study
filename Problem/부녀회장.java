package Problem;

// 0층~ 14층(총 15개층), 1호~14호까지 있음(14개 호실)
import java.util.Scanner;
public class 부녀회장 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int arr[][]=new int[15][15];

        for(int j=0;j<15;j++)
        {
            arr[j][1]=1; // 각 층의 1호실은 1명
            arr[0][j]=j;
        }

        for(int u=1;u<15;u++) // 층
        {
            for (int a = 2; a < 15; a++) // 호실
            {
                arr[u][a]=arr[u][a-1]+arr[u-1][a];
            }
        }
        int T=sc.nextInt(); // 테스트 케이스
        for(int i=0;i<T;i++)
        {
            // 해당 입력 호수에는 몇명이 살고있을까
            int K = sc.nextInt(); // K층
            int N = sc.nextInt(); // N호

            System.out.println(arr[K][N]);
        }

    }

    }
