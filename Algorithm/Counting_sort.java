package algorithm_study.Algorithm;

public class Counting_sort{
        public static void main(String[] args) {

            int[] array = new int[100];       // 수열의 원소 : 100개
            int[] counting = new int[31];    // 수의 범위 : 0 ~ 30
            int[] result = new int[100];    // 정렬 될 배열

            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 31);    // 0 ~ 30
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
        }
}
