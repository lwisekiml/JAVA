/*
자식 클래스가 여러 부모 클래스를 상속받을 수 있다면, 다양한 동작을 수행할 수 있다는 장점을 가지게 됨
하지만 클래스를 이용하여 다중 상속을 할 경우 메소드 출처의 모호성 등 여러 가지 문제 발생 가능 -> 클래스를 통한 다중 상속은 지원X

- 인터페이스(interface)란?
다른 클래스를 작성할 때 기본이 되는 틀을 제공하면서, 다른 클래스 사이의 중간 매개 역할까지 담당하는 일종의 추상 클래스를 의미

추상 클래스는 추상 메소드뿐만 아니라 생성자, 필드, 일반 메소드도 포함 가능
인터페이스(interface)는 오로지 추상 메소드와 상수만을 포함 가능

- 인터페이스의 선언
접근 제어자와 함께 interface 키워드를 사용 

문법
접근제어자 interface 인터페이스이름 {
    public static final 타입 상수이름 = 값;
    ...
    public abstract 메소드이름(매개변수목록);
    ...
}

단, 클래스와는 달리 인터페이스의 모든 필드는 public static final이어야 하며, 모든 메소드는 public abstract이어야 함
모든 인터페이스에 공통으로 적용되는 부분이므로 이 제어자는 생략 가능

생략된 제어자는 컴파일 시 자바 컴파일러가 자동으로 추가 함

- 인터페이스의 구현
인터페이스는 추상 클래스와 마찬가지로 자신이 직접 인스턴스를 생성X
따라서 인터페이스가 포함하고 있는 추상 메소드를 구현해 줄 클래스를 작성해야만 합니다.

문법
class 클래스이름 implements 인터페이스이름 { ... }

만약 모든 추상 메소드를 구현하지 않는다면, abstract 키워드를 사용하여 추상 클래스로 선언해야 합니다.
*/
interface Animal1 { public abstract void cry(); }

class Cat1 implements Animal1 {
	public void cry() {
        System.out.println("냐옹냐옹!");
    }
}

class Dog1 implements Animal1 {
    public void cry() {
        System.out.println("멍멍!");
    }
}

// 2/11 다중상속
// 인터페이스는 인터페이스로부터만 상속을 받을 수 있으며, 여러 인터페이스를 상속받을 수 있음
interface Animal2 { public abstract void cry(); }
interface Pet2 { public abstract void play(); }

class Cat2 implements Animal2, Pet2 {
    public void cry() {
        System.out.println("냐옹냐옹!");
    }
    public void play() {
        System.out.println("쥐 잡기 놀이하자~!");
    }
}

class Dog2 implements Animal2, Pet2 {
    public void cry() {
        System.out.println("멍멍!");
    }
    public void play() {
        System.out.println("산책가자~!");
    }
}

// 2/12 클래스를 이용한 다중 상속의 문제점
// 메소드 출처의 모호성 등의 문제 발생 가능 

class Animal3 { 
    public void cry() {
        System.out.println("짖기!");
    }
}

class Cat3 extends Animal3 {
    public void cry() {
        System.out.println("냐옹냐옹!");
    }
}

class Dog3 extends Animal3 {
    public void cry() {
        System.out.println("멍멍!");
    }
}

class MyPet3 extends Cat3, Dog3 {} // ①
 
/*
Cat 클래스와 Dog 클래스는 각각 Animal 클래스를 상속받아 cry() 메소드를 오버라이딩 함
MyPet 클래스가 Cat 클래스와 Dog 클래스를 동시에 상속받게 되면 문제 발생

②번에서 MyPet 인스턴스인 p가 cry() 메소드를 호출하면
Cat 클래스에서 상속받은 cry() 메소드인지 Dog 클래스에서 상속받은 cry() 메소드인지를 구분할 수 없는 모호성을 지님
이와 같은 이유로 자바에서는 클래스를 이용한 다중 상속을 지원X

하지만 다음 예제처럼 인터페이스를 이용하여 다중 상속을 하게되면, 위와 같은 메소드 호출의 모호성을 방지할 수 있음
*/

interface Animal4 { public abstract void cry(); }
interface Cat4 extends Animal4 { public abstract void cry(); }
interface Dog4 extends Animal4 { public abstract void cry(); }

class MyPet4 implements Cat4, Dog4 {
    public void cry() {
        System.out.println("멍멍! 냐옹냐옹!");
    }
}

public class Interface {
    public static void main(String[] args) {
    	Cat1 c1 = new Cat1();
        Dog1 d1 = new Dog1();
 
        c1.cry();
        d1.cry();
        
        System.out.println("--------");
    	
        Cat2 c2 = new Cat2();
        Dog2 d2 = new Dog2();

        c2.cry();
        c2.play();
        d2.cry();
        d2.play();
        
        System.out.println("--------");
        
        MyPet3 p3 = new MyPet3();
        p3.cry(); // ②
        
        System.out.println("--------");
        
        MyPet4 p4 = new MyPet4();
        p4.cry();
    }
}

/*
Cat 인터페이스와 Dog 인터페이스를 동시에 구현한 MyPet 클래스에서만 cry() 메소드를 정의하므로, 앞선 예제에서 발생한 메소드 호출의 모호성 없음

인터페이스의 장점
다중 상속이 가능할 뿐만 아니라
1. 대규모 프로젝트 개발 시 일관되고 정형화된 개발을 위한 표준화 가능
2. 클래스의 작성과 인터페이스의 구현을 동시에 진행할 수 있으므로, 개발 시간 단축 가능
3. 클래스와 클래스 간의 관계를 인터페이스로 연결하면, 클래스마다 독립적인 프로그래밍이 가능
*/