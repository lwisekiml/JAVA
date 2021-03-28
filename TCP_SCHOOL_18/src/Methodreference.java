import java.util.function.DoubleUnaryOperator;

public class Methodreference {
	public static void main(String[] args) {
/*
# �޼ҵ� ����
�޼ҵ� ����(method reference)
���� ǥ������ �� �ϳ��� �޼ҵ常�� ȣ���ϴ� ��쿡 �ش� ���� ǥ���Ŀ��� ���ʿ��� �Ű������� �����ϰ� ����� �� �ֵ��� ���ָ�
���ʿ��� �Ű������� �����ϰ� ������ ���� '::' ��ȣ�� ����Ͽ� ǥ�� ����

����
Ŭ�����̸�::�޼ҵ��̸�

�Ǵ�
���������̸�::�޼ҵ��̸�

�� ���� ���� ���޹޾� ���� ������ �����ϴ� Math Ŭ������ Ŭ���� �޼ҵ��� pow() �޼ҵ带 ȣ���ϴ� ���� ǥ����
����
(base, exponent) -> Math.pow(base, exponent);

�ܼ��� Math Ŭ������ pow() �޼ҵ�� �μ��� �����ϴ� ���Ҹ� �ϹǷ�, �޼ҵ� ������ ����Ͽ� ������ ���� ������ ǥ�� ����
����
Math::pow;

Ư�� �ν��Ͻ��� �޼ҵ带 ������ ������ ���� ������ �̸��� ���� �޼ҵ� ���� ��� ����
����
MyClass obj = new MyClass;
Function<String, Boolean> func = (a) -> obj.equals(a); // ���� ǥ����
Function<String, Boolean> func = obj::equals(a);       // �޼ҵ� ����

���� ǥ���İ� �޼ҵ� ������ ���ϴ� ����
*/
		DoubleUnaryOperator oper;

		oper = (n) -> Math.abs(n); // ���� ǥ����
		System.out.println(oper.applyAsDouble(-5));

		oper = Math::abs; // �޼ҵ� ����
		System.out.println(oper.applyAsDouble(-5));
		
/*
# ������ ����
�����ڸ� ȣ���ϴ� ���� ǥ���ĵ� �ռ� ���캻 �޼ҵ� ������ �̿��� �� ����
�ܼ��� ��ü�� �����ϰ� ��ȯ�ϴ� ���� ǥ������ ������ ������ ��ȯ�� �� ����

�ܼ��� ��ü�� �����ϰ� ��ȯ�ϴ� ���� ǥ����
����
(a) -> { return new Object(a); }

���� ���� �ܼ��� Object Ŭ������ �ν��Ͻ��� �����ϰ� ��ȯ�ϱ⸸ �ϹǷ�, ������ ������ ����Ͽ� ������ ���� ������ ǥ���� �� ����
����
Object::new;

�̶� �ش� �����ڰ� �������� ������ ������ �� ������ �߻��մϴ�.

�迭�� ������ ������ ������ ���� ������ ������ ����� �� ����
����
Function<Integer, double[]> func1 = a -> new double[a]; // ���� ǥ����
Function<Integer, double[]> func2 = double[]::new;      // ������ ����	
*/
	}
}
