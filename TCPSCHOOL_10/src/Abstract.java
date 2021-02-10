/*
	# 추상 메소드(abstract method)?
	자식 클래스에서 반드시 오버라이딩 해야만 사용할 수 있는 메소드
	
	사용하는 목적?
	자식 클래스가 반드시 추상 메소드를 구현하도록 하기 위함
	
	1)모듈처럼 중복되는 부분이나 2)공통적인 부분은 미리 다 만들어진 것을 사용하고
	이를 받아 사용하는 쪽에서는 자신에게 필요한 부분만을 재정의하여 사용 -> 생산성이 향상, 배포 등이 쉬워짐
	
	추상 메소드는 선언부만이 존재, 구현부 작성X
	구현부를 자식 클래스에서 오버라이딩하여 사용
	
	문법
	abstract 반환타입 메소드이름();
	
	
	# 추상 클래스(abstract class)?
	하나 이상의 추상 메소드를 포함하는 클래스
	
	추상 클래스는 (객체 지향 프로그래밍에서 중요한 특징인) 다형성을 가지는 메소드의 집합을 정의할 수 있도록 해줌
	반드시 사용되어야 하는 메소드를 추상 클래스에 추상 메소드로 선언해 놓으면, 이 클래스를 상속받는 모든 클래스에서는 이 추상 메소드를 반드시 재정의해야 함
	
	문법
	abstract class 클래스이름 {
	    ...
	    abstract 반환타입 메소드이름();
	    ...
	}


	추상 클래스는 동작이 정의되어 있지 않은 추상 메소드를 포함하고 있으므로, 인스턴스를 생성X
	상속을 통해 자식 클래스를 만들고 추상 클래스의 모든 추상 메소드를 오버라이딩을 해야 자식 클래스의 인스턴스를 생성 가능
	
	추상 클래스는 추상 메소드를 포함하고 있다는 점을 제외하면, 일반 클래스와 모든 점이 같습니다.
	즉, 생성자와 필드, 일반 메소드도 포함할 수 있습니다.
*/ 

abstract class Animal { abstract void cry(); }

class Cat extends Animal { void cry() { System.out.println("냐옹냐옹!"); } }

class Dog extends Animal { void cry() { System.out.println("멍멍!"); } }

public class Abstract {
    public static void main(String[] args) {
        // Animal a = new Animal(); // 추상 클래스는 인스턴스를 생성할 수 없음.
        Cat c = new Cat();
        Dog d = new Dog();
 
        c.cry();
        d.cry();
    }
}
