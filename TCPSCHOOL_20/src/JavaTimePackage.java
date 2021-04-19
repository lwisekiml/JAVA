import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

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
		System.out.println("--- LocalDate와 LocalTime ---");
		LocalDate today = LocalDate.now();
		LocalTime present = LocalTime.now();
		System.out.println(today + " " + present);
		
		// static LocalDate of(int year, int month, int dayOfMonth)
		LocalDate birthDay = LocalDate.of(1982, 02, 19);
		// static LocalTime of(int hour, int minute, int second, int nanoOfSecond)
		LocalTime birthTime = LocalTime.of(02, 02, 00, 100000000);
		System.out.println(birthDay + " " + birthTime);
/*
# 날짜와 시간 객체에 접근하기
LocalDate와 LocalTime 클래스는 특정 필드의 값을 가져오기 위해서 다음과 같이 다양한 getter 메소드를 제공

LocalDate 클래스에서 제공하는 대표적인 getter 메소드
메소드	설명
int get(TemporalField field)		해당 날짜 객체의 명시된 필드의 값을 int형이나 long형으로 반환함.
long getLong(TemporalField field)

int getYear()						해당 날짜 객체의 연도(YEAR) 필드의 값을 반환함.
Month getMonth()					해당 날짜 객체의 월(MONTH_OF_YEAR) 필드의 값을 Month 열거체를 이용하여 반환함.
int getMonthValue()					해당 날짜 객체의 월(MONTH_OF_YEAR) 필드의 값을 반환함. (1~12)
int getDayOfMonth()					해당 날짜 객체의 일(DAY_OF_MONTH) 필드의 값을 반환함. (1~31)
int getDayOfYear()					해당 날짜 객체의 일(DAY_OF_YEAR) 필드의 값을 반환함. (1~365, 윤년이면 366)
DayOfWeek getDayOfWeek()			해당 날짜 객체의 요일(DAY_OF_WEEK) 필드의 값을 DayOfWeek 열거체를 이용하여 반환함.
 
기존의 Calendar 클래스에서는 1월을 0으로 표현하여 월의 범위가 0~11이었으며, 요일은 일요일부터 1로 표현했음
하지만 java.time 패키지에서는 1월을 1로 표현하여 월의 범위가 1~12가 되었으며, 요일은 월요일부터 1로 표현하도록 변경됨 
Calendar 클래스와 java.time 패키지의 클래스를 같이 사용할 때에는 특히 위와 같은 차이점에 주의해야 함
*/
		System.out.println("\n--- 날짜와 시간 객체에 접근하기 ---");
		LocalDate today1 = LocalDate.now();
		System.out.println("올해는 " + today1.getYear() + "년입니다.");
		System.out.println("이번달은 " + today1.getMonthValue() + "월입니다.");
		System.out.println("오늘은 " + today1.getDayOfWeek() + "입니다.");
		System.out.println("오늘은 1년 중 " + today1.get(ChronoField.DAY_OF_YEAR) + "일째 날입니다.");
/*
LocalTime 클래스에서 제공하는 대표적인 getter 메소드

메소드								설명
int get(TemporalField field)		해당 시간 객체의 명시된 필드의 값을 int형이나 long형으로 반환함.
long getLong(TemporalField field)

int getHour()						해당 시간 객체의 시(HOUR_OF_DAY) 필드의 값을 반환함.
int getMinute()						해당 시간 객체의 분(MINUTE_OF_HOUR) 필드의 값을 반환함.
int getSecond()						해당 시간 객체의 초(SECOND_OF_MINUTE) 필드의 값을 반환함.
int getNano()						해당 시간 객체의 나노초(NANO_OF_SECOND) 필드의 값을 반환함.
*/
		System.out.println("\n--- LocalTime class에서 제공하는 대표적인 getter 메소드 ---");
		LocalTime present1 = LocalTime.now();
		System.out.println("현재 시각은 " + present1.getHour() + "시 " + present1.getMinute() + "분입니다.");
/*
# TemporalField 인터페이스
TemporalField 인터페이스는 월(month-of-year)과 시(hour-of-day)와 같이 날짜와 시간과 관련된 필드를 정의해 놓은 인터페이스이며
구현하여 날짜와 시간을 나타낼 때 사용하는 열거체는 ChronoField 임
java.time 패키지를 구성하는 클래스의 메소드에서는 이 열거체를 이용하여 날짜와 시간을 처리하고 있음 

ChronoField 열거체에 정의된 대표적인 열거체 상수

열거체 상수			설명
ERA					시대
YEAR				연도
MONTH_OF_YEAR		월
DAY_OF_MONTH		일
DAY_OF_WEEK			요일 (월요일:1, 화요일:2, ..., 일요일:7)
AMPM_OF_DAY			오전/오후
HOUR_OF_DAY			시(0~23)
CLOCK_HOUR_OF_DAY	시(1~24)
HOUR_OF_AMPM		시(0~11)
CLOCK_HOUR_OF_AMPM	시(1~12)
MINUTE_OF_HOUR		분
SECOND_OF_MINUTE	초
DAY_OF_YEAR			해당 연도의 몇 번째 날 (1~365, 윤년이면 366)
EPOCH_DAY			EPOCH(1970년 1월 1일)을 기준으로 몇 번째 날
*/ 
		System.out.println("\n--- TemporalField ---");
		LocalTime present2 = LocalTime.now();
		String ampm;

		if(present2.get(ChronoField.AMPM_OF_DAY) == 0) {
			ampm = "오전";
		} else {
			ampm = "오후";
		}
		
		System.out.println("지금은 " + ampm + " " + present2.get(ChronoField.HOUR_OF_AMPM) + "시입니다.");
