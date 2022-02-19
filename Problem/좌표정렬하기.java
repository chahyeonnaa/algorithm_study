package algorithm_study.Problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

// 2차원 배열을 이용하여 풀이한다.
// StringTokenizer를 사용하여 X좌표와 Y좌표를 분리할 수 있다.
// 테스트 케이스 만큼 행을 만들고, 열의 개수는 2이다. (2차원 좌표이기 때문에)
// Comparator의 compare함수를 재정의(오버라이딩)하여, 2차원 배열로 Arrays.sort()가 작동하게 재정의 하였다.
// 두 좌표가 있다고 가정하고, 각 좌표의 x좌표 값을 비교하고(arr[i][0]와 arr[i+1][0]), x좌표값이 같다면 y값을 비교하면 된다(arr[i][1]와 arr[i+1][1]).
// Comparator는 근본적으로 객체 비교를 위해 만들어진 인터페이스(사용하려면 항상 compare함수를 오버라이딩 해야함)(해당 객체만의 규칙을 정해주어야한다)
public class 좌표정렬하기 {
    public static void main(String[] args) throws IOException, IOException {
        BufferedReader sc= new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(sc.readLine());
        int arr[][]=new int[N][2];

        for(int i=0;i<N;i++)
        {
            StringTokenizer in= new StringTokenizer(sc.readLine()," ");
            arr[i][0]=Integer.parseInt(in.nextToken());
            arr[i][1]=Integer.parseInt(in.nextToken());
        }

        // 익명객체 만들기 _ Comparator
        Comparator<int[]> comp = new Comparator<int[]>() {

            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0]==o2[0]) // x좌표가 같으면 y끼리 비교
                    return o1[1]-o2[1]; // 앞에있는게 뒤에있는거보다 작으면 자리를 바꾸지 않는다(오름차순) == 해당 값이 음수면 자리교체 안함
                else
                    return o1[0]-o2[0];
            }
        };

        Arrays.sort(arr,comp);

        // 이렇게도 가능
/*        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0]==o2[0])
                    return o1[1]-o2[1];
                else
                    return o1[0]-o2[0];
            }
        });*/

        // 람다식 쓰면 이렇게도 가능
/*        Arrays.sort(arr, (o1 , o2)-> {
            if(o1[0]==o2[0])
                return o1[1]-o2[1];
            else
                return o1[0]-o2[0];
        };*/

        StringBuilder sb= new StringBuilder();
        for(int i=0;i<N;i++)
        {
            sb.append(arr[i][0]+" "+arr[i][1]+"\n");
        }
        System.out.println(sb);
    }
}
