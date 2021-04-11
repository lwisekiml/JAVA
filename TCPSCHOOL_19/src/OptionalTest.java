import java.util.Optional;

public class OptionalTest {
	public static void main(String[] args) {
/*
Optional 클래스
java.util.Optional<T> 클래스
Optional<T> 클래스는 Integer나 Double 클래스처럼 'T'타입의 객체를 포장해 주는 래퍼 클래스(Wrapper class)이며
Optional 인스턴스는 모든 타입의 참조 변수 저장 가능

이 Optional 객체를 사용하면 예상치 못한 NullPointerException 예외를 제공되는 메소드로 간단히 회피할 수 있음
복잡한 조건문 없이도 널(null) 값으로 인해 발생하는 예외 처리 가능

# Optional 객체의 생성
of() 메소드나 ofNullable() 메소드를 사용하여 Optional 객체 생성 가능
of() 메소드는 null이 아닌 명시된 값을 가지는 Optional 객체 반환
of() 메소드를 통해 생성된 Optional 객체에 null이 저장되면 NullPointerException 예외 발생
만약 참조 변수의 값이 만에 하나 null이 될 가능성이 있다면, ofNullable() 메소드를 사용하여 Optional 객체를 생성하는 것이 좋음

ofNullable() 메소드는 명시된 값이 null이 아니면 명시된 값을 가지는 Optional 객체를 반환하며, 명시된 값이 null이면 비어있는 Optional 객체 반환
*/
		Optional<String> opt = Optional.ofNullable("자바 Optional 객체");
		System.out.println(opt.get());
	}
}
