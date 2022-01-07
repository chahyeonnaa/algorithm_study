package Problem;
import java.util.Scanner;
// 모든 경우의수를 나열한 다음, 그 속에서 규칙을 찾아야함.
// 모든 경우의수를 일단 나열해보는 것부터 시작!
public class 설탕배달 {
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);

        int N=n.nextInt();

        if(N==4 || N==7)
            System.out.println(-1);
        else if(N%5==0)
            System.out.println(N/5);
        else if(N%5==1 || N%5==3)
            System.out.println((N/5)+1);
        else if(N%5==2 || N%5==4)
            System.out.println((N/5)+2);
    }
}
