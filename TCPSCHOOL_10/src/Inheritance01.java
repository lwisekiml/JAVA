/*
���(inheritance)�̶�?
������ Ŭ������ ����� �߰��ϰų� �������Ͽ� ���ο� Ŭ������ �����ϴ� ���� �ǹ�

1. ������ �ۼ��� Ŭ������ ��Ȱ�� ����
2. �ڽ� Ŭ���� ���� �� �ߺ��Ǵ� ����� �̸� �θ� Ŭ������ �ۼ��� ������, �ڽ� Ŭ���������� �ش� ����� �ۼ����� �ʾƵ� ��
3. Ŭ���� ���� ������ ���踦 ���������ν� �������� ������ ��� ����

�ڽ� Ŭ��������
�θ� Ŭ������ �ʵ�, �޼ҵ常�� ���
������, �ʱ�ȭ ����� ���X

�θ� Ŭ������ ���� ��� private�̳� default�� ������ ����� ��ӹ����� ����X
*/
class Parent {
	private int a = 10;
	public int b = 20;
}

class Child extends Parent {
	public int c = 30;
	void display() {
		// System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
public class Inheritance01 {
	public static void main(String[] args) {
		Child ch = new Child();
		ch.display();
	}

}
