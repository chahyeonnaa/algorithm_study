package algorithm_study.Problem;

import java.util.ArrayList;
import java.util.Collections;

public class 실패율 {
    public int[] solution(int N, int[] stages) {
        int answer[]=new int[N];
        double result[]=new double[N+2];
        boolean t_answer[]=new boolean[N+2];
        t_answer[N+1]=true;
        for(int i=0;i<stages.length;i++)
        {
            if(t_answer[stages[i]]==true)
                continue;
            int count1=0;
            int count2=0;

            for(int j=0;j<stages.length;j++)
            {
                if(stages[i]<=stages[j])
                    count1++;

                if(stages[i]==stages[j])
                    count2++;

            }
            t_answer[stages[i]]=true;
            result[stages[i]]=(double)count2/(double)count1;
        }

        // 최댓값 찾아서 그때의 인덱스를 answer배열에 넣어주기

        // 최대값, 최대값의 인덱스 구하기
        for(int j=0;j<N;j++)
        {
            int maxIndex = 0;
            double max = -1;
            for (int i = 1; i < result.length; i++)
            {
                if (result[i] > max) {
                    max = result[i];
                    maxIndex = i;
                }
            }
            result[maxIndex]=-3;
            answer[j]=maxIndex;
        }

        return answer;
    }
}