/*
# 날짜와 시간 객체의 필드값 변경
LocalDate와 LocalTime 클래스는 날짜와 시간 객체에 접근하여 특정 필드의 값을 변경하기 위해서 with() 메소드를 사용
with() 메소드를 사용하면 값이 변경될 필드를 사용자가 직접 명시 가능
특정 필드의 값을 변경하기 위해 미리 정의되어 제공되는 다양한 with() 메소드를 사용 가능 

LocalDate 클래스에서 제공하는 with() 메소드
메소드												설명
LocalDate with(TemporalField field, long newValue)	해당 날짜 객체에서 특정 필드를 전달된 새로운 값으로 설정한 새로운 날짜 객체를 반환함.
LocalDate withYear(int year)						해당 날짜 객체에서 연도(YEAR) 필드를 전달된 새로운 값으로 설정한 새로운 날짜 객체를 반환함.
LocalDate withMonth(int month)						해당 날짜 객체에서 월(MONTH_OF_YEAR) 필드를 전달된 새로운 값으로 설정한 새로운 날짜 객체를 반환함.
LocalDate withDayOfMonth(int dayOfMonth)			해당 날짜 객체에서 일(DAY_OF_MONTH) 필드를 전달된 새로운 값으로 설정한 새로운 날짜 객체를 반환함.
LocalDate withDayOfYear(int dayOfYear)				해당 날짜 객체에서 DAY_OF_YEAR 필드를 전달된 새로운 값으로 설정한 새로운 날짜 객체를 반환함.
*/ 
		System.out.println("\n--- 날짜와 시간 객체의 필드값 변경 ---");
		LocalDate today2 = LocalDate.now();
		System.out.println("올해는 " + today2.getYear() + "년입니다.");

		LocalDate otherDay2 = today.withYear(1982);
		System.out.println("올해는 " + otherDay2.getYear() + "년입니다.");
/*
LocalTime 클래스에서 제공하는 with() 메소드

메소드												설명
LocalTime with(TemporalField field, long newValue)	해당 시간 객체에서 특정 필드를 전달된 새로운 값으로 설정한 새로운 시간 객체를 반환함.
LocalTime withHour(int hour)						해당 시간 객체에서 시(HOUR_OF_DAY) 필드를 전달된 새로운 값으로 설정한 새로운 시간 객체를 반환함.
LocalTime withMinute(int minute)					해당 시간 객체에서 분(MINUTE_OF_HOUR) 필드를 전달된 새로운 값으로 설정한 새로운 시간 객체를 반환함.
LocalTime withSecond(int second)					해당 시간 객체에서 초(SECOND_OF_MINUTE) 필드를 전달된 새로운 값으로 설정한 새로운 시간 객체를 반환함.
LocalTime withNano(int nanoOfSecond)				해당 시간 객체에서 나노초(NANO_OF_SECOND) 필드를 전달된 새로운 값으로 설정한 새로운 시간 객체를 반환함.
*/
		System.out.println("\n--- LocalTime 클래스에서 제공하는 with() 메소드 ---");
		LocalTime present4 = LocalTime.now();
		System.out.println("현재 시각은 " + present4.getHour() + "시입니다.");

		LocalTime otherTime4 = present.withHour(8);
		System.out.println("현재 시각은 " + otherTime4.getHour() + "시입니다.");

// with() 메소드 이외에도 특정 필드의 값을 더하거나 뺄 수 있는 다양한 plus()와 minus() 메소드도 제공
		System.out.println("\n--- 특정 필드의 값을 더하거나 뺄 수 있는 다양한 plus()와 minus() 메소드 ---");
		LocalTime present5 = LocalTime.now();
		System.out.println("현재 시각은 " + present5.get(ChronoField.HOUR_OF_DAY) + "시입니다.");

		LocalTime otherTime5 = present.plus(2, ChronoUnit.HOURS);
		System.out.println("바뀐 시간은 " + otherTime5.getHour() + "시입니다.");

		LocalTime anotherTime5 = present.minus(6, ChronoUnit.HOURS);
		System.out.println("바뀐 시간은 " + anotherTime5.getHour() + "시입니다.");
/*
# 날짜와 시간 객체의 비교
LocalDate와 LocalTime 클래스에도 객체를 비교할 수 있는 compareTo() 메소드가 오버라이딩되어 있음
더욱 편리하게 날짜와 시간 객체를 서로 비교할 수 있도록 다음과 같은 메소드를 제공
1. isEqual() 메소드 : equals() 메소드와는 달리 오직 날짜만을 비교함. (LocalDate 클래스에서만 제공)
2. isBefore() 메소드 : 두 개의 날짜와 시간 객체를 비교하여 현재 객체가 명시된 객체보다 앞선 시간인지를 비교함.
3. isAfter() 메소드 : 두 개의 날짜와 시간 객체를 비교하여 현재 객체가 명시된 객체보다 늦은 시간인지를 비교함.
*/
		System.out.println("\n--- 날짜와 시간 객체의 비교 ---");
		LocalDate today5 = LocalDate.now();
		LocalDate otherDay5 = LocalDate.of(1982, 02, 19);

		System.out.println(today5.compareTo(otherDay5));
		System.out.println(today5.isBefore(otherDay5));
		System.out.println(today5.isEqual(otherDay5));
	}
}