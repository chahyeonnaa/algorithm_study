package algorithm_study.Problem;

public class 음양더하기 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer =0;
        int count=0;
        for(int i=0;i<absolutes.length;i++)
        {
            if(signs[i]==false)
                count=absolutes[i]*(-1);
            else
                count=absolutes[i]*(1);

            answer+=count;

        }
        return answer;
    }
}
