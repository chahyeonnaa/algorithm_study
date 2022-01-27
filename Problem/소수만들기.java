package algorithm_study.Problem;

import java.util.ArrayList;

public class 소수만들기 {
    public static boolean prime[];
    public int solution(int[] nums) {

        int num=0;
        ArrayList<Integer>sc=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                for(int k=j+1;k<nums.length;k++)
                {
                    num=nums[i]+nums[j]+nums[k];
                    int count=0;
                    // 소수인지 판별
                    for(int z=1;z<=num;z++)
                    {
                        if(num%z==0)
                        {
                            count++;
                        }
                    }
                    if(count==2)
                        sc.add(num);
                }
            }
        }
        int answer = sc.size();

        return answer;
    }
}
