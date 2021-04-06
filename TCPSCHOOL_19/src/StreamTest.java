import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.stream.IntStream;
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
		System.out.println("\n--- 배열 ---");
		String[] arr = new String[]{"넷", "둘", "셋", "하나"};

		// 배열에서 스트림 생성
		Stream<String> stream1 = Arrays.stream(arr);
		stream1.forEach(e -> System.out.print(e + " "));
		System.out.println();

		// 배열의 특정 부분만을 이용한 스트림 생성
		Stream<String> stream2 = Arrays.stream(arr, 1, 3);
		stream2.forEach(e -> System.out.print(e + " "));
/*
# 가변 매개변수
Stream 클래스의 of() 메소드를 사용하면 가변 매개변수(variable parameter)를 전달받아 스트림을 생성 가능
*/
		// 가변 매개변수에서 스트림 생성
		System.out.println("\n\n--- 가변 매개변수 ---");
		Stream<Double> stream_ = Stream.of(4.2, 2.5, 3.1, 1.9);
		stream_.forEach(System.out::println);
/*
# 지정된 범위의 연속된 정수
지정된 범위의 연속된 정수를 스트림으로 생성하기 위해 IntStream나 LongStream 인터페이스에는 range()와 rangeClosed() 메소드가 정의되어 있음
range() 메소드는 명시된 시작 정수를 포함하지만, 명시된 마지막 정수는 포함하지 않는 스트림을 생성
rangeClosed() 메소드는 명시된 시작 정수뿐만 아니라 명시된 마지막 정수까지도 포함하는 스트림을 생성
*/
		// 지정된 범위의 연속된 정수에서 스트림 생성
		System.out.println("\n--- 지정된 범위의 연속된 정수 ---");
		IntStream stream1_ = IntStream.range(1, 4);
		stream1_.forEach(e -> System.out.print(e + " "));
		System.out.println();

		IntStream stream2_ = IntStream.rangeClosed(1, 4);
		stream2_.forEach(e -> System.out.print(e + " "));
		
/*
# 특정 타입의 난수들
특정 타입의 난수로 이루어진 스트림을 생성하기 위해 Random 클래스에는 ints(), longs(), doubles()와 같은 메소드가 정의되어 있으며
매개변수로 스트림의 크기를 long 타입으로 전달받을 수 있음
만약 매개변수를 전달받지 않으면 크기가 정해지지 않은 무한 스트림(infinite stream) 반환하며 limit() 메소드를 사용하여 따로 스트림의 크기를 제한해야 함

// 특정 타입의 난수로 이루어진 스트림 생성
*/
		System.out.println("\n\n--- 특정 타입의 난수들 ---");
		IntStream instream = new Random().ints(4);
		instream.forEach(System.out::println);
/*
#람다 표현식
람다 표현식을 매개변수로 전달받아 해당 람다 표현식에 의해 반환되는 값을 요소로 하는 무한 스트림을 생성하기 위해 Stream 클래스에는 iterate()와 generate() 메소드가 정의되어 있음
iterate() 메소드는 시드(seed)로 명시된 값을 람다 표현식에 사용하여 반환된 값을 다시 시드로 사용하는 방식으로 무한 스트림을 생성
generate() 메소드는 매개변수가 없는 람다 표현식을 사용하여 반환된 값으로 무한 스트림을 생성

iterate() 메소드를 이용하여 홀수만으로 이루어진 무한 스트림을 생성하는 예제
IntStream stream = Stream.iterate(2, n -> n + 2); // 2, 4, 6, 8, 10, ...


#파일
파일의 한 행(line)을 요소로 하는 스트림을 생성하기 위해 java.nio.file.Files 클래스에는 lines() 메소드가 정의되어 있음\
java.io.BufferedReader 클래스의 lines() 메소드를 사용하면 파일뿐만 아니라 다른 입력으로부터도 데이터를 행(line) 단위로 읽어 올 수 있음
ex) String<String> stream = Files.lines(Path path);

# 빈 스트림
아무 요소도 가지지 않는 빈 스트림은 Stream 클래스의 empty() 메소드를 사용하여 생성할 수 있음

예제
// 빈 스트림 생성
*/
		System.out.println("\n--- 빈스트림 ---");
		Stream<Object> streamob = Stream.empty();
		System.out.println(streamob.count()); // 스트림의 요소의 총 개수를 출력함.
