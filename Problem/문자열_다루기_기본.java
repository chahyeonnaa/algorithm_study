package algorithm_study.Problem;

public class 문자열_다루기_기본 {
    public boolean solution(String s) {
        boolean answer = true;
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(48<=s.charAt(i) && s.charAt(i)<=57)
                count++;
        }

        if((s.length()==4 || s.length()==6) && count==s.length())
            answer=true;
        else
            answer=false;
        return answer;
    }
}
