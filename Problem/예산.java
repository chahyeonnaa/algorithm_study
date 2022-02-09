package algorithm_study.Problem;

import java.util.Arrays;
// 처음부터 케이스를 잘 나누는게 중요. 안그러면 엄청 꼬인다
// 문제에서 주어진 테스트 케이스에만 집중하는 것은 XX_한정적인 케이스에만 몰두하는 것 고치기
// 천천히 문제에 대해 생각하고, 코드로 넘어오기 !!!!!!!_급하게 푸려고 하면 더 오래걸린다는 것을 명심...
public class 예산 {
    public int solution(int[] d, int budget) {
        int answer=0;
        Arrays.sort(d);
        int result=budget;
        for(int i=0;i<d.length;i++)
        {
            result=result-d[i];
            if(result<0)
            {
                answer=i;
                break;
            }
        }
        if(result>=0)
        {
            answer=d.length;
        }
        return answer;
    }
}
