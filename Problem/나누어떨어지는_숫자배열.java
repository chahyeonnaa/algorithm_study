package algorithm_study.Problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 나누어떨어지는_숫자배열 {
    public int[] solution(int[] arr, int divisor) {

        ArrayList<Integer>arrays=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%divisor==0)
            {
                arrays.add(arr[i]);
            }
        }
        if(arrays.size()==0)
            arrays.add(-1);

        Collections.sort(arrays);
        int[] answer = new int[arrays.size()];

        for(int i=0;i<arrays.size();i++)
        {
            answer[i]=arrays.get(i);
        }
        return answer;
    }
}
