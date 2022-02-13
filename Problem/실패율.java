package algorithm_study.Problem;

import java.util.ArrayList;
import java.util.Collections;

public class 실패율 {
    public int[] solution(int N, int[] stages) {
        int answer[]=new int[N];
        double result[]=new double[N+2];
        boolean t_answer[]=new boolean[N+2];

        for(int i=0;i<stages.length;i++)
        {
            if(t_answer[stages[i]]==false)
                continue;
            double count1=0;
            double count2=0;
            for(int j=0;j<stages.length;j++)
            {
                if(stages[i]>=stages[j])
                    count1++;

                if(stages[i]==stages[j])
                    count2++;
            }
            t_answer[stages[i]]=false;
            result[stages[i]]=count1/count2;
        }

        // 최댓값 찾아서 그때의 인덱스를 answer배열에 넣어주기

        return answer;
    }
}
