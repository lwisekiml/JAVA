/*
1. Wrapper 클래스
프로그램에 따라 기본 타입의 데이터를 객체로 취급해야 하는 경우
(메소드의 인수로 객체 타입만이 요구되면, 기본 타입의 데이터를 그대로 사용할 수 없음)
기본 타입의 데이터를 먼저 객체로 변환한 후 작업을 수행

Wrapper class : 8개의 기본 타입에 해당하는 데이터를 객체로 포장해 주는 클래스

각각의 타입에 해당하는 데이터를 인수로 전달받아, 해당 값을 가지는 객체로 만들어  줌
java.lang 패키지에 포함되어 제공

기본 타입에 대응하여 제공하고 있는 래퍼 클래스
기본 타입	래퍼 클래스
byte	Byte
short	Short
int		Integer
long	Long
float	Float
double	Double
char	Character
boolean	Boolean

래퍼 클래스(Wrapper class)는 산술 연산을 위해 정의된 클래스가 아니므로, 인스턴스에 저장된 값을 변경할 수 없습니다.
단지, 값을 참조하기 위해 새로운 인스턴스를 생성하고, 생성된 인스턴스의 값만을 참조할 수 있습니다.

2. 박싱(Boxing)과 언박싱(UnBoxing)
박싱(Boxing)   : 기본 타입의 데이터를 래퍼 클래스의 인스턴스로 변환하는 과정
언박싱(UnBoxing): 래퍼 클래스의 인스턴스에 저장된 값을 다시 기본 타입의 데이터로 꺼내는 과정

3. 오토 박싱(AutoBoxing)과 오토 언박싱(AutoUnBoxing)
JDK 1.5부터는 박싱과 언박싱이 필요한 상황에서 자바 컴파일러가 이를 자동으로 처리
자동화된 박싱과 언박싱을 오토 박싱(AutoBoxing)과 오토 언박싱(AutoUnBoxing)이라고 부름
 */
public class WrapperTest {
	public static void main(String[] args) {
		//래퍼 클래스인 Interger 클래스와 Character 클래스에는 각각 언박싱을 위한 intValue() 메소드와 charValue() 메소드가 포함
		//오토 박싱을 이용하면 new 키워드를 사용하지 않고도 자동으로 Character 인스턴스를 생성
		//charValue() 메소드를 사용하지 않고도, 오토 언박싱을 이용하여 인스턴스에 저장된 값을 바로 참조 가능
		Integer num = new Integer(17); // 박싱
		int n = num.intValue();        // 언박싱
		System.out.println(n);

		Character ch = 'X'; // Character ch = new Character('X'); : 오토박싱
		char c = ch;        // char c = ch.charValue();           : 오토언박싱
		System.out.println(c);

		//다음 예제처럼 오토 박싱과 오토 언박싱을 통해 기본 타입과 래퍼 클래스 간의 다양한 연산도 가능
		Integer num1 = new Integer(7); // 박싱
		Integer num2 = new Integer(3); // 박싱

		int int1 = num1.intValue();    // 언박싱
		int int2 = num2.intValue();    // 언박싱

		Integer result1 = num1 + num2; // 10 ①
		Integer result2 = int1 - int2; // 4 ②
		int result3 = num1 * int2;     // 21 ③
		//①번부터 ③번 라인까지의 연산은 내부적으로 래퍼 클래스인 피연산자를 오토언박싱하여 기본 타입끼리의 연산을 수행하고 있는 것

		Integer n1 = new Integer(10);
		Integer n2 = new Integer(20);
		Integer n3 = new Integer(10);

		System.out.println(n1 < n2);       // true
		System.out.println(n1 == n3);      // false ①
		System.out.println(n1.equals(n3)); // true ②
/*
래퍼 클래스의 비교 연산도 오토언박싱을 통해 가능해지지만, 인스턴스에 저장된 값의 동등 여부 판단은 ①번 라인처럼 비교 연산자인 동등 연산자(==)를 사용해서는 안 되며,
②번 라인처럼 equals() 메소드를 사용해야만 함

래퍼 클래스도 객체이므로 동등 연산자(==)를 사용하게 되면, 두 인스턴스의 값을 비교하는 것이 아니라 두 인스턴스의 주소값을 비교
서로 다른 두 인스턴스를 동등 연산자(==)로 비교하게 되면, 언제나 false 값을 반환
인스턴스에 저장된 값의 동등 여부를 정확히 판단하려면 equals() 메소드를 사용
*/
	}
}