/*
# 스트림의 중개 연산(intermediate operation)
스트림 API에 의해 생성된 초기 스트림은 중개 연산을 통해 또 다른 스트림으로 변환됨
중개 연산은 스트림을 전달받아 스트림을 반환하므로, 중개 연산은 연속으로 연결해서 사용할 수 있음
스트림의 중개 연산은 필터-맵(filter-map) 기반의 API를 사용함으로 지연(lazy) 연산을 통해 성능을 최적화할 수 있음

스트림 API에서 사용할 수 있는 대표적인 중개 연산과 그에 따른 메소드
1. 스트림 필터링 : filter(), distinct()
2. 스트림 변환 : map(), flatMap()
3. 스트림 제한 : limit(), skip()
4. 스트림 정렬 : sorted()
5. 스트림 연산 결과 확인 : peek()

# 스트림 필터링
filter() 메소드는 해당 스트림에서 주어진 조건(predicate)에 맞는 요소만으로 구성된 새로운 스트림 반환
distinct() 메소드는 해당 스트림에서 중복된 요소가 제거된 새로운 스트림 반환하며 
내부적으로 Object 클래스의 equals() 메소드를 사용하여 요소의 중복 비교
*/
		System.out.println("\n--- 스트림 필터링 ---");
		IntStream stream1_i = IntStream.of(7, 5, 5, 2, 1, 2, 3, 5, 4, 6);
		IntStream stream2_i = IntStream.of(7, 5, 5, 2, 1, 2, 3, 5, 4, 6);

		// 스트림에서 중복된 요소를 제거함.
		stream1_i.distinct().forEach(e -> System.out.print(e + " "));
		System.out.println();

		// 스트림에서 홀수만을 골라냄.
		stream2_i.filter(n -> n % 2 != 0).forEach(e -> System.out.print(e + " "));
/*
# 스트림 변환
map() 메소드는 해당 스트림의 요소들을 주어진 함수에 인수로 전달하여, 그 반환값들로 이루어진 새로운 스트림 반환
해당 스트림의 요소가 배열이라면, flatMap() 메소드를 사용하여 각 배열의 각 요소의 반환값을 하나로 합친 새로운 스트림을 얻을 수 있음

문자열로 이루어진 스트림을 map() 메소드를 이용하여 각 문자열의 길이로 이루어진 스트림으로 변환하는 예제
*/
		System.out.println("\n\n--- 스트림 변환 ---");
		Stream<String> stre = Stream.of("HTML", "CSS", "JAVA", "JAVASCRIPT");
		stre.map(s -> s.length()).forEach(System.out::println);

		//여러 문자열이 저장된 배열을 각 문자열에 포함된 단어로 이루어진 스트림으로 변환하는 예제
		String[] arr_ = {"I study hard", "You study JAVA", "I am hungry"};
		Stream<String> strea = Arrays.stream(arr_);
		strea.flatMap(s -> Stream.of(s.split(" +"))).forEach(System.out::println);
/*
# 스트림 제한
limit() 메소드는 해당 스트림의 첫 번째 요소부터 전달된 개수만큼의 요소만으로 이루어진 새로운 스트림을 반환
skip() 메소드는 해당 스트림의 첫 번째 요소부터 전달된 개수만큼의 요소를 제외한 나머지 요소만으로 이루어진 새로운 스트림을 반환
*/
		System.out.println("\n--- 스트림 제한 ---");
		IntStream stream11 = IntStream.range(0, 10);
		IntStream stream22 = IntStream.range(0, 10);
		IntStream stream33 = IntStream.range(0, 10);

		stream11.skip(4).forEach(n -> System.out.print(n + " "));
		System.out.println();

		stream22.limit(5).forEach(n -> System.out.print(n + " "));
		System.out.println();

		stream33.skip(3).limit(5).forEach(n -> System.out.print(n + " "));
