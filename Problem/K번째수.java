package algorithm_study.Problem;

import java.util.ArrayList;
import java.util.Collections;

public class K번째수 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer=new int[commands.length];

        for(int i=0;i<commands.length;i++)
        {
            int []arrs=commands[i];
            ArrayList<Integer> list= new ArrayList<Integer>();
            for(int j=arrs[0]-1;j<=arrs[1]-1;j++)
            {
                list.add(array[j]);
            }

            Collections.sort(list);
            answer[i]=list.get(arrs[2]-1);
        }
        return answer;
    }
}
