package algorithm_study.Problem;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;
// 좌표압축 -> 순위 매기기
// 중복되지않는 값과 순위 매기기를 한번에 쳐낼 수 있는 Hashmap사용!
// 배열을 정렬시켜서 해쉬맵에 저장한다음, 오리지널 배열에 있는 값 순서대로 순위값을 읽어온다.
public class 좌표압축 {
    public static void main(String[] args) throws IOException {
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(sc.readLine());

        int original[]=new int[N];
        int sorted[]=new int[N];

        StringTokenizer in= new StringTokenizer(sc.readLine()," ");
        for(int i=0;i<N;i++)
        {
            sorted[i]=original[i]=Integer.parseInt(in.nextToken());
        }

        Arrays.sort(sorted);

        HashMap<Integer,Integer>crash=new HashMap<>();

        int rank=0;
        for(int i=0;i<sorted.length;i++)
        {
            if(!crash.containsKey(sorted[i]))
            {
                crash.put(sorted[i],rank); // 데이터값이 key, 순위가 value
                rank++;
            }
        }

        StringBuilder sb=new StringBuilder();
        for(int i=0;i<N;i++)
        {
            sb.append(crash.get(original[i])).append(" "); // 데이터값 입력 -> value값 얻어옴
        }

        System.out.println(sb);

        // 내가 푼 방법 -> 시간초과
    /*    BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(sc.readLine());
        StringBuilder sb=new StringBuilder();
        int arr[]=new int[N];
        StringTokenizer in=new StringTokenizer(sc.readLine());
        for(int i=0;i<N;i++)
        {
            arr[i]=Integer.parseInt(in.nextToken());
        }
        for(int i=0;i<N;i++)
        {
            int count=0;
            int num=0;
            for(int j=0;j<N;j++)
            {
                if(num==arr[j])
                    continue;
                if(arr[i]>arr[j])
                {
                    count++;
                    num=arr[j];
                }

            }
            sb.append(count).append(" ");
        }
        System.out.println(sb);*/
    }
}
