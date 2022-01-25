package algorithm_study.Problem;

import java.util.Scanner;
// 1호라인부터 차례대로 배정
public class ACM호텔 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int T = in.nextInt();	// 테스트 케이스

        for(int i = 0; i < T; i++) {

            int H = in.nextInt();
            int W = in.nextInt();
            int N = in.nextInt();

            if(N % H == 0) { // 층수 그대로 반영, 거리에 1 안더함
                System.out.println((H * 100) + (N / H));

            } else {
                System.out.println(((N % H) * 100) + ((N / H) + 1));
            }
        }
    }
}
