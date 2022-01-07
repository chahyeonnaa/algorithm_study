package Problem;
// 브루트포스 문제 : 어떤 값을 찾아내기위해 무차별적으로 대입해보는 방법
// 빠짐없이 완전탐색알고리즘을 짜야함
// 반복문 돌리면서 모든 경우의 수 탐색
import java.util.Scanner;

public class 블랙잭 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // 카드개수
        int M = in.nextInt(); // 딜러가 외치는 최대 총합

        int[] arr = new int[N]; // 카드숫자배열

        for (int i = 0; i < N; i++) { // 배열에 입력
            arr[i] = in.nextInt();
        }

        int result = search(arr, N, M);
        System.out.println(result);
    }

    static int search(int[] arr, int N, int M)
    {
        int result = 0;
        for (int i = 0; i < N - 2; i++)
        {
            for (int j = i + 1; j < N - 1; j++)
            {
                for (int k = j + 1; k < N; k++)
                {
                    int temp = arr[i] + arr[j] + arr[k];

                    if (M == temp) // M과 일치하면 리턴하고 종료
                        return temp;

                    if (temp < M && result < temp) { // M보다 작고, 이전 결과값보다 크면 값 바꾸기
                        result = temp;
                    }
                }
            }
        }
        return result;
    }
}
