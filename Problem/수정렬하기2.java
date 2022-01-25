package Problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

// Arrays.sort 쓰면 시간초과남
// 1. Collections.sort 이용 -> Timsort!(어레이 리스트 사용)
// 2. 카운팅 정렬 응용하기
public class 수정렬하기2 {
    public static void main(String[] args) throws IOException {
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder st= new StringBuilder();

        // 2. 카운팅 정렬으로 정렬하기
        // 문제에서 절댓값이 1,000,000보다 작거나 같은 정수라고 명시
        // index는 0부터 2,000,000까지 -> 이것의 중간인덱스 : 1,000,000
        boolean arr[]=new boolean[2000001];

        int N=Integer.parseInt(sc.readLine());

        for(int i=0;i<N;i++)
        {
            // 입력된 정수를 인덱스로 하여 그칸만 true로 바꿔주기 -> 이게 카운팅정렬
            arr[Integer.parseInt(sc.readLine())+1000000]=true;
        }

        for(int i=0;i<arr.length;i++)
        {
            // 트루인것만 검사_ 배열 인덱스를 앞에서 부터 차례대로 돌기때문에 인덱스를 추가해주면 끝
            if(arr[i]==true)
            {
                st.append(i-1000000).append("\n");
            }
        }
        System.out.println(st);

        // 1. Collections.sort 이용
/*        int N=Integer.parseInt(sc.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            list.add(Integer.parseInt(sc.readLine()));
        }
        Collections.sort(list);
        for(int value : list) {
            st.append(value).append('\n');
        }
        System.out.println(st);*/



        // Arrays.sort 쓰면 시간초과남
  /*      BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(sc.readLine());
        int arr[]=new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=Integer.parseInt(sc.readLine());
        }
        Arrays.sort(arr);
        for(int j=0;j<N;j++) {
            System.out.println(arr[j]);
        }
    }*/
    }
}
