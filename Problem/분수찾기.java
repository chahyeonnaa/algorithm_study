package Problem;

import javax.accessibility.AccessibleRelation;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// 대각선 원소 개수 짝: 분모부터 큰 수
//               홀 : 분자부터 큰 수
// 큰 수 세팅법 : 현재원소의 수 -(N-이전대각선 원소 수-1)
// 대각선마다 정해진 최댓값을 반복문을 돌려서 찾아내려고 해서 힘들었다
// 나머지 : N-직전 대각선의 원소개수
// 몇번째 원소인지, 그 이전줄에서는 몇번째까지 왔는지 둘 사이의 관계파악이 중요했던 문제
public class 분수찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(sc.readLine());

        int cross_num=0;
        int prev=0;

        while(true)
        {
            if(cross_num+prev>=N)
            {
                if(cross_num%2==1) // 대각선 원소의 수가 홀수이면, 분자부터 큰 수
                {
                    System.out.println((cross_num-(N-prev-1))+"/"+(N-prev));
                    break;
                }
                else {
                    System.out.println((N - prev) + "/" + (cross_num - (N - prev - 1)));
                    break;
                }
            }
            else
            {
                prev+= cross_num;
                cross_num++;
            }
        }
    }
}
