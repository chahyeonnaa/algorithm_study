package Problem;

import java.util.Scanner;
// StringBuilder 써서 체스판 입력받기(행단위)
// Math.min 최솟값 찾는 메서드
public class 체스판 {
    static char arr[][]; // 사용자에게 보드를 입력받음
    static char trans[][]; // 8*8 체스판
    static char white[][]={ // 맨왼쪽 위칸이 흰색일때 규칙
            {'W','B','W','B','W','B','W','B'},
            {'B','W','B','W','B','W','B','W'},
            {'W','B','W','B','W','B','W','B'},
            {'B','W','B','W','B','W','B','W'},
            {'W','B','W','B','W','B','W','B'},
            {'B','W','B','W','B','W','B','W'},
            {'W','B','W','B','W','B','W','B'},
            {'B','W','B','W','B','W','B','W'}
    };
    static char black[][]={ // 맨 왼쪽 위칸이 검은색일때 규칙
            {'B','W','B','W','B','W','B','W'},
            {'W','B','W','B','W','B','W','B'},
            {'B','W','B','W','B','W','B','W'},
            {'W','B','W','B','W','B','W','B'},
            {'B','W','B','W','B','W','B','W'},
            {'W','B','W','B','W','B','W','B'},
            {'B','W','B','W','B','W','B','W'},
            {'W','B','W','B','W','B','W','B'}
    };
    public static int trans(int a, int b,int min)
    {
        int white_num=0;
        int black_num=0;
        int k=0;
        StringBuilder builder = new StringBuilder("");

        for(int i =a;i<a+8;i++) { // 시작점을 전달받아 그걸 기준으로 8칸 가져오기
            builder.setLength(0); //StringBuilder 초기화_공백으로 만들기

            for(int j=b;j<b+8;j++) { // 맨왼쪽 좌표의 y값
                builder.append(arr[i][j]); // 사용자에게 입력받은 보드에서 가져오기_ 행 한줄이 저장되어있음
            }
            for(int j=0;j<builder.length();j++) {
                trans[k][j] = builder.charAt(j); //행 단위로 저장
            }
            k++; // 행 증가
        }
        for(int i=0;i<trans.length;i++) { // 체스판을 탐색
            for(int j=0;j<trans[i].length;j++) {
                if(trans[i][j]!=black[i][j]) { // 기준과 같지 않으면
                    black_num++; // 다시 칠해야하는 횟수증가
                }
                if(trans[i][j]!=white[i][j]) {
                    white_num++;
                }
            }

        }
        return Math.min(Math.min(white_num, black_num), min);
        // black과 white의 변환횟수 중 최솟값_min은 이전 체스판에서 발생한 최솟값
    }
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        int N=in.nextInt(); // 행
        int M=in.nextInt(); // 열

        arr=new char[N][M];
        trans=new char[8][8];

        // 배열 입력받기
        for(int i=0;i<N;i++) { // 행 단위로 입력
            String row = in.next();

            for(int j=0;j<M;j++) {
                arr[i][j] = row.charAt(j);
            }
        }
        int min=1000000000;
        // 8*8 체스판 떼어내기 작업_ 맨왼쪽 위칸이 될 수 있는 좌표들만 생각
        // (0,0) ~ (N-8,M-8)까지만 가능
        for(int i=0;i<=N-8;i++)
            for(int j=0;j<=M-8;j++)
                min=trans(i,j,min);

        System.out.println(min);//output
    }

}
