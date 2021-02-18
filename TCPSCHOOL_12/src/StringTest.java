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

3. concat() �޼ҵ�
�ش� ���ڿ��� �ڿ� �μ��� ���޵� ���ڿ��� �߰��� ���ο� ���ڿ��� ��ȯ
(�μ��� ���޵� ���ڿ��� ���̰� 0�̸�, �ش� ���ڿ��� �״�� ��ȯ)

4. indexOf() �޼ҵ�
�ش� ���ڿ����� Ư�� ���ڳ� ���ڿ��� ó������ �����ϴ� ��ġ�� �ε��� ��ȯ
(�ش� ���ڿ��� ���޵� ���ڳ� ���ڿ��� ���ԵǾ� ���� ������ -1�� ��ȯ)
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
		System.out.println("concat() �޼ҵ�");
		System.out.println("--------------------");

		String concatTest = new String("Java");
		System.out.println("���� ���ڿ� : " + concatTest);
		System.out.println(concatTest.concat("����"));
		System.out.println("concat() �޼ҵ� ȣ�� �� ���� ���ڿ� : " + concatTest);
		
		System.out.println("====================");
		System.out.println("indexOf() �޼ҵ�");
		System.out.println("--------------------");
		
		String indexOfTest = new String("Oracle Java");
		System.out.println("���� ���ڿ� : " + indexOfTest);
		System.out.println(indexOfTest.indexOf('o'));
		System.out.println(indexOfTest.indexOf('a'));
		System.out.println(indexOfTest.indexOf("Java"));
		System.out.println("indexOf() �޼ҵ� ȣ�� �� ���� ���ڿ� : " + indexOfTest);
	}
}