/*
다형성(polymorphism) : 하나의 객체가 여러 가지 타입을 가질 수 있는 것을 의미
부모 클래스 타입의 참조 변수로 자식 클래스 타입의 인스턴스를 참조할 수 있도록 하여 구현하고 있음

다형성은 상속, 추상화와 더불어 객체 지향 프로그래밍을 구성하는 중요한 특징 중 하나

1. 참조 변수의 다형성
자바에서는 다형성을 위해 부모 클래스 타입의 참조 변수로 자식 클래스 타입의 인스턴스를 참조할 수 있도록 하고 있음
이때 참조 변수가 사용할 수 있는 멤버의 개수가 실제 인스턴스의 멤버 개수보다 같거나 적어야 참조할 수 있습니다.
*/

class Parent { ... }
class Child extends Parent { ... }

Parent pa = new Parent(); // 허용
Child ch = new Child();   // 허용

// 부모 클래스 타입의 참조 변수로 자식 클래스 타입의 인스턴스 참조 가능
// 참조 변수가 사용할 수 있는 멤버의 개수가 실제 인스턴스의 멤버 개수보다 적기 때문
Parent pc = new Child();  // 허용

// 자식 클래스 타입의 참조 변수로 부모 클래스 타입의 인스턴스를 참조X
// 참조 변수가 사용할 수 있는 멤버의 개수가 실제 인스턴스의 멤버 개수보다 많기 때문
Child cp = new Parent();  // 오류 발생.

//클래스는 상속을 통해 확장될 수는 있어도 축소될 수는 없으므로, 자식 클래스에서 사용할 수 있는 멤버의 개수가 언제나 부모 클래스와 같거나 많게 됨


/*
참조 변수의 타입 변환
참조 변수도 다음과 같은 조건에 따라 타입 변환 가능

1. 서로 상속 관계에 있는 클래스 사이에만 타입 변환 가능
2. 자식 클래스 타입에서 부모 클래스 타입으로의 타입 변환은 생략 가능
3. 하지만 부모 클래스 타입에서 자식 클래스 타입으로의 타입 변환은 반드시 명시
*/

class Parent { ... }
class Child extends Parent { ... }
class Brother extends Parent { ... }

Parent pa01 = null;
Child ch = new Child();
Parent pa02 = new Parent();
Brother br = null;

pa01 = ch;          // pa01 = (Parent)ch; 와 같으며, 타입 변환을 생략할 수 있음.
br = (Brother)pa02; // 타입 변환을 생략할 수 없음.
br = (Brother)ch;   // 직접적인 상속 관계가 아니므로, 오류 발생.


/* 02/08
instanceof 연산자
instanceof 연산자를 사용하여, 참조 변수가 참조하고 있는 인스턴스의 실제 타입을 확인할 수 있도록 함

(문법)
참조변수 instanceof 클래스이름(클래스타입)

참조변수가 실제로 참조하고 있는 인스턴스의 타입이 클래스이름(클래스타입)이면 true, 아니면 false
참조 변수가 null을 가리키고 있으면 false 반환
*/

class Parent { }
class Child extends Parent { }
class Brother extends Parent { }

public class Polymorphism {
    public static void main(String[] args) {
        Parent p = new Parent();
        System.out.println(p instanceof Object); // true
        System.out.println(p instanceof Parent); // true
        System.out.println(p instanceof Child);  // false
        System.out.println();
 
        Parent c = new Child();
        System.out.println(c instanceof Object); // true
        System.out.println(c instanceof Parent); // true
        System.out.println(c instanceof Child);  // true
    }
}
