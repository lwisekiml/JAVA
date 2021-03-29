import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

/*
# 스트림 API
자바에서는 많은 양의 데이터를 저장하기 위해서 배열이나 컬렉션을 사용
저장된 데이터에 접근하기 위해서는 반복문이나 반복자(iterator)를 사용하여 매번 새로운 코드를 작성해야 하나
작성된 코드는 길이가 너무 길고 가독성도 떨어지며, 코드의 재사용이 거의 불가능 함
데이터베이스의 쿼리와 같이 정형화된 처리 패턴을 가지지 못했기에 데이터마다 다른 방법으로 접근해야만 했음
이러한 문제점을 극복하기 위해서 Java SE 8부터 스트림(stream) API를 도입

데이터를 추상화하여 다루므로, 다양한 방식으로 저장된 데이터를 읽고 쓰기 위한 공통된 방법 제공하여
배열이나 컬렉션뿐만 아니라 파일에 저장된 데이터도 모두 같은 방법으로 다룰 수 있게 됨

# 스트림 API의 특징
1. 외부 반복을 통해 작업하는 컬렉션과는 달리 내부 반복(internal iteration)을 통해 작업 수행
2. 재사용이 가능한 컬렉션과는 달리 단 한 번만 사용할 수 있음
3. 원본 데이터 변경X
4. 스트림의 연산은 필터-맵(filter-map) 기반의 API를 사용하여 지연(lazy) 연산을 통해 성능을 최적화 함
5. parallelStream() 메소드를 통한 손쉬운 병렬 처리 지원 

# 스트림 API의 동작 흐름
1. 스트림의 생성
2. 스트림의 중개 연산 (스트림의 변환)
3. 스트림의 최종 연산 (스트림의 사용)
데이터 소스 -> 중개연산(필터) -> 중개연산(맵) -> 최종연산

# 스트림의 생성
아래와 같이 다양한 데이터 소스에서 생성할 수 있음
1. 컬렉션
2. 배열
3. 가변 매개변수
4. 지정된 범위의 연속된 정수
5. 특정 타입의 난수들
6. 람다 표현식
7. 파일
8. 빈 스트림

# 컬렉션
모든 컬렉션의 최고 상위 조상인 Collection 인터페이스에는 stream() 메소드가 정의되어 있어
Collection 인터페이스를 구현한 모든 List와 Set 컬렉션 클래스에서도 stream() 메소드로 스트림 생성 가능
parallelStream() 메소드를 사용하면 병렬 처리가 가능한 스트림 생성 가능
*/
public class StreamTest {
	public static void main(String[] args) {
		System.out.println("--- 컬렉션 ---");
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(4);
		list.add(2);
		list.add(3);
		list.add(1);

		// 컬렉션에서 스트림 생성
		Stream<Integer> stream = list.stream();
		// forEach() 메소드를 이용한 스트림 요소의 순차 접근
		stream.forEach(System.out::println);
/*
Stream 클래스의 forEach() 메소드는 해당 스트림의 요소를 하나씩 소모해가며 순차적으로 요소에 접근하는 메소드이며
같은 스트림으로는 forEach() 메소드를 한 번밖에 호출할 수 없음
단, 원본 데이터의 요소를 소모하는 것은 아니므로, 같은 데이터에서 또 다른 스트림을 생성하여 forEach() 메소드를 호출하는 것은 가능		
*/

/*
# 배열
배열에 관한 스트림을 생성하기 위해 Arrays 클래스에는 다양한 형태의 stream() 메소드가 클래스 메소드로 정의되어 있음
기본 타입인 int, long, double 형을 저장할 수 있는 배열에 관한 스트림이 별도로 정의되어 있음
이러한 스트림은 java.util.stream 패키지의 IntStream, LongStream, DoubleStream 인터페이스로 각각 제공됩니다.

Arrays 클래스의 stream() 메소드는 전체 배열뿐만 아니라 배열의 특정 부분만을 이용하여 스트림을 생성할 수도 있습니다.
*/
		System.out.println("--- 배열 ---");
		String[] arr = new String[]{"넷", "둘", "셋", "하나"};
		
		// 배열에서 스트림 생성
		Stream<String> stream1 = Arrays.stream(arr);
		stream1.forEach(e -> System.out.print(e + " "));
		System.out.println();
		
		// 배열의 특정 부분만을 이용한 스트림 생성
		Stream<String> stream2 = Arrays.stream(arr, 1, 3);
		stream2.forEach(e -> System.out.print(e + " "));
	}
}
