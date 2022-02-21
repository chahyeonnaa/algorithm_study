package algorithm_study.Problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class 나이순정렬 {
    public static void main(String[] args) throws IOException {
        // 1. 2차원 배열 사용
/*      BufferedReader sc= new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(sc.readLine());
        String arr[][]=new String[N][2];

        for(int i=0;i<N;i++)
        {
            StringTokenizer in= new StringTokenizer(sc.readLine()," ");
            arr[i][0]=in.nextToken();
            arr[i][1]=in.nextToken();
        }
        Comparator<String []>com=new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return (Integer.parseInt(o1[0])-Integer.parseInt(o2[0])); // 양수면 바뀌고, 음수나 0이면 안바꿈
            }
        };

        Arrays.sort(arr,com);
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<N;i++)
        {
            sb.append(arr[i][0]+" "+arr[i][1]+"\n");
        }
        System.out.println(sb);*/

        // 2. 클래스를 생성하여 풀이하는 방법
/*        BufferedReader sc= new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(sc.readLine());
        Person[] p = new Person[N];
        for(int i=0;i<N;i++)
        {
            StringTokenizer in= new StringTokenizer(sc.readLine()," ");
            int age=Integer.parseInt(in.nextToken());
            String name=in.nextToken();
            p[i]=new Person(age,name);
        }

        Comparator<Person>comp=new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.age-o2.age;
            }
        };

        Arrays.sort(p,comp);
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<N;i++)
        {
            sb.append(p[i]);
        }
        System.out.println(sb);*/


        // 3. StringBuilder 배열 사용_카운팅 정렬 개념 도입
/*        BufferedReader sc= new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(sc.readLine());

        StringBuilder arr[]=new StringBuilder[201];

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=new StringBuilder();
        }

        for(int i=0;i<N;i++)
        {
            StringTokenizer in=new StringTokenizer(sc.readLine());
            int age=Integer.parseInt(in.nextToken());
            String name=in.nextToken();

            arr[age].append(name).append(" ").append("\n");
        }

        StringBuilder sb = new StringBuilder();
        for(StringBuilder val : arr) {
            sb.append(val);
        }

        System.out.println(sb);

    }*/
    }
}
/*class Person
{
    int age;
    String name;

    public Person(int age,String name)
    {
        this.age=age;
        this.name=name;
    }

    public String toString(){
        return age+" "+name+"\n";
    }
}*/
