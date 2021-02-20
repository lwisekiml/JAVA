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

2/18
3. concat() 메소드
해당 문자열의 뒤에 인수로 전달된 문자열을 추가한 새로운 문자열을 반환
(인수로 전달된 문자열의 길이가 0이면, 해당 문자열을 그대로 반환)

4. indexOf() 메소드
해당 문자열에서 특정 문자나 문자열이 처음으로 등장하는 위치의 인덱스 반환
(해당 문자열에 전달된 문자나 문자열이 포함되어 있지 않으면 -1을 반환)
*/

/*
2/20
5. trim() 메소드
trim() : 해당 문자열의 맨 앞과 맨 뒤에 포함된 모든 공백 문자 제거
toLowerCase() : 메소드는 해당 문자열의 모든 문자를 소문자로 변환
toUpperCase() : 메소드는 해당 문자열의 모든 문자를 대문자로 변환


대표적인 String 메소드

char charAt(int index)
해당 문자열의 특정 인덱스에 해당하는 문자를 반환

int compareTo(String str)
해당 문자열을 인수로 전달된 문자열과 사전 편찬 순으로 비교

int compareToIgnoreCase(String str)
해당 문자열을 인수로 전달된 문자열과 대소문자를 구분하지 않고 사전 편찬 순으로 비교

String concat(String str)
해당 문자열의 뒤에 인수로 전달된 문자열을 추가한 새로운 문자열을 반환

int indexOf(int ch) int indexOf(String str)
해당 문자열에서 특정 문자나 문자열이 처음으로 등장하는 위치의 인덱스를 반환

int indexOf(int ch, int fromIndex) int indexOf(String str, int fromIndex)
해당 문자열에서 특정 문자나 문자열이 전달된 인덱스 이후에 처음으로 등장하는 위치의 인덱스를 반환

int lastIndexOf(int ch)
해당 문자열에서 특정 문자가 마지막으로 등장하는 위치의 인덱스를 반환

int lastIndexOf(int ch, int fromIndex)
해당 문자열에서 특정 문자가 전달된 인덱스 이후에 마지막으로 등장하는 위치의 인덱스를 반환

String[] split(String regex)
해당 문자열을 전달된 정규 표현식(regular expression)에 따라 나눠서 반환

String substring(int beginIndex)
해당 문자열의 전달된 인덱스부터 끝까지를 새로운 문자열로 반환

String substring(int begin, int end)
해당 문자열의 전달된 시작 인덱스부터 마지막 인덱스까지를 새로운 문자열로 반환

String toLowerCase()
해당 문자열의 모든 문자를 소문자로 변환

String toUpperCase()
해당 문자열의 모든 문자를 대문자로 변환

String trim()
해당 문자열의 맨 앞과 맨 뒤에 포함된 모든 공백 문자를 제거

length()
해당 문자열의 길이를 반환함.

isEmpty()
해당 문자열의 길이가 0이면 true를 반환하고, 아니면 false를 반환
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
		System.out.println("concat() 메소드");
		System.out.println("--------------------");

		String concatTest = new String("Java");
		System.out.println("원본 문자열 : " + concatTest);
		System.out.println(concatTest.concat("수업"));
		System.out.println("concat() 메소드 호출 후 원본 문자열 : " + concatTest);
		
		System.out.println("====================");
		System.out.println("indexOf() 메소드");
		System.out.println("--------------------");
		
		String indexOfTest = new String("Oracle Java");
		System.out.println("원본 문자열 : " + indexOfTest);
		System.out.println(indexOfTest.indexOf('o'));
		System.out.println(indexOfTest.indexOf('a'));
		System.out.println(indexOfTest.indexOf("Java"));
		System.out.println("indexOf() 메소드 호출 후 원본 문자열 : " + indexOfTest);
		
		System.out.println("====================");
		System.out.println("trim() 메소드");
		System.out.println("--------------------");

		String trimTest = new String(" Java     ");
		System.out.println("원본 문자열 : " + trimTest);
		System.out.println(trimTest + '|');
		System.out.println(trimTest.trim() + '|');
		System.out.println("trim() 메소드 호출 후 원본 문자열 : " + trimTest);

		String str = new String("Java");
		System.out.println("\n원본 문자열 : " + str);
		System.out.println("toLowerCase() : " + str.toLowerCase());
		System.out.println("toUpperCase() : " + str.toUpperCase());
		System.out.println("두 메소드 호출 후 원본 문자열 : " + str);
	}
}