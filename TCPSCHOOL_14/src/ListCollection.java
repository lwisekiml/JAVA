import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class ListCollection {
	public static void main(String[] args) {
/*
# List �÷��� Ŭ����
List �������̽��� ������ ��� List �÷��� Ŭ������ ������ ���� Ư¡�� ����
1. ����� ���� ���� ����
2. ���� ����� �ߺ� ������ ��� 

��ǥ���� List �÷��� Ŭ������ ���ϴ� Ŭ����
1. ArrayList<E>
2. LinkedList<E>
3. Vector<E>
4. Stack<E>i

# ArrayList<E> Ŭ����
JDK 1.2���� ������ ArrayList Ŭ������ ���������� �迭�� �̿��Ͽ� ��Ҹ� ����
�迭�� ũ�⸦ ������ �� ���� �ν��Ͻ��̹Ƿ�, ũ�⸦ �ø��� ���ؼ��� ���ο� �迭�� �����ϰ� ������ ��ҵ��� �Űܾ� �ϴ� ������ ������ ���ľ� ��
�� ������ �ڵ����� ���������, ����� �߰� �� ���� �۾��� �ɸ��� �ð��� �ſ� ������� ������ ����

�ڹ��� Collections Ŭ������ JDK 1.2���� �����Ǵ� �÷��ǿ��� �����ϰų� �÷����� ��ȯ�ϴ� Ŭ���� �޼ҵ�(static method)������ ������ Ŭ����
�ڹ��� Collection�� �������̽��̸�, Collections�� Ŭ�������� �����ؾ� ��
*/
		System.out.println("--- ArrayList ---");
		ArrayList<Integer> arrList = new ArrayList<Integer>();

		// add() �޼ҵ带 �̿��� ����� ����
		arrList.add(40);
		arrList.add(20);
		arrList.add(30);
		arrList.add(10);

		// for ���� get() �޼ҵ带 �̿��� ����� ���
		for (int i = 0; i < arrList.size(); i++) {
			System.out.print(arrList.get(i) + " ");
		}
		System.out.println();

		// remove() �޼ҵ带 �̿��� ����� ����
		arrList.remove(1);

		// Enhanced for ���� get() �޼ҵ带 �̿��� ����� ���
		for (int e : arrList) {
			System.out.print(e + " ");
		}
		System.out.println();

		// Collections.sort() �޼ҵ带 �̿��� ����� ����
		Collections.sort(arrList);

		// iterator() �޼ҵ�� get() �޼ҵ带 �̿��� ����� ���
		Iterator<Integer> iter = arrList.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		System.out.println();

		// set() �޼ҵ带 �̿��� ����� ����
		arrList.set(0, 20);

		for (int e : arrList) {
			System.out.print(e + " ");
		}
		System.out.println();

		// size() �޼ҵ带 �̿��� ����� �� ����
		System.out.println("����Ʈ�� ũ�� : " + arrList.size());
/*
# LinkedList<E> Ŭ����
ArrayList Ŭ������ �迭�� �̿��Ͽ� ��Ҹ� ���������ν� �߻��ϴ� ������ �غ��ϱ� ���� ��� ��
JDK 1.2���� ������ LinkedList Ŭ������ ���������� ���� ����Ʈ(linked list)�� �̿��Ͽ� ��Ҹ� ����

���� ����Ʈ�� ����� ��Ұ� ����������� �����Ǹ�, �̷��� ��ҵ� ���̸� ��ũ(link)�� �����Ͽ� ����
���� ��Ҹ� ����Ű�� �������� ������ ���� ����Ʈ�� ���� ���� ����Ʈ(singly linked list)��� ��


1. ���� ���� ����Ʈ
�̷��� ���� ���� ����Ʈ�� ����� ����� ���� �۾��� ���� ��Ҹ� ����Ű�� ������ �����ϸ� �ǹǷ�, ���� ������ ó���� �� �ֽ��ϴ�.
������ ���� ���� ����Ʈ�� ���� ��ҿ��� ���� ��ҷ� �����ϱⰡ �ſ� ��ƽ��ϴ�.
���� ���� ��Ҹ� ����Ű�� ������ ������ ���� ���� ����Ʈ(doubly linked list)�� �� �� ���� ���˴ϴ�.


2. ���� ���� ����Ʈ
LinkedList Ŭ������ ���� ���� ���� ���� ����Ʈ�� ���������� ������ ���Դϴ�.
����, LinkedList Ŭ���� ���� List �������̽��� �����ϹǷ�, ArrayList Ŭ������ ����� �� �ִ� �޼ҵ尡 ���� �����ϴ�.

ArrayList�� LinkedList�� ���̴� ���������� ��Ҹ� �����ϴ� ����� ����
*/
		System.out.println("--- LinkedList ---");
		LinkedList<String> lnkList = new LinkedList<String>();

		// add() �޼ҵ带 �̿��� ����� ����
		lnkList.add("��");
		lnkList.add("��");
		lnkList.add("��");
		lnkList.add("�ϳ�");

		// for ���� get() �޼ҵ带 �̿��� ����� ���
		for (int i = 0; i < lnkList.size(); i++) {
			System.out.print(lnkList.get(i) + " ");
		}
		System.out.println();

		// remove() �޼ҵ带 �̿��� ����� ����
		lnkList.remove(1);

		// Enhanced for ���� get() �޼ҵ带 �̿��� ����� ���
		for (String e : lnkList) {
			System.out.print(e + " ");
		}
		System.out.println();

		// set() �޼ҵ带 �̿��� ����� ����
		lnkList.set(2, "��");

		for (String e : lnkList) {
			System.out.print(e + " ");
		}
		System.out.println();

		// size() �޼ҵ带 �̿��� ����� �� ����
		System.out.println("����Ʈ�� ũ�� : " + lnkList.size());

/*
# Vector<E> Ŭ����
ArrayList Ŭ������ ���� ������ �����ϴ� Ŭ����
ArrayList Ŭ������ ���������� List �������̽��� ��ӹ���
Vector Ŭ�������� ����� �� �ִ� �޼ҵ�� ArrayList Ŭ�������� ����� �� �ִ� �޼ҵ�� ���� ����
������ ���翡�� ���� �ڵ���� ȣȯ���� ���ؼ��� ���������Ƿ�, Vector Ŭ�������ٴ� ArrayList Ŭ������ ����ϴ� ���� ����

# List �������̽� �޼ҵ�
List �������̽��� Collection �������̽��� ��ӹ����Ƿ�, Collection �������̽����� ������ �޼ҵ嵵 ��� ����� �� ����

List �������̽����� �����ϴ� �ֿ� �޼ҵ�
�޼ҵ�	����
boolean add(E e)			�ش� ����Ʈ(list)�� ���޵� ��Ҹ� �߰���. (������ ���)
void add(int index, E e)	�ش� ����Ʈ�� Ư�� ��ġ�� ���޵� ��Ҹ� �߰���. (������ ���)
void clear()				�ش� ����Ʈ�� ��� ��Ҹ� ������. (������ ���)
boolean contains(Object o)	�ش� ����Ʈ�� ���޵� ��ü�� �����ϰ� �ִ����� Ȯ����.
boolean equals(Object o)	�ش� ����Ʈ�� ���޵� ��ü�� �������� Ȯ����.
E get(int index)			�ش� ����Ʈ�� Ư�� ��ġ�� �����ϴ� ��Ҹ� ��ȯ��.
boolean isEmpty()			�ش� ����Ʈ�� ����ִ����� Ȯ����.
Iterator<E> iterator()		�ش� ����Ʈ�� �ݺ���(iterator)�� ��ȯ��.
boolean remove(Object o)	�ش� ����Ʈ���� ���޵� ��ü�� ������. (������ ���)
boolean remove(int index)	�ش� ����Ʈ�� Ư�� ��ġ�� �����ϴ� ��Ҹ� ������. (������ ���)
E set(int index, E e)		�ش� ����Ʈ�� Ư�� ��ġ�� �����ϴ� ��Ҹ� ���޹��� ��ü�� ��ü��. (������ ���)
int size()					�ش� ����Ʈ�� ����� �� ������ ��ȯ��.
Object[] toArray()			�ش� ����Ʈ�� ��� ��Ҹ� Object Ÿ���� �迭�� ��ȯ��.
		 */
	}
}
