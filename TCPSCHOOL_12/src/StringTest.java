/* 2/17
String 클래스

자바에서는 문자열을 위한 String이라는 클래스를 별도로 제공함
String 클래스에는 문자열과 관련된 작업을 할 때 유용하게 사용할 수 있는 다양한 메소드가 포함
String 클래스는 java.lang 패키지에 포함되어 제공(java.lang.String 클래스)

String 인스턴스는 한 번 생성되면 그 값을 읽기만 할 수 있고, 변경X(이러한 객체를 자바에서는 불변 객체(immutable object)라고 함) 
즉, 자바에서 덧셈(+) 연산자를 이용하여 문자열 결합을 수행하면, 기존 문자열의 내용이 변경되는 것이 아니라 내용이 합쳐진 새로운 String 인스턴스가 생성되는 것

1. charAt() 메소드
해당 문자열의 특정 인덱스에 해당하는 문자를 반환
해당 문자열의 길이보다 큰 인덱스나 음수 전달시 IndexOutOfBoundsException 오류가 발생

2. compareTo() 메소드
해당 문자열을 인수로 전달된 문자열과 사전 편찬 순으로 비교
대소문자를 구분하여 비교
두 문자열이 같다면 0을 반환
해당 문자열이 인수로 전달된 문자열보다 작으면 음수, 크면 양수 반환

비교할 때 대소문자를 구분X : compareToIgnoreCase()
*/
public class StringTest {
	public static void main(String[] args) {
		System.out.println("====================");
		System.out.println("charAt() 메소드");
		System.out.println("--------------------");

		String charAtTest = new String("Java");
		System.out.println("원본 문자열 : " + charAtTest);

		for (int i = 0; i < charAtTest.length(); i++) {
			System.out.print(charAtTest.charAt(i) + " ");
		}
		System.out.println("\ncharAt() 메소드 호출 후 원본 문자열 : " + charAtTest);
		
		System.out.println("====================");
		System.out.println("compareTo() 메소드");
		System.out.println("--------------------");

		String compareTest = new String("abcd");
		System.out.println("원본 문자열 : " + compareTest);

		System.out.println(compareTest.compareTo("bcef"));
		System.out.println(compareTest.compareTo("abcd") + "\n");

		System.out.println(compareTest.compareTo("Abcd"));
		System.out.println(compareTest.compareToIgnoreCase("Abcd"));
		System.out.println("compareTo() 메소드 호출 후 원본 문자열 : " + compareTest);
		System.out.println("====================");
	}
}