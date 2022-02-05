package algorithm_study.Problem;

// N=9일때를 예로 설명_arr[9][9]로 모양 만들기
// 처음호출은(0,0,9,false)로 시작 -> size=3, (i=0;i<0+9;i+=3) (j=0;j<0+9;j+=3)가 큰틀로 잡힙 -> 총 반복 횟수 9번
// i=3, j=3일때 count=5이고, arr[3][3]~[5][5]까지 총 9칸이 가운데 빈칸으로 들어감.
// 나머지는 각 단계의 재귀를 통해 N=3일때의 작은 삼각형을 그림.
import java.util.Scanner;

public class 별찍기 {
    static char[][] arr;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        arr = new char[N][N];

        star(0, 0, N, false);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(arr[i][j]);
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }

    static void star(int x, int y, int N, boolean blank) {

        // 공백칸일 경우
        if (blank) {
            for (int i = x; i < x + N; i++) {
                for (int j = y; j < y + N; j++) {
                    arr[i][j] = ' ';
                }
            }
            return;
        }

        // 더이상 쪼갤 수 없는 블록일 때
        if (N == 1) {
            arr[x][y] = '*';
            return;
        }

        int size = N / 3;
        int count = 0;
        for (int i = x; i < x + N; i += size) {
            for (int j = y; j < y + N; j += size) {
                count++;
                if (count == 5) { // 공백 칸일 경우
                    star(i, j, size, true);
                } else {
                    star(i, j, size, false);
                }
            }
        }
    }

}
