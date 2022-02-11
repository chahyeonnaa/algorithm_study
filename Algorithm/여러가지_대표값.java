package algorithm_study.Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 카운팅 정렬으로 평균, 중앙값, 최빈값, 범위를 구해보자.!
// 카운팅 정렬을 써야 가장 빠르고 효율적인 알고리즘이 완성됨
public class 여러가지_대표값 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // 입력값의 범위 : -4000 ~ 4000
        int [] arr= new int[8001];

        /*
         *  sum = 총 합계
         *  max = 최댓값
         *  min = 최솟값
         *  median = 중앙값
         *  mode = 최빈값
         */
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        // median 과 mode 는 -4000~4000 을 제외한 수로 초기화하면 된다.
        int median = 10000;
        int mode = 10000;

        for(int i = 0; i < N; i++) {
            int value = Integer.parseInt(br.readLine());
            sum += value;
            // 카운팅 정렬_빈도수 기록
            arr[value + 4000]++;

            if(max < value) {
                max = value;
            }
            if(min > value) {
                min = value;
            }
        }


        // 순회
        int count = 0;	// 중앙값 빈도 누적 수
        int mode_max = 0; 	// 최빈값의 최댓값

        // 이전의 동일한 최빈값이 1번만 등장했을경우 true, 아닐경우 false
        boolean flag = false;

        // 최솟값, 최댓값 사이로만 돌리면 됨
        for(int i = min + 4000; i <= max + 4000; i++) {

            // 한번이라도 나온적 있으면,
            if(arr[i] > 0) {

                /*
                 * <중앙값 찾기>
                 * 누적횟수가 전체 전체 길이의 절반에 못 미친다면
                 */
                // 숫자의 개수가 총 5개라면, 3번째에 있는 수가 중앙값
                // 0일때 기록, 1일때 기록, 2일때 기록 -> 최종 중앙값
                if(count < (N + 1) / 2) {
                    count += arr[i];	// i값의 빈도수를 count 에 누적(몇번째인지 기록)
                    median = i - 4000;
                }

                /*
                 * <최빈값 찾기>
                 * 이전 최빈값보다 현재 값의 빈도수가 더 높을 경우
                 */

                if(mode_max < arr[i]) {
                    mode_max = arr[i];
                    mode = i - 4000;
                    flag = true;	// 첫 등장이므로 true 로 변경
                }
                // 이전 최빈값 최댓값과 동일한 경우면서 한 번만 중복되는 경우
                // 첫 등장 이후임 _ 최빈값이 여러개일 경우 두번째로 작은 값을 출력해야하므로 flag를 반드시 false로 바꿔줘야함
                // 그래야 다음부터 else if문이 실행되지 않으면서, mode값이 바뀌지 않게 된다.
               else if(mode_max == arr[i] && flag == true) {
                    mode = i - 4000;
                    flag = false;
                }
            }
        }

        // 산술평균 출력의 경우 그냥 나누면 int 형 때문에 나눗셈 과정에서 무조건 소수점은 버려지기 때문에 반올림을 위해
        // Math.round를 쓰기 전에 이미 나눗셈에서 오차가 날 수 있다. 그러므로 sum 이나 N 둘 중 하나를 double 로
        // 캐스팅하여 소수점이 버려지는 것을 방지하고, 반올림을 한 다음 int형으로 다시 캐스팅해야한다.
        System.out.println((int)Math.round((double)sum / N));	// 산술평균
        System.out.println(median);	// 중앙값
        System.out.println(mode);	// 최빈값
        System.out.println(max - min);	// 범위
    }
}
