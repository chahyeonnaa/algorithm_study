package algorithm_study.Problem;

public class 비밀지도 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        int []cnt=new int[n];
        String answer[]=new String[n];

        for(int i=0;i<n;i++)
        {
            cnt[i]= (int) Math.pow(2,n-(i+1));
            //System.out.println(cnt[i]);
        }

        for(int i=0;i<n;i++)
        {
            int sum1=0;
            int sum2=0;
            boolean dada[]=new boolean[n];
            boolean dada2[]=new boolean[n];
            for(int j=0;j<n;j++)
            {
                if(arr1[i]<cnt[j])
                    continue;

                sum1+=cnt[j];
                dada[j]=true;
                if(sum1==arr1[i])
                {
                    break;
                }
                else if(sum1>arr1[i])
                {
                    sum1-=cnt[j];
                    dada[j]=false;
                }
            }
            for(int k=0;k<n;k++)
            {
                if(arr2[i]<cnt[k])
                    continue;
                sum2+=cnt[k];
                dada2[k]=true;
                if(sum2==arr2[i])
                    break;
                else if(sum2>arr2[i])
                {
                    sum2-=cnt[k];
                    dada2[k]=false;
                }
            }
            StringBuilder sb=new StringBuilder();
            for(int h=0;h<n;h++)
            {
                if(dada[h]==true || dada2[h]==true)
                    sb.append("#");
                else
                    sb.append(" ");
            }

            answer[i]=sb.toString();
        } // for문
        return answer;
    }
}
