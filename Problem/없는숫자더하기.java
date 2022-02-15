package algorithm_study.Problem;

public class 없는숫자더하기 {
    public int solution(int[] numbers) {
        int answer = 45;
        int []arr=new int[] {0,1,2,3,4,5,6,7,8,9};
        for(int i=0;i<numbers.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(numbers[i]==arr[j])
                    answer=answer-j;
            }
        }
        return answer;
    }
}
