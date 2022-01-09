package Problem;

import java.util.Arrays;

public class 완주하지못한선수 {
    public String solution(String[] participant, String[] completion)
    {
        Arrays.sort(participant);
        Arrays.sort(completion);

        int i = 0;
        for(i=0;i<completion.length;i++)
            if(!participant[i].equals(completion[i]))
                break;

        return participant[i];
    }
    public static void main(String[] args) {
        String[] part = {"leo", "kiki", "eden"};
        String[] comp = {"eden", "kiki"};
        완주하지못한선수 sol = new 완주하지못한선수();
        System.out.println(sol.solution(part, comp));

    }
}
