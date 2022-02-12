package algorithm_study.Problem;

public class 부족한금액_계산하기 {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long sum=0;
        for(int i=1;i<=count;i++)
        {
            sum+=price*i;
        }

        if(sum>money)
            answer=sum-money;
        else if(sum<=money)
            answer=0;

        return answer;
    }
}
