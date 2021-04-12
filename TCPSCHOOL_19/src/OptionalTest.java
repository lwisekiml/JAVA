import java.util.Optional;

public class OptionalTest {
	public static void main(String[] args) {
/*
# Optional 클래스
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
/*
# Optional 객체에 접근
get() 메소드를 사용하면 Optional 객체에 저장된 값에 접근 가능
만약 Optional 객체에 저장된 값이 null이면, NoSuchElementException 예외 발생
get() 메소드를 호출하기 전에 isPresent() 메소드를 사용하여 Optional 객체에 저장된 값이 null인지 아닌지를 먼저 확인한 후 호출하는 것이 좋음

isPresent() 메소드를 이용하여 좀 더 안전하게 Optional 객체에 저장된 값에 접근하는 예제
*/
		Optional<String> opt1 = Optional.ofNullable("자바 Optional 객체");
		if(opt1.isPresent()) {
			System.out.println(opt1.get());
		}
/* 
다음과 같은 메소드를 사용하여 null 대신에 대체할 값을 지정할 수 있음
1. orElse() 메소드 : 저장된 값이 존재하면 그 값을 반환하고, 값이 존재하지 않으면 인수로 전달된 값을 반환함
2. orElseGet() 메소드 : 저장된 값이 존재하면 그 값을 반환하고, 값이 존재하지 않으면 인수로 전달된 람다 표현식의 결괏값을 반환함
3. orElseThrow() 메소드 : 저장된 값이 존재하면 그 값을 반환하고, 값이 존재하지 않으면 인수로 전달된 예외를 발생시킴

예제에서 사용된 empty() 메소드는 Optional 객체를 null로 초기화해줌
*/
		Optional<String> opt2 = Optional.empty(); // Optional를 null로 초기화함.
		System.out.println(opt2.orElse("빈 Optional 객체"));
		System.out.println(opt2.orElseGet(String::new));
	}
}
