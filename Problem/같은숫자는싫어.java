package algorithm_study.Problem;

public class 같은숫자는싫어 {
    public int[] solution(int []arr) {
        int count=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==arr[i+1])
                arr[i]=-1;

            if(arr[i]!=-1)
            {
                count++;
            }
        }

        int[] answer =new int[count+1];
        int k=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=-1)
            {
                answer[k]=arr[i];
                k++;
            }

        }

        return answer;
    }
}
