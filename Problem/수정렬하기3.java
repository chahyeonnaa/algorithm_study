package algorithm_study.Problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 수정렬하기3 {
    public static void main(String[] args) throws IOException {

        BufferedReader sc= new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(sc.readLine());
        int[] cnt = new int[10001];
        for (int i = 0; i < N; i++) {
            // 해당 인덱스의 값을 1 증가
            cnt[Integer.parseInt(sc.readLine())] ++;
        }

        StringBuilder sb = new StringBuilder();

        // 0은 입력범위에서 없으므로 1부터 시작
        for(int i = 1; i < 10001; i++){
            // i 값이 개수가 0 이 될 때 까지 출력 (빈도수를 의미)
            while(cnt[i] > 0){
                sb.append(i).append('\n');
                cnt[i]--;
            }
        }
        System.out.println(sb);


        // 카운팅 정렬_시간초과
   /*    int[] array = new int[N];       // 수열의 원소
        int[] counting = new int[10001];    // 수의 범위
        int[] result = new int[N+1];    // 정렬 될 배열

        for(int i=0;i<N;i++)
        {
            int M=Integer.parseInt(sc.readLine());
            array[i]=M;
        }

        // Counting Sort
        // 과정 1 _ 숫자 몇번나오는지 카운팅하기
        // 1이 3번이면, countig[1]=3;
        for (int i = 0; i < array.length; i++) {
            // array 의 value 값을 index 로 하는 counting 배열 값 1 증가
            counting[array[i]]++;
        }

        // 과정 2_ 카운팅 배열 완성한 뒤, 누적시키기
        // ex) counting[1]=counting[0]+counting[1];
        for (int i = 1; i < counting.length; i++) {
            // 누적 합 해주기
            counting[i] += counting[i - 1];
        }

        // 과정 3_ array배열 제일 끝 인덱스부터 탐색
        // array배열의 원소를 인덱스로 하는 counting배열을 1 감소시킨 뒤, 해당 카운팅 배열의 값을 인덱스로하여, 결과배열에 value값 저장
        for (int i = array.length - 1; i >= 0; i--) {

            int value = array[i];
            counting[value]--;
            result[counting[value]] = value;
        }

        for(int i=1;i<result.length-1;i++)
        {
            System.out.println(result[i]);
        }
*/
    }
}
