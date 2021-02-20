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

2/18
3. concat() �޼ҵ�
�ش� ���ڿ��� �ڿ� �μ��� ���޵� ���ڿ��� �߰��� ���ο� ���ڿ��� ��ȯ
(�μ��� ���޵� ���ڿ��� ���̰� 0�̸�, �ش� ���ڿ��� �״�� ��ȯ)

4. indexOf() �޼ҵ�
�ش� ���ڿ����� Ư�� ���ڳ� ���ڿ��� ó������ �����ϴ� ��ġ�� �ε��� ��ȯ
(�ش� ���ڿ��� ���޵� ���ڳ� ���ڿ��� ���ԵǾ� ���� ������ -1�� ��ȯ)
*/

/*
2/20
5. trim() �޼ҵ�
trim() : �ش� ���ڿ��� �� �հ� �� �ڿ� ���Ե� ��� ���� ���� ����
toLowerCase() : �޼ҵ�� �ش� ���ڿ��� ��� ���ڸ� �ҹ��ڷ� ��ȯ
toUpperCase() : �޼ҵ�� �ش� ���ڿ��� ��� ���ڸ� �빮�ڷ� ��ȯ


��ǥ���� String �޼ҵ�

char charAt(int index)
�ش� ���ڿ��� Ư�� �ε����� �ش��ϴ� ���ڸ� ��ȯ

int compareTo(String str)
�ش� ���ڿ��� �μ��� ���޵� ���ڿ��� ���� ���� ������ ��

int compareToIgnoreCase(String str)
�ش� ���ڿ��� �μ��� ���޵� ���ڿ��� ��ҹ��ڸ� �������� �ʰ� ���� ���� ������ ��

String concat(String str)
�ش� ���ڿ��� �ڿ� �μ��� ���޵� ���ڿ��� �߰��� ���ο� ���ڿ��� ��ȯ

int indexOf(int ch) int indexOf(String str)
�ش� ���ڿ����� Ư�� ���ڳ� ���ڿ��� ó������ �����ϴ� ��ġ�� �ε����� ��ȯ

int indexOf(int ch, int fromIndex) int indexOf(String str, int fromIndex)
�ش� ���ڿ����� Ư�� ���ڳ� ���ڿ��� ���޵� �ε��� ���Ŀ� ó������ �����ϴ� ��ġ�� �ε����� ��ȯ

int lastIndexOf(int ch)
�ش� ���ڿ����� Ư�� ���ڰ� ���������� �����ϴ� ��ġ�� �ε����� ��ȯ

int lastIndexOf(int ch, int fromIndex)
�ش� ���ڿ����� Ư�� ���ڰ� ���޵� �ε��� ���Ŀ� ���������� �����ϴ� ��ġ�� �ε����� ��ȯ

String[] split(String regex)
�ش� ���ڿ��� ���޵� ���� ǥ����(regular expression)�� ���� ������ ��ȯ

String substring(int beginIndex)
�ش� ���ڿ��� ���޵� �ε������� �������� ���ο� ���ڿ��� ��ȯ

String substring(int begin, int end)
�ش� ���ڿ��� ���޵� ���� �ε������� ������ �ε��������� ���ο� ���ڿ��� ��ȯ

String toLowerCase()
�ش� ���ڿ��� ��� ���ڸ� �ҹ��ڷ� ��ȯ

String toUpperCase()
�ش� ���ڿ��� ��� ���ڸ� �빮�ڷ� ��ȯ

String trim()
�ش� ���ڿ��� �� �հ� �� �ڿ� ���Ե� ��� ���� ���ڸ� ����

length()
�ش� ���ڿ��� ���̸� ��ȯ��.

isEmpty()
�ش� ���ڿ��� ���̰� 0�̸� true�� ��ȯ�ϰ�, �ƴϸ� false�� ��ȯ
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
		
		System.out.println("====================");
		System.out.println("trim() �޼ҵ�");
		System.out.println("--------------------");

		String trimTest = new String(" Java     ");
		System.out.println("���� ���ڿ� : " + trimTest);
		System.out.println(trimTest + '|');
		System.out.println(trimTest.trim() + '|');
		System.out.println("trim() �޼ҵ� ȣ�� �� ���� ���ڿ� : " + trimTest);

		String str = new String("Java");
		System.out.println("\n���� ���ڿ� : " + str);
		System.out.println("toLowerCase() : " + str.toLowerCase());
		System.out.println("toUpperCase() : " + str.toUpperCase());
		System.out.println("�� �޼ҵ� ȣ�� �� ���� ���ڿ� : " + str);
	}
}