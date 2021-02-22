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
	}
}
