package algorithm_study.Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 기본 지식 : 가장 큰 원판을 C 로 옮기기 위해서는 n-1 개의 원판이 A 에서 B 로 가야한다. 작대기 이동을 Hanoi함수로 표현 -> Hanoi(n-1)
//         : 그리고 A 에 있는 가장 큰 원판이 C 로 이동할 것이다. (가장 큰 원판만 이동 -> 이동 횟수는 1회)
//         : B 에 있는 (n-1)개의 원판을 C 로 이동한다. (Hanoi(n-1))
// 결론 : n 개의 원판을 이동시키기 위해 Hanoi(n-1) 횟수만큼 이동한 횟수가 2번, 가장 아래 원판은 1번 이동
public class 하노이탑_재귀 {
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // 원판 이동 횟수 : 하노이탑 이동 횟수 귀납적 공식
        sb.append((int) (Math.pow(2, N) - 1)).append('\n');

        // 첫 함수 호출 : N개의 원판이 1번에서 중간지점 2를 거쳐, 3까지 최종 이동
        Hanoi(N, 1, 2, 3);
        System.out.println(sb);
    }

    /*
		N : 원판의 개수
		start : 출발지
		mid : 옮기기 위해 이동해야 장소
		to : 목적지
	 */

    // N=3이라 가정한 예시
    // 첫 호출 : Hanoi(3, 1, 2, 3) -> Hanoi(2, 1, 3, 2) -> Hanoi(1, 1, 2, 3) -> (1,3) 출력
    //                                                    - 여기서 (1,2)출력 -> Hanoi(1, 3, 1, 2) -> (3,2) -> (1,3) 출력
    // Hanoi(2, 2, 1, 3) -> Hanoi(1, 2, 3, 1) -> (2,1) -> (2, 3) 출력 -> Hanoi(1, 1, 2, 3) -> (1,3)출력


    public static void Hanoi(int N, int start, int mid, int to) {

        if (N == 1) {
            sb.append(start + " " + to + "\n");
            return;
        }

        // A -> C로 옮긴다고 가정할 떄,
        // STEP 1 : N-1개를 A에서 B로 이동 (= start 지점의 N-1개의 원판을 mid 지점으로 옮긴다.)
        Hanoi(N - 1, start, to, mid);

        // STEP 2 : 1개를 A에서 C로 이동 (= start 지점의 N번째 원판을 to지점으로 옮긴다.)
        sb.append(start + " " + to + "\n");

        // STEP 3 : N-1개를 B에서 C로 이동 (= mid 지점의 N-1개의 원판을 to 지점으로 옮긴다.)
        Hanoi(N - 1, mid, start, to);
    }
}
