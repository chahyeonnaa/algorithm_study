package algorithm_study.Java;

import java.util.Comparator;

public class Comparator_Comparable {


   // < Comparable 사용 예시 >
/*    public static void main(String[] args) {

        Student a = new Student(17, 2);    // 17살 2반
        Student b = new Student(18, 1);    // 18살 1반


        int isBig = a.compareTo(b);    // a자기자신과 b객체를 비교한다.

        if (isBig > 0) {
            System.out.println("a객체가 b객체보다 큽니다.");
        } else if (isBig == 0) {
            System.out.println("두 객체의 크기가 같습니다.");
        } else {
            System.out.println("a객체가 b객체보다 작습니다.");
        }

    }*/

    // < Comparator 사용 예시 >
//    public static void main(String[] args)  {
//
//        Student a = new Student(17, 2);	// 17살 2반
//        Student b = new Student(18, 1);	// 18살 1반
//        Student c = new Student(15, 3);	// 15살 3반
//
//        // a객체와는 상관 없이 b와 c객체를 비교한다.
//        // ** 이렇게 안해도 되는 방법이 존재한다 : 익명객체 활용하기
//        int isBig = a.compare(b, c);
//
//        if(isBig > 0) {
//            System.out.println("b객체가 c객체보다 큽니다.");
//        }
//        else if(isBig == 0) {
//            System.out.println("두 객체의 크기가 같습니다.");
//        }
//        else {
//            System.out.println("b객체가 c객체보다 작습니다.");
//        }
//
//    }

    // 익명객체 구현 -> 클래스에서 compare함수를 따로 구현하지 않아도 된다.
/*    public static void main(String[] args) {

        // 익명 객체 구현방법 1
        Comparator<Student> comp1 = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.classNumber - o2.classNumber;
            }
        };
    }*/

    // 익명 객체 구현 2
/*    public static Comparator<Student> comp2 = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.classNumber - o2.classNumber;
        }
    };*/

    // 이런식으로 비교 가능
   // int isBig = comp.compare(b, c);
}

/*

    class Student implements Comparable<Student> {

        int age;			// 나이
        int classNumber;	// 학급

        Student(int age, int classNumber) {
            this.age = age;
            this.classNumber = classNumber;
        }

        // 사용자가 나이를 비교하도록 정함
        @Override
        public int compareTo(Student o) {
            return this.age - o.age;
            // 학급을 비교한다면
            // return this.classNumber-o.classNumber;
        }
    }
*/
/*
class Student implements Comparator<Student> {

    int age;			// 나이
    int classNumber;	// 학급

    Student(int age, int classNumber) {
        this.age = age;
        this.classNumber = classNumber;
    }

    @Override
    public int compare(Student o1, Student o2) {
        return o1.classNumber - o2.classNumber;
    }
}
*/

