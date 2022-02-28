package algorithm_study.Problem;

import java.util.*;

public class 문자열_마음대로_정렬 {
    public String[] solution(String[] strings, int n) {
        String answer[]=new String[strings.length];
        ArrayList<String>arr=new ArrayList<>();

        for(int i=0;i<strings.length;i++)
        {
            arr.add(strings[i].charAt(n)+strings[i]);
        }
        Collections.sort(arr);

        for(int i=0;i<strings.length;i++)
        {
            answer[i]=arr.get(i).substring(1,arr.get(i).length());
        }
        return answer;
    }
}
