HashMap
=========
* 해싱(Hashing)된 맵(Map)  
* 키(Key)와 값(Value) 두 쌍으로 데이터를 보관하는 자료구조(값은 중복허용, 키는 유일해야함)  
  - 이름 그대로 열쇠! 열쇠로 짝인 값(Value)를 찾아야하기 때문에 열쇠는 유일해야함.  
* 순서는 상관없다.  


HashMap 선언
------------
```
HashMap<String,String> map1 = new HashMap<String,String>(); //HashMap생성
HashMap<String,String> map2 = new HashMap<>(); //new에서 타입 파라미터 생략가능
HashMap<String,String> map3 = new HashMap<>(10); //크기 지정
```

HashMap 값 추가
---------------
```
HashMap<Integer,String> map = new HashMap<>();
map.put(1,"책"); // key-value 값 추가
map.put(2,"연필");
map.put(3,"샤프");
```

HashMap 값 삭제 및 크기 구하기
----------------------------
```
map.remove(1); // key값으로 요소 삭제
map.clear(); // 모든 값 제거
map.size(); // 크기 구하기
```

HashMap 값 출력
---------------
```
System.out.println(map); // 전체 출력
System.out.println(map.get(1));//key값 1의 value얻기
		
//entrySet() 활용
for (Entry<Integer, String> entry : map.entrySet()) 
{
    System.out.println("[Key]:" + entry.getKey() + " [Value]:" + entry.getValue());
}
//[Key]:1 [Value]:사과
//[Key]:2 [Value]:바나나
//[Key]:3 [Value]:포도

//KeySet() 활용
for(Integer i : map.keySet())
{ 
    System.out.println("[Key]:" + i + " [Value]:" + map.get(i));
}
//[Key]:1 [Value]:사과
//[Key]:2 [Value]:바나나
//[Key]:3 [Value]:포도
```

HashMap 값 검색
---------------
```
System.out.println(map.containsKey("A")); // 키가 있으면 true, 없으면 false를 반환

System.out.println(hashMap.containsValue("BANANA")); // value 값 검색:paw_prints:
System.out.println(hashMap.containsValue("E????"));
```