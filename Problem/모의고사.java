package Problem;

// 놓친부분: 가장 높은 점수를 받은 사람 수 만큼 리턴배열을 만드는 것.
// 나는 3칸을 만들어놓고 시작해서 [1,0,0] 이런식으로 출력돼서 오답뜸
// 이렇게 하면, 배열을 그때그때 생성해줄 필요가 없음

public class 모의고사 {
    public int[] solution(int[] answers) {

        int[] answer;

        int[] a = new int[]{1,2,3,4,5};
        int[] b = new int[]{2,1,2,3,2,4,2,5};
        int[] c = new int[]{3,3,1,1,2,2,4,4,5,5};

        int[] score = new int[3];

        // score[]에 수포자별 맞힌 갯수
        for(int i=0; i<answers.length; i++){
            if(answers[i] == a[i%5])  score[0]++;
            if(answers[i] == b[i%8])  score[1]++;
            if(answers[i] == c[i%10]) score[2]++;
        }

        // 가장 높은 점수
        int max=0;
        for(int i=0;i<3;i++)
        {
            if(max<score[i])
                max=score[i];
        }

        // 가장 높은 점수를 받은 사람 수
        int maxCount=0;
        for(int i=0;i<3;i++)
        {
            if(max==score[i])
                maxCount++;
        }

        answer = new int[maxCount];
        int idx = 0;
        for(int i=0; i<3; i++){
            if(score[i] == max)
                // answer[i]로 해서 런타임 에러 발생_ answer배열을 maxCount 크기만큼 생성하기 때문에 인덱스를 i로 주면 안된다.
                answer[idx++] = i+1;
        }
        return answer;
    }
}
