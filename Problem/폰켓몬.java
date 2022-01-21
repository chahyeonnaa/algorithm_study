package Problem;
// 너무 원초적인 알고리즘
// C로도 구현할 수 있음 ㅋㅋㅋㅋ
// 다른 사람 풀이 보니까 해시맵, 어레이리스트 등등 다양하게 활용해서 코드가 매우 짧다ㅏㅏㅏ,,,
// 여러가지로 구현해보자
public class 폰켓몬 {
    public int solution(int[] nums) {

        int []arr=new int[200001];
        for(int i=0;i<nums.length;i++)
        {
            arr[nums[i]]++;
        }

        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
                count++;
        }
        int answer = 0;
        if((nums.length/2)<=count)
        {
            answer=nums.length/2;
        }
        else if((nums.length/2)>count)
        {
            answer=count;
        }
        return answer;
    }
}
