import java.util.Arrays;

public class ArraysTest {
	public static void main(String[] args) {
/*
# Arrays 클래스
java.util 패키지
java.util 패키지는 import 문으로 패키지를 불러오고 나서야 클래스 이름만으로 사용할 수  있음

# java.util.Arrays 클래스
배열을 다루기 위한 다양한 메소드 포함
Arrays 클래스의 모든 메소드는 클래스 메소드(static method)이므로, 객체를 생성하지 않고도 바로 사용 가능

1. binarySearch() 메소드
전달받은 배열에서 특정 객체의 위치를 이진 검색 알고리즘을 사용하여 검색한 후, 해당 위치를 반환
이진 검색 알고리즘을 사용하므로, 매개변수로 전달되는 배열이 미리 정렬되어 있어야만 제대로 동작
*/
		System.out.println("--- binarySearch() ---");
		int[] arr = new int[1000];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}

		System.out.println(Arrays.binarySearch(arr, 437));
/*
2. copyOf() 메소드
전달받은 배열의 특정 길이만큼을 새로운 배열로 복사하여 반환
첫 번째 매개변수로 원본 배열을 전달받고, 두 번째 매개변수로 원본 배열에서 새로운 배열로 복사할 요소의 개수를 전달 받음
원본 배열과 같은 타입의 복사된 새로운 배열을 반환
새로운 배열의 길이가 원본 배열보다 길면, 나머지 요소는 배열 요소의 타입에 맞게 다음과 같은 기본값으로 채움

배열 요소의 타입	기본값
char				'\u0000'
byte, short, int	0
long				0L
float				0.0F
double				0.0 또는 0.0D
boolean				false
배열, 인스턴스 등		null
*/
		System.out.println("--- copyOf() ---");
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = Arrays.copyOf(arr1, 3);// ①

		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}

		System.out.println();

		int[] arr3 = Arrays.copyOf(arr1, 10);// ②
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}

		System.out.println();
/*
①번 라인에서는 copyOf() 메소드를 사용하여 배열 arr1의 첫 번째 배열 요소부터 3개의 요소를 복사하여 배열 arr2에 대입
②번 라인에서는 배열 arr1에서 10개의 배열 요소를 복사하여 배열 arr3에 대입하려고 함
하지만 배열 arr1의 길이가 5밖에 안되므로, 배열 arr3의 나머지 배열 요소에는 int형의 기본값인 0이 채워짐


3. copyOfRange() 메소드
전달받은 배열의 특정 범위에 해당하는 요소만을 새로운 배열로 복사하여 반환
첫 번째 매개변수로 복사의 대상이 될 원본 배열을 전달 받음
두 번째 매개변수로는 원본 배열에서 복사할 시작 *인덱스*를 전달받고, 세 번째 매개변수로는 마지막으로 복사될 배열 요소의 바로 다음 인덱스를 전달 받음
세 번째 매개변수로 전달된 인덱스 바로 전까지의 배열 요소까지만 복사 됨
원본 배열과 같은 타입의 복사된 새로운 배열을 반환
*/
		System.out.println("--- copyOfRange() ---");
		int[] ar1 = {1, 2, 3, 4, 5};

		int[] ar2 = Arrays.copyOfRange(ar1, 2, 4);
		for (int i = 0; i < ar2.length; i++) {
			System.out.print(ar2[i] + " ");
		}
		System.out.println();
/*
4. fill() 메소드
전달받은 배열의 모든 요소를 특정 값으로 초기화
첫 번째 매개변수로 초기화할 배열을 전달받고, 두 번째 매개변수로 초기값을 전달 받음
이 메소드는 전달받은 원본 배열의 값을 변경하게 됨
*/
		System.out.println("--- fill() ---");
		int[] ar = new int[10];

		Arrays.fill(ar, 7);
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println();
/*
5. sort() 메소드
전달받은 배열의 모든 요소를 오름차순으로 정렬
매개변수로 정렬할 배열을 전달받으며, 전달받은 원본 배열의 순서를 변경 함
*/
		System.out.println("--- sort() ---");
		int[] a = {5, 3, 4, 1, 2};

		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
/*
5. 대표적인 Arrays 메소드

메소드	설명
static <T> List<T> asList(T... a)	
전달받은 배열을 고정 크기의 리스트(list)로 변환하여 반환함.

static int binarySearch(Object[] a, Object key)
전달받은 배열에서 특정 객체를 이진 검색 알고리즘을 사용하여 검색한 후, 그 위치를 반환함.

static <T> T[] copyOf(T[] original, int newLength)	
전달받은 배열을 특정 길이의 새로운 배열로 복사하여 반환함.

static <T> T[] copyOfRange(T[] original, int from, int to)	
전달받은 배열의 특정 범위에 해당하는 요소만을 새로운 배열로 복사하여 반환함.

static boolean equals(Object[] a, Object[] a2)
전달받은 두 배열이 같은지를 확인함.

static void fill(Object[] a, Object val)	
전달받은 배열의 모든 요소를 특정 값으로 초기화함.

static void sort(Object[] a)	
전달받은 배열의 모든 요소를 오름차순으로 정렬함.
		 */
	}
}
