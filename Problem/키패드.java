package Problem;

import java.util.Scanner;
// 백준이랑 프로그래머스 형태가 달라서 어렵당.
// 프그는 적응이 안돼ㅐㅐㅐㅐㅐㅐㅐㅐ
public class 키패드 {
    public static String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        int leftIndex = 10;	 // 왼손 시작점 '*' - 10으로 치환
        int rightIndex = 12; // 오른손 시작점 '#' - 12로 치환

        for(int number : numbers) { // 배열 전체 돌기
            if(number == 1 || number == 4 || number == 7) { // 왼손번호는 무조건 왼손
                sb.append("L");
                leftIndex = number; // 손 위치 변경
            } else if(number == 3 || number == 6 || number == 9) {	// 오른손 번호는 무조건 오른손
                sb.append("R");
                rightIndex = number; // 손 위치 변경
            } else { // 중앙번호일때
                int leftLength = getLength(leftIndex, number); // 입력하고자 하는 번호와 중앙 키패드의 길이차
                int rightLength = getLength(rightIndex, number);

                if(leftLength > rightLength) { // 오른손이 더 가깝다
                    sb.append("R");
                    rightIndex = number; // 위치 바꾸기
                } else if(leftLength < rightLength) { // 왼손이 더 가깝다
                    sb.append("L");
                    leftIndex = number;
                } else {
                    if(hand.equals("right")) { // 거리가 같으면, 오른손잡이면 오른손이 가는것
                        sb.append("R");
                        rightIndex = number;
                    } else {
                        sb.append("L");
                        leftIndex = number;
                    }
                }
            }
        }
        return sb.toString();
    }

    public static int getLength(int index, int number) {

        // 숫자 0의 경우 11로 치환
        index = (index == 0) ? 11 : index;
        number = (number == 0) ? 11 : number;

        // 키패드 좌표를 쉽고 간단하게 잡는게 포인트..ㅠ(일반적인 좌표로 생각하면 복잡함)
        int x = (index - 1) / 3; // 왼쪽, 오른쪽 좌표의 x 규칙
        int y = (index - 1) % 3; // y 규칙
        int numberX = number / 3; // 중앙번호의 규칙
        int numberY = 1;

        return Math.abs(x-numberX) + Math.abs(y-numberY);
    }
}
