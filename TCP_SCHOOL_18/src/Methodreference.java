import java.util.function.DoubleUnaryOperator;

public class Methodreference {
	public static void main(String[] args) {
/*
# 메소드 참조
메소드 참조(method reference)
람다 표현식이 단 하나의 메소드만을 호출하는 경우에 해당 람다 표현식에서 불필요한 매개변수를 제거하고 사용할 수 있도록 해주며
불필요한 매개변수를 제거하고 다음과 같이 '::' 기호를 사용하여 표현 가능

문법
클래스이름::메소드이름

또는
참조변수이름::메소드이름

두 개의 값을 전달받아 제곱 연산을 수행하는 Math 클래스의 클래스 메소드인 pow() 메소드를 호출하는 람다 표현식
예제
(base, exponent) -> Math.pow(base, exponent);

단순히 Math 클래스의 pow() 메소드로 인수를 전달하는 역할만 하므로, 메소드 참조를 사용하여 다음과 같이 간단히 표현 가능
예제
Math::pow;

특정 인스턴스의 메소드를 참조할 때에도 참조 변수의 이름을 통해 메소드 참조 사용 가능
예제
MyClass obj = new MyClass;
Function<String, Boolean> func = (a) -> obj.equals(a); // 람다 표현식
Function<String, Boolean> func = obj::equals(a);       // 메소드 참조

람다 표현식과 메소드 참조를 비교하는 예제
*/
		DoubleUnaryOperator oper;

		oper = (n) -> Math.abs(n); // 람다 표현식
		System.out.println(oper.applyAsDouble(-5));

		oper = Math::abs; // 메소드 참조
		System.out.println(oper.applyAsDouble(-5));
		
/*
# 생성자 참조
생성자를 호출하는 람다 표현식도 앞서 살펴본 메소드 참조를 이용할 수 있음
단순히 객체를 생성하고 반환하는 람다 표현식은 생성자 참조로 변환할 수 있음

단순히 객체를 생성하고 반환하는 람다 표현식
예제
(a) -> { return new Object(a); }

위의 예는 단순히 Object 클래스의 인스턴스를 생성하고 반환하기만 하므로, 생성자 참조를 사용하여 다음과 같이 간단히 표현할 수 있음
예제
Object::new;

이때 해당 생성자가 존재하지 않으면 컴파일 시 오류가 발생합니다.

배열을 생성할 때에도 다음과 같이 생성자 참조를 사용할 수 있음
예제
Function<Integer, double[]> func1 = a -> new double[a]; // 람다 표현식
Function<Integer, double[]> func2 = double[]::new;      // 생성자 참조	
*/
	}
}
