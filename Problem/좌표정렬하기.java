package algorithm_study.Problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 좌표정렬하기 {
    public static void main(String[] args) throws IOException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 테스트 케이스 입력
        int N = Integer.parseInt(br.readLine());

        // 2차원 좌표니까 2차원 배열 이용 -> 람다식을 이용하여 compare함수를 재정의 할 것임
        int[][] arr = new int[N][2];

        // 문자열 토큰 분리
        StringTokenizer st;
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            // x좌표
            arr[i][0] = Integer.parseInt(st.nextToken());
            // y좌표
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        // 람다식을 사용하여 compare함수를 재정의 한 것...!
        Arrays.sort(arr, (e1, e2) -> {
            if(e1[0] == e2[0]) {
                return e1[1] - e2[1];
            } else {
                return e1[0] - e2[0];
            }
        });

        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i< N ; i++) {
            sb.append(arr[i][0] + " " + arr[i][1]).append('\n');
        }
        // 최종 출력
        System.out.println(sb);
    }
}
