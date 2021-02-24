/*
# Math Ŭ����
java.lang.Math Ŭ����
Math Ŭ������ ��� �޼ҵ�� Ŭ���� �޼ҵ�(static method)�̹Ƿ�, ��ü�� �������� �ʰ� �ٷ� ���  ����

# Math.E�� Math.PI
Math.E  : ���Ϸ��� ���� �Ҹ���, �ڿ��α�(natural logarithms)�� ��(base) ������ �� 2.718�� �ǹ�
Math.PI : ���� ���ָ� �������� ���� ����(������) ������ �� 3.14159�� �ǹ�

1. random() �޼ҵ�
0.0 �̻� 1.0 �̸��� �������� ������ double�� ���� �ϳ� �����Ͽ� ��ȯ
���������� java.util ��Ű���� Random Ŭ������ ����� �ǻ� ���� �߻���(pseudorandom-number generator)�� ����Ͽ� ������ ���� ����
Math Ŭ������ random() �޼ҵ�Ӹ� �ƴ϶� java.util ��Ű���� ���Ե� Random Ŭ������ nextInt() �޼ҵ带 ����ص� ������ ���� ����

2. abs() �޼ҵ�
���޵� ���� �����̸� �� ���� ������ ��ȯ, ���޵� ���� ����̸� ���޵� ���� �״�� ��ȯ

3. floor(), ceil(), round()
floor() : �μ��� ���޹��� ���� ���ų� ���� �� �߿��� ���� ū ������ ��ȯ
ceil()  : �μ��� ���޹��� ���� ���ų� ū �� �߿��� ���� ���� ������ ��ȯ
round() : ���޹��� �Ǽ��� �Ҽ��� ù° �ڸ����� �ݿø��� ������ ��ȯ

4. max(), min()
max() : �޼ҵ�� ���޵� �� ���� ���Ͽ� ���߿��� ū ���� ��ȯ
min() : �޼ҵ�� ���߿��� ���� ���� ��ȯ

5. pow(), sqrt()
pow() : �޼ҵ�� ���޵� �� ���� double�� ���� ������ ���� ������ ����
ex) pow(a, b)�� a�� b ��
sqrt() : �޼ҵ�� ���޵� double�� ���� ������ ���� ��ȯ

6. sin(), cos(), tan()
�ﰢ �Լ��� ���õ� �پ��� ������ �����ϰ� ������ �� �ֵ��� ���� �ﰢ �Լ��� ����
sin() : ���޵� double�� ���� ���ΰ�
cos() : �ڻ��ΰ���, tan() �޼ҵ�� ź��Ʈ���� ��ȯ�մϴ�.

Math Ŭ�������� �����ϴ� �ﰢ �Լ��� ���õ� �޼ҵ�
ex) asin(), acos(), atan(), atan2(), sinh(), cosh(), tanh()

�ڹ��� �ﰢ �Լ��� ���� �޼ҵ�� ��Ȯ�� ���� ��Ÿ���� ���մϴ�.
��ǻ�Ͱ� �Ǽ��� ��Ÿ���� �� ����ϴ� �ε� �Ҽ��� ����� �Ѱ�� ��� ���� �������� �߻��ϴ� ����

7. ��ǥ���� Math �޼ҵ�
static double random()	
0.0 �̻� 1.0 �̸��� �������� ������ double�� ���� �ϳ� �����Ͽ� ��ȯ��.

static double abs(double a)
static double abs(float a)
static double abs(int a)
static double abs(long a)
���޵� ���� �����̸� �� ���� ������ ��ȯ�ϸ�, ���޵� ���� ����̸� �μ��� �״�� ��ȯ��.

static double ceil(double a)	
���޵� double�� ���� �Ҽ� �κ��� �����ϸ� �Ҽ� �κ��� ������ �ø��� ��ȯ��.

static double floor(double a)
���޵� double�� ���� �Ҽ� �κ��� �����ϸ� �Ҽ� �κ��� ������ ������ ��ȯ��.

static long round(double a)
static int round(float a)
���޵� ���� �Ҽ��� ù° �ڸ����� �ݿø��� ������ ��ȯ��.

static double rint(double a)
���޵� double�� ���� ���� ����� �������� double������ ��ȯ��.

static double max(double a, double b)
static float max(float a, float b)
static long max(long a, long b)
static int max(int a, int b)
���޵� �� ���� ���Ͽ� ū ���� ��ȯ��.

static double min(double a, double b)
static float min(float a, float b)
static long min(long a, long b)
static int min(int a, int b)
���޵� �� ���� ���Ͽ� ���� ���� ��ȯ��.

static double pow(double a, double b)	
���޵� �� ���� double�� ���� ������ ���� ������ �����Ͽ�, ab�� ��ȯ��.

static double sqrt(double a)	
���޵� double�� ���� ������ ���� ��ȯ��.

static double sin(double a)
static double cos(double a)
static double tan(double a)
���޵� double�� ���� �ش��ϴ� ������ �ﰢ �Լ����� ��ȯ��.

static double toDegrees(double angrad)
ȣ������ ���� ���� �뷫���� ���ʺй��� ���� ������ ��ȯ��.

static double toRaidans(double angdeg)
���ʺй��� ���� ���� �뷫���� ȣ������ ���� ������ ��ȯ��.
 */

import java.lang.Math;

import java.util.Random;

public class MathTest {
	public static void main(String[] args) {
		System.out.println("====================");
		System.out.println("random() �޼ҵ�");
		System.out.println("--------------------");

		System.out.println((int)(Math.random() * 100)); // 0 ~ 99
		Random ran = new Random();
		System.out.println(ran.nextInt(100));           // 0 ~ 99

		//		���� Ư�� ������ ���ϴ� ������ �����Ϸ���, ������ ���� ���� ���� ������ ������ �� �ֽ��ϴ�.
		int a =  (int)(Math.random() * 6);       // 0 ~ 5
		int b = ((int)(Math.random() * 6) + 1); // 1 ~ 6
		int c = ((int)(Math.random() * 6) + 3); // 3 ~ 8

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		System.out.println("====================");
		System.out.println("abs() �޼ҵ�");
		System.out.println("--------------------");

		System.out.println(Math.abs(10));    // 10
		System.out.println(Math.abs(-10));   // 10
		System.out.println(Math.abs(-3.14)); // 3.14

		System.out.println("====================");
		System.out.println("ceil(), floor(), round() �޼ҵ�");
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
		System.out.println("max(), min() �޼ҵ�");
		System.out.println("--------------------");

		System.out.println(Math.max(3.14, 3.14159)); // 3.14159
		System.out.println(Math.min(3.14, 3.14159)); // 3.14
		System.out.println(Math.max(-10, -11));      // -10
		System.out.println(Math.min(-10, -11));      // -11

		System.out.println("====================");
		System.out.println("pow(), sqrt() �޼ҵ�");
		System.out.println("--------------------");

		System.out.println((int)Math.pow(5, 2)); // 25
		System.out.println((int)Math.sqrt(25));  // 5

		System.out.println("====================");
		System.out.println("sin(), cos(), tan() �޼ҵ�");
		System.out.println("--------------------");

		System.out.println(Math.sin(Math.toRadians(30)));
		System.out.println(Math.sin(Math.PI / 6));

		System.out.println(Math.cos(Math.toRadians(60)));
		System.out.println(Math.cos(Math.PI / 3));

		System.out.println(Math.tan(Math.toRadians(45)));
		System.out.println(Math.tan(Math.PI / 4));
	}
}
