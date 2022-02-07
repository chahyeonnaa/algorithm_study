package algorithm_study.Problem;

import java.util.ArrayList;
import java.util.Arrays;

public class 두개뽑아서더하기 {
    public int[] solution(int[] numbers) {
        int[] answer={};
        ArrayList<Integer>arr=new ArrayList<Integer>();

        for(int i=0;i<numbers.length;i++)
        {
            for(int j=i+1;j<numbers.length;j++)
            {
                int count=0;
                int result=numbers[i]+numbers[j];
                if(!arr.contains(result))
                    arr.add(result);
/*                for(int k=0;k<arr.size();k++)
                {
                    if(arr.get(k)==result)
                        count++;
                }
                if(count==0)
                {
                    arr.add(result);
                }*/

            }
            answer=new int[arr.size()];
            for(int a=0;a<arr.size();a++)
            {
                answer[a]=arr.get(a);
            }

        }

        Arrays.sort(answer);
        return answer;
    }
}
