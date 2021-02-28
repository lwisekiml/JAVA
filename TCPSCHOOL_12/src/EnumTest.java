
/*
# Enum 클래스
열거체(enumeration type)

- 열거체를 비교할 때 실제 값뿐만 아니라 타입까지도 체크합니다.
- 열거체의 상숫값이 재정의되더라도 다시 컴파일할 필요가 없습니다.

정의 및 사용 : enum 키워드를 사용하여 정의

문법 : enum 열거체이름 { 상수1이름, 상수2이름, ... }
enum Rainbow { RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET }

불규칙한 값을 상숫값으로 설정하고 싶으면 상수의 이름 옆에 괄호(())을 추가하고, 그 안에 원하는 상숫값을 명시할 수  있음
하지만 이때에는 불규칙한 특정 값을 저장할 수 있는 인스턴스 변수와 생성자를 다음 예제와 같이 별도로 추가해야만 함
*/
enum Rainbow {
    RED(3), ORANGE(10), YELLOW(21), GREEN(5), BLUE(1), INDIGO(-1), VIOLET(-11);
 
    private final int value;
    Rainbow(int value) { this.value = value; }
    public int getValue() { return value; }
}
/*
# java.lang.Enum 클래스
Enum 클래스는 모든 자바 열거체의 공통된 조상 클래스

Enum 클래스에는 열거체를 조작하기 위한 다양한 메소드 포함

1. values() 메소드
해당 열거체의 모든 상수를 저장한 배열을 생성하여 반환
자바의 모든 열거체에 컴파일러가 자동으로 추가해 주는 메소드
*/
//enum Rainbow { RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET }

public class EnumTest {
	public static void main(String[] args) {
		System.out.println("--- values() ---");
        Rainbow[] arr = Rainbow.values();
        for (Rainbow rb : arr) {
            System.out.println(rb);
        }
/*
2. valueOf() 메소드
전달된 문자열과 일치하는 해당 열거체의 상수를 반환
*/
        System.out.println("--- valueOf() ---");
        Rainbow rb = Rainbow.valueOf("GREEN");
        System.out.println(rb);
/*
3. ordinal() 메소드
해당 열거체 상수가 열거체 정의에서 정의된 순서(0부터 시작)를 반환
반환되는 값은 열거체 정의에서 해당 열거체 상수가 정의된 순서이며, 상숫값 자체가 아님을 명심
*/
        System.out.println("--- ordinal() ---");
        int idx = Rainbow.YELLOW.ordinal();
        System.out.println(idx);
/*
불규칙적인 상숫값을 가지는 열거체에서 ordinal() 메소드를 사용한 예제

enum Rainbow {
    RED(3), ORANGE(10), YELLOW(21), GREEN(5), BLUE(1), INDIGO(-1), VIOLET(-11);

    private final int value;
    Rainbow(int value) { this.value = value; }
    public int getValue() { return value; }
}
*/
        System.out.println("--- 불규칙적 ordinal() ---");
        System.out.println(Rainbow.BLUE.ordinal());
/*
4. 대표적인 Enum 메소드
메소드	설명
static E values()
해당 열거체의 모든 상수를 저장한 배열을 생성하여 반환함.

static E valueOf(String name)
전달된 문자열과 일치하는 해당 열거체의 상수를 반환함.

protected void finalize()
해당 Enum 클래스가 final 메소드를 가질 수 없게 됨.

String name()
해당 열거체 상수의 이름을 반환함.

int ordinal()
해당 열거체 상수가 열거체 정의에서 정의된 순서(0부터 시작)를 반환함.
*/
	}
}
