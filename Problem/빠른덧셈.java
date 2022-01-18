package Problem;

import java.io.*;
import java.util.StringTokenizer;
// Scanner는 느리다
// sout도 느리다
// 이제는 스캐너 안쓰는 연습하긔
public class 빠른덧셈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter tr= new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i=0;i<A;i++)
        {
            st = new StringTokenizer(br.readLine());
            int X=Integer.parseInt(st.nextToken());
            int Y=Integer.parseInt(st.nextToken());
            tr.write(X+Y+"\n"); // 개행 문자 붙이면 자동으로 String으로 바뀜

        }
        tr.flush();;
        tr.close();
        br.close();
    }
}