/*
# 스트림 정렬
sorted() 메소드는 해당 스트림을 주어진 비교자(comparator)를 이용하여 정렬함
비교자를 전달하지 않으면 기본적으로 사전 편찬 순(natural order)으로 정렬하게 됨
*/
		System.out.println("\n\n--- 스트림 정렬 ---");
		Stream<String> stream111 = Stream.of("JAVA", "HTML", "JAVASCRIPT", "CSS");
		Stream<String> stream222= Stream.of("JAVA", "HTML", "JAVASCRIPT", "CSS");

		stream111.sorted().forEach(s -> System.out.print(s + " "));
		System.out.println();
		
		stream222.sorted(Comparator.reverseOrder()).forEach(s -> System.out.print(s + " "));
/*
# 스트림 연산 결과 확인
peek() 메소드는 결과 스트림으로부터 요소를 소모하여 추가로 명시된 동작을 수행하며
이 메소드는 원본 스트림에서 요소를 소모하지 않으므로, 주로 연산과 연산 사이에 결과를 확인하고 싶을 때 사용(디버깅 용도로 많이 사용)
*/
		System.out.println("\n\n--- 스트림 연산 결과 확인 ---");
		IntStream streamm = IntStream.of(7, 5, 5, 2, 1, 2, 3, 5, 4, 6);
		
		streamm.peek(s -> System.out.println("원본 스트림 : " + s))
		    .skip(2)
		    .peek(s -> System.out.println("skip(2) 실행 후 : " + s))
		    .limit(5)
		    .peek(s -> System.out.println("limit(5) 실행 후 : " + s))
		    .sorted()
		    .peek(s -> System.out.println("sorted() 실행 후 : " + s))
		    .forEach(n -> System.out.println(n));
/* 
위의 예제에서 첫 번째 요소인 7과 두 번째 요소인 5는 skip() 메소드에 의해 삭제되므로, 원본 스트림에서만 나타남
세 번째 요소인 5는 skip() 메소드와 limit() 메소드가 실행된 후에도 존재하므로, 모두 나타암
peek() 메소드는 스트림의 각 요소가 해당 중개 연산 후에 어떻게 변화하는지를 보여줌


# 대표적인 중개 연산 메소드
스트림 API에서 사용할 수 있는 대표적인 중개 연산을 위한 메소드
메소드																				설명
Stream<T> filter(Predicate<? super T> predicate)									해당 스트림에서 주어진 조건(predicate)에 맞는 요소만으로 구성된 새로운 스트림을 반환함.
<R> Stream<R> map(Functoin<? super T, ? extends R> mapper)							해당 스트림의 요소들을 주어진 함수에 인수로 전달하여, 그 반환값으로 이루어진 새로운 스트림을 반환함.
<R> Stream<R> flatMap(Functoin<? super T, ? extends Stream<? extends R>> mapper)	해당 스트림의 요소가 배열일 경우, 배열의 각 요소를 주어진 함수에 인수로 전달하여, 그 반환값으로 이루어진 새로운 스트림을 반환함.
Stream<T> distinct()																해당 스트림에서 중복된 요소가 제거된 새로운 스트림을 반환함.
																					내부적으로 Object 클래스의 equals() 메소드를 사용함.

Stream<T> limit(long maxSize)							해당 스트림에서 전달된 개수만큼의 요소만으로 이루어진 새로운 스트림을 반환함.
Stream<T> peek(Consumer<? super T> action)				결과 스트림으로부터 각 요소를 소모하여 추가로 명시된 동작(action)을 수행하여 새로운 스트림을 생성하여 반환함.
Stream<T> skip(long n)									해당 스트림의 첫 번째 요소부터 전달된 개수만큼의 요소를 제외한 나머지 요소만으로 이루어진 새로운 스트림을 반환함.

Stream<T> sorted()
Stream<T> sorted(Comparator<? super T> comparator)
해당 스트림을 주어진 비교자(comparator)를 이용하여 정렬함.
비교자를 전달하지 않으면 영문사전 순(natural order)으로 정렬함.
*/
	}
}
