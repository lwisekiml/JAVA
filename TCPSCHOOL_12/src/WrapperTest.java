/*
1. Wrapper Ŭ����
���α׷��� ���� �⺻ Ÿ���� �����͸� ��ü�� ����ؾ� �ϴ� ���
(�޼ҵ��� �μ��� ��ü Ÿ�Ը��� �䱸�Ǹ�, �⺻ Ÿ���� �����͸� �״�� ����� �� ����)
�⺻ Ÿ���� �����͸� ���� ��ü�� ��ȯ�� �� �۾��� ����

Wrapper class : 8���� �⺻ Ÿ�Կ� �ش��ϴ� �����͸� ��ü�� ������ �ִ� Ŭ����

������ Ÿ�Կ� �ش��ϴ� �����͸� �μ��� ���޹޾�, �ش� ���� ������ ��ü�� �����  ��
java.lang ��Ű���� ���ԵǾ� ����

�⺻ Ÿ�Կ� �����Ͽ� �����ϰ� �ִ� ���� Ŭ����
�⺻ Ÿ��	���� Ŭ����
byte	Byte
short	Short
int		Integer
long	Long
float	Float
double	Double
char	Character
boolean	Boolean

���� Ŭ����(Wrapper class)�� ��� ������ ���� ���ǵ� Ŭ������ �ƴϹǷ�, �ν��Ͻ��� ����� ���� ������ �� �����ϴ�.
����, ���� �����ϱ� ���� ���ο� �ν��Ͻ��� �����ϰ�, ������ �ν��Ͻ��� ������ ������ �� �ֽ��ϴ�.

2. �ڽ�(Boxing)�� ��ڽ�(UnBoxing)
�ڽ�(Boxing)   : �⺻ Ÿ���� �����͸� ���� Ŭ������ �ν��Ͻ��� ��ȯ�ϴ� ����
��ڽ�(UnBoxing): ���� Ŭ������ �ν��Ͻ��� ����� ���� �ٽ� �⺻ Ÿ���� �����ͷ� ������ ����

3. ���� �ڽ�(AutoBoxing)�� ���� ��ڽ�(AutoUnBoxing)
JDK 1.5���ʹ� �ڽ̰� ��ڽ��� �ʿ��� ��Ȳ���� �ڹ� �����Ϸ��� �̸� �ڵ����� ó��
�ڵ�ȭ�� �ڽ̰� ��ڽ��� ���� �ڽ�(AutoBoxing)�� ���� ��ڽ�(AutoUnBoxing)�̶�� �θ�
 */
public class WrapperTest {
	public static void main(String[] args) {
		//���� Ŭ������ Interger Ŭ������ Character Ŭ�������� ���� ��ڽ��� ���� intValue() �޼ҵ�� charValue() �޼ҵ尡 ����
		//���� �ڽ��� �̿��ϸ� new Ű���带 ������� �ʰ� �ڵ����� Character �ν��Ͻ��� ����
		//charValue() �޼ҵ带 ������� �ʰ�, ���� ��ڽ��� �̿��Ͽ� �ν��Ͻ��� ����� ���� �ٷ� ���� ����
		Integer num = new Integer(17); // �ڽ�
		int n = num.intValue();        // ��ڽ�
		System.out.println(n);

		Character ch = 'X'; // Character ch = new Character('X'); : ����ڽ�
		char c = ch;        // char c = ch.charValue();           : �����ڽ�
		System.out.println(c);

		//���� ����ó�� ���� �ڽ̰� ���� ��ڽ��� ���� �⺻ Ÿ�԰� ���� Ŭ���� ���� �پ��� ���굵 ����
		Integer num1 = new Integer(7); // �ڽ�
		Integer num2 = new Integer(3); // �ڽ�

		int int1 = num1.intValue();    // ��ڽ�
		int int2 = num2.intValue();    // ��ڽ�

		Integer result1 = num1 + num2; // 10 ��
		Integer result2 = int1 - int2; // 4 ��
		int result3 = num1 * int2;     // 21 ��
		//������� ��� ���α����� ������ ���������� ���� Ŭ������ �ǿ����ڸ� �����ڽ��Ͽ� �⺻ Ÿ�Գ����� ������ �����ϰ� �ִ� ��

		Integer n1 = new Integer(10);
		Integer n2 = new Integer(20);
		Integer n3 = new Integer(10);

		System.out.println(n1 < n2);       // true
		System.out.println(n1 == n3);      // false ��
		System.out.println(n1.equals(n3)); // true ��
/*
���� Ŭ������ �� ���굵 �����ڽ��� ���� ������������, �ν��Ͻ��� ����� ���� ���� ���� �Ǵ��� ��� ����ó�� �� �������� ���� ������(==)�� ����ؼ��� �� �Ǹ�,
��� ����ó�� equals() �޼ҵ带 ����ؾ߸� ��

���� Ŭ������ ��ü�̹Ƿ� ���� ������(==)�� ����ϰ� �Ǹ�, �� �ν��Ͻ��� ���� ���ϴ� ���� �ƴ϶� �� �ν��Ͻ��� �ּҰ��� ��
���� �ٸ� �� �ν��Ͻ��� ���� ������(==)�� ���ϰ� �Ǹ�, ������ false ���� ��ȯ
�ν��Ͻ��� ����� ���� ���� ���θ� ��Ȯ�� �Ǵ��Ϸ��� equals() �޼ҵ带 ���
*/
	}
}