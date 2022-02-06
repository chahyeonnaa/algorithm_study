package algorithm_study.Problem;

import java.util.ArrayList;

public class 삼진법뒤집기 {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> three= new ArrayList<>();

        while(n>=3)
        {
            three.add(n%3);
            n = n/3;
        }
        three.add(n);

        System.out.print(three);

        for(int i=three.size()-1;i>=0;i--)
        {
            answer+= (Math.pow(3,i)*(three.get(three.size()-i-1)));
        }

        return answer;
    }
}
