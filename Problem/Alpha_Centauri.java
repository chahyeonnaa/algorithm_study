package algorithm_study.Problem;

import java.util.Scanner;
// 거리 차 구하기_ 어떤 거리 루트로 갈 수 있는지 규칙찾기
// 규칙 : 시작은 무조건 1이고, 그 후로 이동거리가 다양해짐 -> 도착직전 이동거리는 항상 1이어야하므로, 그 전 이동거리에
// 1이 포함되어있어야 가능. -> 시작지점~...1 끝지점 이런 형식
// 거리의 제곱근 값이 최대 이동거리이고, 장치 가동 횟수는 (max*2-1 ~ max*2+1)
// max= 거리의 제곱근!
public class Alpha_Centauri {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();

        for(int i=0;i<N;i++)
        {
            int A=sc.nextInt();
            int B=sc.nextInt();

            int distance=B-A;
            int max = (int)Math.sqrt(distance);

            if(distance==(max*max))
            {
                System.out.println((max*2)-1);
            }
            else if(distance>(max*max)+max)
            {
                System.out.println((max*2)+1);
            }
            else
                System.out.println(max*2);
        }
    }
}
