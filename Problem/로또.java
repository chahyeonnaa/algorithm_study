package Problem;

import java.util.Arrays;
// 코드를 간단하게 짜는 연습..! 문제풀때 간단한 코드 구성 신경쓰길...
public class 로또 {
    public int[] solution(int[] lottos, int[] win_nums) {

        Arrays.sort(lottos);
        Arrays.sort(win_nums);
        int[] answer = new int[2];
        int low = 0;
        int minwoo = 0;

        // 나는 for문을 두개로 나눴는데 하나로 해도 도ㅑㅑ....
/*        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0)
                minwoo++;
        }
        for (int j = 0; j < lottos.length; j++) {
            for (int k = 0; k < win_nums.length; k++) {
                if (lottos[j] == win_nums[k])
                    low++;
            }
        }*/

        for(int i : lottos)
        {
            if(i==0) {
                low++;
                continue; // 0이면 비교할 필요 없으니깐
            }
            for(int j : win_nums)
            {
                if(i==j) {
                    minwoo++;
                }
            }
        }
        // 나는 스위치문 안쓰고, if문으로 최저순위 최고순위 따로했는데 스위치문 쓰면 두개로 나누지 않아도 돼서 간편.
/*        if(low<=1)
        {
            answer[1]=6;
        }
        else if(low==2)
        {
            answer[1]=5;
        }
        else if(low==3)
        {
            answer[1]=4;
        }
        else if(low==4)
        {
            answer[1]=3;
        }
        else if(low==5)
        {
            answer[1]=2;
        }
        else if(low==6)
        {
            answer[1]=1;
        }*/


/*        if(low+minwoo<=1)
        {
            answer[0]=6;
        }
        else if(low+minwoo==2)
        {
            answer[0]=5;
        }
        else if(low+minwoo==3)
        {
            answer[0]=4;
        }
        else if(low+minwoo==4)
        {
            answer[0]=3;
        }
        else if(low+minwoo==5)
        {
            answer[0]=2;
        }
        else if(low+minwoo==6)
        {
            answer[0]=1;
        }
        return answer;
    }*/

        answer[0]= Grade(low+minwoo);
        answer[1]=Grade(minwoo);

        return answer;
    }
    public int Grade(int N)
    {
        switch(N)
        {
            case 6 :
                return 1;
            case 5 :
                return 2;
            case 4 :
                return 3;
            case 3 :
                return 4;
            case 2 :
                return 5;
            default :
                return 6;
        }
    }

}
