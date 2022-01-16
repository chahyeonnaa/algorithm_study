package Problem;
import java.util.ArrayList;
// ************* Map공부해서 다시 도전
public class 신고결과 {
    class Solution {
        public int[] solution(String[] id_list, String[] report, int k)
        {
            int m=2*(report.length);
            String []name=new String[m];
            int[] answer=new int[id_list.length];
            int[] singo=new int[id_list.length];

            for(int i=0;i<report.length;i++)
            {
                name =report[i].split(" ");
            }

            for(int a=0;a<id_list.length;a++)
            {
                for(int j=1;j<m;j=j+2) // 여기서 바운드에러
                {
                    if(name[j].equals(id_list[a]))
                    {
                        singo[a]++;
                        if(singo[a]>=k)
                        {
                            // 이렇게 하면 안돼ㅐㅐㅠㅠㅠ 아예 잘못됨
                            int index=id_list[a].indexOf(name[j-1]);
                            answer[index]++;
                        }
                        break;
                    }
                }
            }
            return answer;
        }
    }
}
