package algorithm_study.Problem;

public class 두정수_사이의합 {
    public long solution(int a, int b) {
        long answer = 0;
        if(a==b)
            answer=a;
        else
        {
            if(a>=b)
            {
                int temp=a;
                a=b;
                b=temp;
            }

            for(int i=a;i<=b;i++)
            {
                answer+=i;
            }
        }

        return answer;
    }
}
