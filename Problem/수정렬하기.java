package algorithm_study.Problem;

import java.util.Scanner;
// 선택정렬과 삽입정렬을 이용하여 정렬하기
public class 수정렬하기 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt(); // 숫자 개수
        int []arr=new int[N]; // 개수대로 배열 만들기

        for(int i=0;i<N;i++) // 입력받기
        {
            arr[i]=in.nextInt();
        }

        int temp=0;
        // 입력받았으면 정렬_ 선택정렬사용_ 오름차순 정렬
//        for(int i=0;i<N;i++)
//        {
//            for(int j=i+1;j<N;j++)
//            {
//                if(arr[i]>arr[j])
//                {
//                    temp = arr[j];
//                    arr[j]=arr[i];
//                    arr[i]=temp;
//                }
//            }
//        }


        // 삽입정렬_ 다 정렬하고 투입, 그 후 다시 정렬
        for(int i=1;i<N;i++)
        {
            int target=arr[i]; // 타겟넘버 지정
            int j=i-1; // 타겟넘버 바로앞을 j로 지정

            while(j>=0 && target<arr[j]) // 타겟넘버보다 큰 수가 앞쪽에 있으면 계속 반복
            {
                arr[j+1]=arr[j]; // 앞에 있는 큰 수를 뒤로 보내주기
                j--; // 앞쪽을 전부 탐색
            }

            arr[j+1]=target; // 마지막으로 타겟넘버를 정위치에 넣어줌

        }

        for(int k=0;k<N;k++)
        {
            System.out.println(arr[k]);
        }
    }
}
