/* 2/17
String Ŭ����

�ڹٿ����� ���ڿ��� ���� String�̶�� Ŭ������ ������ ������
String Ŭ�������� ���ڿ��� ���õ� �۾��� �� �� �����ϰ� ����� �� �ִ� �پ��� �޼ҵ尡 ����
String Ŭ������ java.lang ��Ű���� ���ԵǾ� ����(java.lang.String Ŭ����)

String �ν��Ͻ��� �� �� �����Ǹ� �� ���� �б⸸ �� �� �ְ�, ����X(�̷��� ��ü�� �ڹٿ����� �Һ� ��ü(immutable object)��� ��) 
��, �ڹٿ��� ����(+) �����ڸ� �̿��Ͽ� ���ڿ� ������ �����ϸ�, ���� ���ڿ��� ������ ����Ǵ� ���� �ƴ϶� ������ ������ ���ο� String �ν��Ͻ��� �����Ǵ� ��

1. charAt() �޼ҵ�
�ش� ���ڿ��� Ư�� �ε����� �ش��ϴ� ���ڸ� ��ȯ
�ش� ���ڿ��� ���̺��� ū �ε����� ���� ���޽� IndexOutOfBoundsException ������ �߻�

2. compareTo() �޼ҵ�
�ش� ���ڿ��� �μ��� ���޵� ���ڿ��� ���� ���� ������ ��
��ҹ��ڸ� �����Ͽ� ��
�� ���ڿ��� ���ٸ� 0�� ��ȯ
�ش� ���ڿ��� �μ��� ���޵� ���ڿ����� ������ ����, ũ�� ��� ��ȯ

���� �� ��ҹ��ڸ� ����X : compareToIgnoreCase()
*/
public class StringTest {
	public static void main(String[] args) {
		System.out.println("====================");
		System.out.println("charAt() �޼ҵ�");
		System.out.println("--------------------");

		String charAtTest = new String("Java");
		System.out.println("���� ���ڿ� : " + charAtTest);

		for (int i = 0; i < charAtTest.length(); i++) {
			System.out.print(charAtTest.charAt(i) + " ");
		}
		System.out.println("\ncharAt() �޼ҵ� ȣ�� �� ���� ���ڿ� : " + charAtTest);
		
		System.out.println("====================");
		System.out.println("compareTo() �޼ҵ�");
		System.out.println("--------------------");

		String compareTest = new String("abcd");
		System.out.println("���� ���ڿ� : " + compareTest);

		System.out.println(compareTest.compareTo("bcef"));
		System.out.println(compareTest.compareTo("abcd") + "\n");

		System.out.println(compareTest.compareTo("Abcd"));
		System.out.println(compareTest.compareToIgnoreCase("Abcd"));
		System.out.println("compareTo() �޼ҵ� ȣ�� �� ���� ���ڿ� : " + compareTest);
		System.out.println("====================");
	}
}