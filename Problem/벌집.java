package Problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// 어떻게 하면 변수도 줄이고 더 간단하게 할 수 있을지?
// 같은 로직이긴한데, sum과 N을 비교하면 빨랐다.
// sum<=N 일때까지 반복문을 돌려서 그때마다 count값을 1씩 더해주는것..!
public class 벌집 {
    public static void main(String[] args) throws IOException {
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(sc.readLine());

        int i=1;
        int j=1;
        int count=0;
        int sum=0;

        while(true)
        {
            i++;
            count++;
            if(i==N)
            {
                while(sum<count)
                {
                    sum+=6*j;
                    j++;
                }
                break;
            }
        }
        if(N==1)
            System.out.println(1);
        else
            System.out.println(j);
    }
}
