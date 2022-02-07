package algorithm_study.Problem;

// 14개중에 2개 실패, 2개 시간초과(71.4점)
// 입력받은 날짜까지 1월 1일부터 세는방식으로 접근 했는데 이러면 시간초과가 뜨는듯.. 어떤 방법이 있을가
// 입력 받은 월로 일수를 먼저 따지고, 월 안에서 해결봐야할듯_ 이러면 훨씬 빨라짐
// 실패 케이스 두개는 뭘까.....빠트린게 없는데
public class 이천십육년 {
    public String solution(int a, int b) {
        String []answer = new String[]{"0","FRI","SAT","SUN","MON","TUE","WED","THU"};

        // 1월 1일로 시작
        int M=1,Y=1;

        // 1/1(금)을 count=1로 설정, count=7은 목요일/ 7이 넘어가면 다시 초기화
        int count=0;

        // count 1로 시작
        while(true)
        {
            count++;
            // 다시 금요일로 초기화
            if(count==7)
            {
                count=0;
            }

            // 입력받은 숫자와 일치하면 종료
            if(M==a && Y==b)
            {
                break;
            }

            Y++;
            if((M==1||M==3||M==5||M==7||M==8||M==10||M==12) && Y==32)
            {
                // 32일은 없으니까 달 바꿔주고 일 초기화
                M++;
                Y=1;
            }


            else if((M==4||M==6||M==9||M==11) && Y==31)
            {
                M++;
                Y=1;
            }

            else if(M==2 && Y==30)
            {
                M++;
                Y=1;
            }
            // 요일 카운트, 일 카운트


        }
        return answer[count];

    }
}
