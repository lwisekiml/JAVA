/*
# StringBuffer Ŭ����
java.lang.StringBuffer Ŭ����
StringBuffer Ŭ������ �ν��Ͻ��� �� ���� ������ ���� �ְ�, �߰� ����
(String Ŭ������ �ν��Ͻ��� �� �� �����Ǹ� �� ���� �б⸸ �� �� �ְ�, ����X)

StringBuffer Ŭ������ ���������� ����(buffer)��� �ϴ� �������� ������ ����
���� ũ���� �⺻���� 16���� ���ڸ� ������ �� �ִ� ũ���̸�, �����ڸ� ���� �� ũ�⸦ ������ ���� ����
�ν��Ͻ� ���� �� ����ڰ� ������ ũ�⺸�� ������ 16���� ���ڸ� �� ������ �� �ֵ��� ���� �ִ� ũ��� ���� ��

����(+) �����ڸ� �̿��� String �ν��Ͻ��� ���ڿ��� �����ϸ�, ������ ������ ���ο� String �ν��Ͻ��� ����
���ڿ��� ���� �����ϸ� �����Ҽ��� ������ ����Ӹ� �ƴ϶� �ӵ� ���� �ſ� �������� ��

StringBuffer �ν��Ͻ��� ����ϸ� ���ڿ��� �ٷ� �߰��� �� �����Ƿ�, ������ ���� ������ �ӵ��� �ſ� ������
(�̷��� StringBuffer Ŭ������ java.lang ��Ű���� ���ԵǾ� ���� ��)

# �Һ� Ŭ����(immutable class)�� ���� Ŭ����(mutable class)
�Һ� Ŭ����(immutable class) : String Ŭ������ ���� �ν��Ͻ��� �� �� �����Ǹ� �� ���� ������ �� ���� Ŭ����
���� Ŭ����(mutable class) : StringBuffer Ŭ������ ���� �����Ӱ� �ν��Ͻ��� ���� ������ �� �ִ� Ŭ����
String Ŭ������ ���� �Һ� Ŭ������ StringBuffer Ŭ������ append()�� insert() �޼ҵ�� ���� ���� �����ϴ� set �޼ҵ带 ����X

�Һ� Ŭ������ ����ϴ� ������ ��Ƽ ������ ȯ�濡�� ��ü�� ��ȭ�Ǵ� ��Ȳ�̶�� �Һ� �ν��Ͻ��� ����ϴ� ���� �� �� �ŷ��� �� �ִ� �ڵ带 �ۼ��� �� �ֱ� ����
�ϳ��� ��ü�� �����ϸ鼭 ������ ��ü�� ���� ������ �־�� �� �Ǵ� ��쿡 �Һ� �ν��Ͻ��� ����ϸ� ���� ������ �ʴ´ٴ� ���� ���� ��

# ��ǥ���� StringBuffer �޼ҵ�
StringBuffer append(boolean b)
StringBuffer append(char c)
StringBuffer append(char[] str)
StringBuffer append(CharSequence s)
StringBuffer append(double d)
StringBuffer append(float f)
StringBuffer append(int i)
StringBuffer append(long lng)
StringBuffer append(Object obj)
StringBuffer append(String str)
StringBuffer append(StringBuffer sb)
�μ��� ���޵� ���� ���ڿ��� ��ȯ�� ��, �ش� ���ڿ��� �������� �߰���.

int capacity()	
���� ���� ũ�⸦ ��ȯ��.

StringBuffer delete(int start, int end)	
���޵� �ε����� �ش��ϴ� �κ� ���ڿ��� �ش� ���ڿ����� ������.

StringBuffer deleteCharAt(int index)
���޵� �ε����� �ش��ϴ� ���ڸ� �ش� ���ڿ����� ������.

StringBuffer insert(int offset, boolean b)
StringBuffer insert(int offset, char c)
StringBuffer insert(int offset, char[] str)
StringBuffer insert(int offset, CharSequence s)
StringBuffer insert(int offset, double d)
StringBuffer insert(int offset, float f)
StringBuffer insert(int offset, int i)
StringBuffer insert(int offset, long lng)
StringBuffer insert(int offset, Object obj)
StringBuffer insert(int offset, String str)
�μ��� ���޵� ���� ���ڿ��� ��ȯ�� ��, �ش� ���ڿ��� ������ �ε��� ��ġ�� �߰���.

StringBuffer reverse()
�ش� ���ڿ��� �ε����� �������� ��迭��.
*/

