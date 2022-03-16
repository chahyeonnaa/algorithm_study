package algorithm_study.Problem;

import java.util.ArrayList;

public class 신규_아이디_추천 {
    public String solution(String new_id) {
        String answer = "";
        ArrayList<Character> arr=new ArrayList<Character>();
        for(int i=0;i<new_id.length();i++)
        {
            // 소문자로 치환, 쓸데없는거 제거(1,2)
            if(new_id.charAt(i)=='-' || new_id.charAt(i)=='_'|| new_id.charAt(i)=='.')
            {
                arr.add(new_id.charAt(i));
            }
            else if('A'<=new_id.charAt(i) && new_id.charAt(i)<='Z')
            {
                arr.add(Character.toLowerCase(new_id.charAt(i)));
            }
            else if(97<=new_id.charAt(i) && new_id.charAt(i)<=122)
            {
                arr.add(new_id.charAt(i));
            }
            else if(48<=new_id.charAt(i) && new_id.charAt(i)<=57)
            {
                arr.add(new_id.charAt(i));
            }
        }

        // 5
        if(arr.size()==0)
            arr.add('a');

        // 6
        if(arr.size()>=16)
        {
            for(int i=15;i<arr.size();i++)
            {
                arr.remove(i);
            }

        }

        //4
        if(arr.get(0)=='.')
            arr.remove(0);
        //4
        if(arr.size()>=1)
        {
            if(arr.get(arr.size()-1)=='.')
                arr.remove(arr.size()-1);
        }

        if(arr.size()>0 && arr.size()<=2)
        {
            while(arr.size()<3)
            {
                arr.add(arr.get(arr.size()-1));
            }
        }

        answer=arr.toString();


        return answer;
    }
}
