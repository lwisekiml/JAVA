/*
# Math 클래스
java.lang.Math 클래스
Math 클래스의 모든 메소드는 클래스 메소드(static method)이므로, 객체를 생성하지 않고도 바로 사용  가능

# Math.E와 Math.PI
Math.E  : 오일러의 수라 불리며, 자연로그(natural logarithms)의 밑(base) 값으로 약 2.718을 의미
Math.PI : 원의 원주를 지름으로 나눈 비율(원주율) 값으로 약 3.14159를 의미

1. random() 메소드
0.0 이상 1.0 미만의 범위에서 임의의 double형 값을 하나 생성하여 반환
내부적으로 java.util 패키지의 Random 클래스를 사용한 의사 난수 발생기(pseudorandom-number generator)를 사용하여 임의의 수를 생성
Math 클래스의 random() 메소드뿐만 아니라 java.util 패키지에 포함된 Random 클래스의 nextInt() 메소드를 사용해도 난수를 생성 가능

2. abs() 메소드
전달된 값이 음수이면 그 값의 절댓값을 반환, 전달된 값이 양수이면 전달된 값을 그대로 반환

3. floor(), ceil(), round()
floor() : 인수로 전달받은 값과 같거나 작은 수 중에서 가장 큰 정수를 반환
ceil()  : 인수로 전달받은 값과 같거나 큰 수 중에서 가장 작은 정수를 반환
round() : 전달받은 실수를 소수점 첫째 자리에서 반올림한 정수를 반환

4. max(), min()
max() : 메소드는 전달된 두 값을 비교하여 그중에서 큰 값을 반환
min() : 메소드는 그중에서 작은 값을 반환

5. pow(), sqrt()
pow() : 메소드는 전달된 두 개의 double형 값을 가지고 제곱 연산을 수행
ex) pow(a, b)는 a의 b 승
sqrt() : 메소드는 전달된 double형 값의 제곱근 값을 반환

6. sin(), cos(), tan()
삼각 함수와 관련된 다양한 연산을 간편하게 수행할 수 있도록 많은 삼각 함수를 제공
sin() : 전달된 double형 값의 사인값
cos() : 코사인값을, tan() 메소드는 탄제트값을 반환합니다.

Math 클래스에서 제공하는 삼각 함수와 관련된 메소드
ex) asin(), acos(), atan(), atan2(), sinh(), cosh(), tanh()

자바의 삼각 함수에 관한 메소드는 정확한 값을 나타내지 못합니다.
컴퓨터가 실수를 나타내는 데 사용하는 부동 소수점 방식의 한계로 모든 언어에서 공통으로 발생하는 문제

7. 대표적인 Math 메소드
static double random()	
0.0 이상 1.0 미만의 범위에서 임의의 double형 값을 하나 생성하여 반환함.

static double abs(double a)
static double abs(float a)
static double abs(int a)
static double abs(long a)
전달된 값이 음수이면 그 값의 절댓값을 반환하며, 전달된 값이 양수이면 인수를 그대로 반환함.

static double ceil(double a)	
전달된 double형 값의 소수 부분이 존재하면 소수 부분을 무조건 올리고 반환함.

static double floor(double a)
전달된 double형 값의 소수 부분이 존재하면 소수 부분을 무조건 버리고 반환함.

static long round(double a)
static int round(float a)
전달된 값을 소수점 첫째 자리에서 반올림한 정수를 반환함.

static double rint(double a)
전달된 double형 값과 가장 가까운 정수값을 double형으로 반환함.

static double max(double a, double b)
static float max(float a, float b)
static long max(long a, long b)
static int max(int a, int b)
전달된 두 값을 비교하여 큰 값을 반환함.

static double min(double a, double b)
static float min(float a, float b)
static long min(long a, long b)
static int min(int a, int b)
전달된 두 값을 비교하여 작은 값을 반환함.

static double pow(double a, double b)	
전달된 두 개의 double형 값을 가지고 제곱 연산을 수행하여, ab을 반환함.

static double sqrt(double a)	
전달된 double형 값의 제곱근 값을 반환함.

static double sin(double a)
static double cos(double a)
static double tan(double a)
전달된 double형 값에 해당하는 각각의 삼각 함숫값을 반환함.

static double toDegrees(double angrad)
호도법의 라디안 값을 대략적인 육십분법의 각도 값으로 변환함.

static double toRaidans(double angdeg)
육십분법의 각도 값을 대략적인 호도법의 라디안 값으로 변환함.
 */

import java.lang.Math;

import java.util.Random;

public class MathTest {
	public static void main(String[] args) {
		System.out.println("====================");
		System.out.println("random() 메소드");
		System.out.println("--------------------");

		System.out.println((int)(Math.random() * 100)); // 0 ~ 99
		Random ran = new Random();
		System.out.println(ran.nextInt(100));           // 0 ~ 99

		//		만약 특정 범위에 속하는 난수를 생성하려면, 다음과 같이 난수 생성 범위를 조절할 수 있습니다.
		int a =  (int)(Math.random() * 6);       // 0 ~ 5
		int b = ((int)(Math.random() * 6) + 1); // 1 ~ 6
		int c = ((int)(Math.random() * 6) + 3); // 3 ~ 8

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		System.out.println("====================");
		System.out.println("abs() 메소드");
		System.out.println("--------------------");

		System.out.println(Math.abs(10));    // 10
		System.out.println(Math.abs(-10));   // 10
		System.out.println(Math.abs(-3.14)); // 3.14

		System.out.println("====================");
		System.out.println("ceil(), floor(), round() 메소드");
		System.out.println("--------------------");

		System.out.println(Math.ceil(10.0));      // 10.0
		System.out.println(Math.ceil(10.1));      // 11.0
		System.out.println(Math.ceil(10.000001)); // 11.0

		System.out.println(Math.floor(10.0));     // 10.0
		System.out.println(Math.floor(10.9));     // 10.0

		System.out.println(Math.round(10.0));     // 10
		System.out.println(Math.round(10.4));     // 10
		System.out.println(Math.round(10.5));     // 11

		System.out.println("====================");
		System.out.println("max(), min() 메소드");
		System.out.println("--------------------");

		System.out.println(Math.max(3.14, 3.14159)); // 3.14159
		System.out.println(Math.min(3.14, 3.14159)); // 3.14
		System.out.println(Math.max(-10, -11));      // -10
		System.out.println(Math.min(-10, -11));      // -11

		System.out.println("====================");
		System.out.println("pow(), sqrt() 메소드");
		System.out.println("--------------------");

		System.out.println((int)Math.pow(5, 2)); // 25
		System.out.println((int)Math.sqrt(25));  // 5

		System.out.println("====================");
		System.out.println("sin(), cos(), tan() 메소드");
		System.out.println("--------------------");

		System.out.println(Math.sin(Math.toRadians(30)));
		System.out.println(Math.sin(Math.PI / 6));

		System.out.println(Math.cos(Math.toRadians(60)));
		System.out.println(Math.cos(Math.PI / 3));

		System.out.println(Math.tan(Math.toRadians(45)));
		System.out.println(Math.tan(Math.PI / 4));
	}
}
