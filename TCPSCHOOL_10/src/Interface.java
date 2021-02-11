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
    }
}

