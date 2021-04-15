import java.time.LocalDate;
import java.time.LocalTime;

/*
# java.time 패키지
자바에서의 날짜 및 시간 처리
JDK 1.0에서는 Date 클래스를 사용하여 날짜에 관한 처리를 수행했음
하지만 Date 클래스는 현재 대부분의 메소드가 사용을 권장하지 않고(deprecated) 있음
JDK 1.1부터 새롭게 제공된 Calendar 클래스는 날짜와 시간에 대한 정보를 손쉽게 얻을 수 있었으나
Calendar 클래스는 다음과 같은 문제점을 가지고 있음

1. Calendar 인스턴스는 불변 객체(immutable object)가 아니라서 값이 수정될 수 있습니다.
2. 윤초(leap second)와 같은 특별한 상황을 고려하지 않습니다.
3. Calendar 클래스에서는 월(month)을 나타낼 때 1월부터 12월을 0부터 11까지로 표현해야 하는 불편함이 있습니다.
Calendar 클래스뿐만 아니라 더 나은 성능의 Joda-Time이라는 라이브러리를 함께 사용해 왔음

Joda-Time 라이브러리를 발전시킨 새로운 날짜와 시간 API인 java.time 패키지를 제공
java.time 패키지는 위와 같은 문제점을 모두 해결했으며, 다양한 기능을 지원하는 다수의 하위 패키지를 포함하고 있음

# java.time 패키지
Java SE 8부터 제공되는 java.time 패키지에는 자바에서 날짜와 시간을 다루는 데 사용되는 필수 클래스들이 포함되어 있으며
다음과 같은 다양한 기능을 하는 하위 패키지를 포함하고 있음

1. java.time.chrono : ISO-8601에 정의된 표준 달력 이외의 달력 시스템을 사용할 때 필요한 클래스들
2. java.time.format : 날짜와 시간에 대한 데이터를 구문분석하고 형식화하는 데 사용되는 클래스들
3. java.time.temporal : 날짜와 시간에 대한 데이터를 연산하는 데 사용되는 보조 클래스들
4. java.time.zone : 타임 존(time-zone)과 관련된 클래스들

해당 패키지에 속하는 모든 클래스의 인스턴스는 불변 객체(immutable object)로 생성됨
java.time 패키지에 포함되는 클래스의 메소드들은 모두 새로운 객체를 생성하여 반환하고 있음

# java.time 패키지의 구성 클래스
기존의 Calendar 클래스는 날짜와 시간을 한 번에 표현했지만, java.time 패키지에서는 별도로 구분하여 처리
LocalDate 클래스는 날짜를 표현할 때 사용하며, LocalTime 클래스는 시간을 표현할 때 사용
기존의 Calendar 클래스처럼 날짜와 시간을 한 번에 표현하고 싶을 때는 LocalDateTime 클래스 사용

ZonedDateTime 클래스는 특정 타임 존(time-zone)에 해당하는 날짜와 시간을 다루는 데 사용
기존의 Date 클래스와 비슷한 용도로 사용되는 Instant 클래스가 있으며
Instant 클래스는 특정 시점의 날짜와 시간을 나노초(nanosecond) 단위로 표현하는 타임스탬프(time-stamp)를 다루는 데 사용됨

Period 클래스는 두 날짜 사이의 차이를 표현하는 데 사용되며, Duration 클래스는 두 시각 사이의 차이를 표현하는 데 사용됨 
*/
public class JavaTimePackage {
	public static void main(String[] args) {
/*
# LocalDate와 LocalTime
# LocalDate 클래스와 LocalTime 클래스
LocalDate 클래스 : 날짜 표현
LocalTime 클래스 : 시간 표현
java.time 패키지에 포함된 대부분의 클래스들은 이 두 클래스를 확장한 것이 많으므로, 우선 이 두 클래스를 잘 이해하는 것이 중요

# 날짜와 시간 객체의 생성
LocalDate와 LocalTime 클래스는 객체를 생성하기 위해서 now()와 of() 메소드라는 클래스 메소드를 제공

now() 메소드 : 현재의 날짜와 시간을 이용하여 새로운 객체를 생성하여 반환
of()  메소드 : 전달된 인수를 가지고 특정 날짜와 시간을 표현하는 새로운 객체를 생성하여 반환
of() 메소드는 메소드 시그니처 이외에도 다양한 형태가 오버로딩되어 제공됨 
*/
		LocalDate today = LocalDate.now();
		LocalTime present = LocalTime.now();
		System.out.println(today + " " + present);
		
		// static LocalDate of(int year, int month, int dayOfMonth)
		LocalDate birthDay = LocalDate.of(1982, 02, 19);
		// static LocalTime of(int hour, int minute, int second, int nanoOfSecond)
		LocalTime birthTime = LocalTime.of(02, 02, 00, 100000000);
		System.out.println(birthDay + " " + birthTime);
	}
}