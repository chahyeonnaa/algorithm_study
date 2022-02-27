package algorithm_study.Problem;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 문자열_마음대로_정렬 {
    public static boolean[] count =new boolean[52];
    public String[] solution(String[] strings, int n) {
        String []answer=new String[strings.length];

        HashMap<Integer,Character>comp=new HashMap<>();

        char name[]=new char[strings.length];
        for(int i=0;i<strings.length;i++)
        {
            char pop=strings[i].charAt(n);
            comp.put(i,pop);
            // 여기서 같은거 있으면, 둘이 비교해서 바꿔치기
            name[i]=pop;
            //if(name[i].equals(name[i+1]))
            //strings[i]와 strings[i+1]을 비교해서 작은걸 앞으로 넣어주기
        }

        Arrays.sort(name);

        for(int i=0;i<name.length;i++)
        {
            int a=getKey(comp,name[i]);
            answer[i]=strings[a];
        }

        return answer;
    }

    public static <K, V> K getKey(Map<K, V> map, V value) {
        // 찾을 hashmap 과 주어진 단서 value

        for (K key : map.keySet()) {
            if (value.equals(map.get(key))) {

                if(count[(int) key]==false)
                {
                    count[(int) key]=true;
                    return key;
                }
                else
                    continue;
            }
        }
        return null;
    }
}
