ArrayList
============
* List 인터페이스를 상속받은 클래스로 크기가 가변적으로 변하는 선형리스트(일반적인 배열과 같은 순차리스트)  
* 한번 생성되면 크기가 변하지 않는 배열과는 달리 ArrayList는 객체들이 추가되면 자동으로 부족한 크기만큼 늘어난다.  


ArrayList 선언
---------------
```
ArrayList<Integer> luna1 = new ArrayList<Integer>();
ArrayList<Integer> luna2 = new ArrayList<>(); //new에서 타입 파라미터 생략가능
ArrayList<Integer> luna3 = new ArrayList<Integer>(10); // 크기 지정
ArrayList<Integer> luna4 = new ArrayList<Integer>(Arrays.asList(1,2,3)); // 생성될때 함께 값도 추가
```

ArrayList 값 추가 및 변경
-----------------------
```
ArrayList<Integer> list = new ArrayList<Integer>();
list.add(3); //값 추가
list.add(null); //null값도 add가능
list.add(2,27); //index 2에 27 삽입 - 뒷부분은 한칸씩 뒤로 밀려남
list.set(0,2) // 0번째 인덱스 값을 2로 바꾸기
```
중간에 데이터를 계속 추가하게 되면, 성능에 영향이 가므로 이럴때는 LinkedList 사용 권장

ArrayList 값 삭제
---------------
```
ArrayList<Integer> luna = new ArrayList<Integer>(Arrays.asList(1,2,3));
luna.remove(1);  //index 1 제거
luna.clear();  //모든 값 제거
```

ArrayList 크기
---------------
```
ArrayList<Integer> luna = new ArrayList<Integer>(Arrays.asList(1,2,3));
System.out.println(luna.size()); //list 크기 : 3
```

ArrayList 값 출력
---------------
```
ArrayList<Integer> luna = new ArrayList<Integer>(Arrays.asList(1,2,3));

System.out.println(luna.get(0));//0번째 index 출력
		
for(Integer i : luna) { //for문을 통한 전체출력
    System.out.println(i);
}
```

ArrayList 값 검색
---------------
```
ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3));
System.out.println(list.contains(2)); //list에 2가 있는지 검색 : true
System.out.println(list.indexOf(2)); //2가 있는 index반환 -> 없으면 -1 반환
```