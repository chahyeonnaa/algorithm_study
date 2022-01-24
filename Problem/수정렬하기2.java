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

        int N=Integer.parseInt(sc.readLine());
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < N; i++) {
            list.add(Integer.parseInt(sc.readLine()));
        }

        Collections.sort(list);

        for(int value : list) {
            st.append(value).append('\n');
        }
        System.out.println(st);



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
