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
	}
}