public class StringBufferTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("====================");
		System.out.println("append() �޼ҵ�");
//		1. append() �޼ҵ�
//		�μ��� ���޵� ���� ���ڿ��� ��ȯ�� ��, �ش� ���ڿ��� �������� �߰� ��
//		String Ŭ������ concat() �޼ҵ�� ���� ����� ��ȯ������, �������� ó�� �ӵ��� �ξ� ����
		System.out.println("--------------------");

		StringBuffer appendTest = new StringBuffer("Java");
		System.out.println("���� ���ڿ� : " + appendTest);
		System.out.println(appendTest.append("����"));
		System.out.println("append() �޼ҵ� ȣ�� �� ���� ���ڿ� : " + appendTest);

		System.out.println("====================");
		System.out.println("capacity() �޼ҵ�");
//		2. capacity() �޼ҵ�
//		StringBuffer �ν��Ͻ��� ���� ���� ũ�⸦ ��ȯ
//		���̰� 4�� ���ڿ��� StringBuffer �ν��Ͻ��� �����ϸ�, �⺻������ �����Ǵ� ���� ���� ũ���� 16�� ������ ������ 4�� ���� �� 20���� ���ڸ� ������ �� �ִ� ���۰� �����Ǵ� ���� Ȯ���� �� ����
		System.out.println("--------------------");

		StringBuffer capacityTest1 = new StringBuffer();
		StringBuffer capacityTest2 = new StringBuffer("Java");
		System.out.println(capacityTest1.capacity());
		System.out.println(capacityTest2.capacity());

		System.out.println("====================");
		System.out.println("delete() �޼ҵ�");
//		3. delete() �޼ҵ�
//		���޵� �ε����� �ش��ϴ� �κ� ���ڿ��� �ش� ���ڿ����� ����
//		deleteCharAt() �޼ҵ带 ����ϸ� Ư�� ��ġ�� ���� �� ������ ����  ����
		System.out.println("--------------------");
		
		StringBuffer deleteTest = new StringBuffer("Java Oracle");
		System.out.println("���� ���ڿ� : " + deleteTest);

		System.out.println(deleteTest.delete(4, 8)); //�� 
		System.out.println(deleteTest.deleteCharAt(1));
		System.out.println("deleteCharAt() �޼ҵ� ȣ�� �� ���� ���ڿ� : " + deleteTest);

//		��� ���ο��� delete() �޼ҵ带 ����Ͽ� �ش� ���ڿ����� �ε����� 4�� ��ġ�� ���ں��� 7�� ��ġ�� ���ڱ����� ����

		System.out.println("====================");
		System.out.println("insert() �޼ҵ�");
//		4. insert() �޼ҵ�
//		�μ��� ���޵� ���� ���ڿ��� ��ȯ�� ��, �ش� ���ڿ��� ������ �ε��� ��ġ�� �߰�
//		���޵� �ε����� �ش� ���ڿ��� ���̿� ������, append() �޼ҵ�� ���� ����� ��ȯ
		System.out.println("--------------------");
		
		StringBuffer insertTest = new StringBuffer("Java ����!!");
		System.out.println("���� ���ڿ� : " + insertTest);

		System.out.println(insertTest.insert(4, "Script")); //��
		System.out.println("insert() �޼ҵ� ȣ�� �� ���� ���ڿ� : " + insertTest);

//		��� ���ο����� insert() �޼ҵ带 ����Ͽ� �ش� ���ڿ����� �ε����� 4�� ��ġ���� �� ��° �Ű������� ���޵� ���ڿ��� �߰�
	}
}
