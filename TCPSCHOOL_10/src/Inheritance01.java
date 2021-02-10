/*
상속(inheritance)이란?
기존의 클래스에 기능을 추가하거나 재정의하여 새로운 클래스를 정의하는 것을 의미

1. 기존에 작성된 클래스를 재활용 가능
2. 자식 클래스 설계 시 중복되는 멤버를 미리 부모 클래스에 작성해 놓으면, 자식 클래스에서는 해당 멤버를 작성하지 않아도 됨
3. 클래스 간의 계층적 관계를 구성함으로써 다형성의 문법적 토대 마련

자식 클래스에는
부모 클래스의 필드, 메소드만이 상속
생성자, 초기화 블록은 상속X

부모 클래스의 접근 제어가 private이나 default로 설정된 멤버는 상속받지만 접근X
*/
class Parent {
	private int a = 10;
	public int b = 20;
}

class Child extends Parent {
	public int c = 30;
	void display() {
		// System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
public class Inheritance01 {
	public static void main(String[] args) {
		Child ch = new Child();
		ch.display();
	}

}
