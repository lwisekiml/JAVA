import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;

public class IteratorInter {
	public static void main(String[] args) {
/*
# Iterator�� ListIterator
1. Iterator<E> �������̽�
�÷��� �����ӿ�ũ�� �÷��ǿ� ����� ��Ҹ� �о���� ����� Iterator �������̽��� ǥ��ȭ�ϰ� ����
Collection �������̽������� Iterator �������̽��� ������ Ŭ������ �ν��Ͻ��� ��ȯ�ϴ� iterator() �޼ҵ带 �����Ͽ� �� ��ҿ� �����ϵ��� ��
Collection �������̽��� ��ӹ޴� List�� Set �������̽������� iterator() �޼ҵ带 ����� �� ����
*/
		System.out.println("--- Iterator ---");
		LinkedList<Integer> lnkList = new LinkedList<Integer>();

		lnkList.add(4);
		lnkList.add(2);
		lnkList.add(3);
		lnkList.add(1);

		Iterator<Integer> iter = lnkList.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
/*
Iterator �������̽��� ������ ���� �޼ҵ带 ����Ͽ� �÷����� �� ��ҿ� ������ �� �ֽ��ϴ�.
�޼ҵ�					����
boolean hasNext()		�ش� ���ͷ��̼�(iteration)�� ���� ��Ҹ� ������ ������ true�� ��ȯ�ϰ�, �� �̻� ���� ��Ҹ� ������ ���� ������ false�� ��ȯ��.
E next()				���ͷ��̼�(iteration)�� ���� ��Ҹ� ��ȯ��.
default void remove()	�ش� �ݺ��ڷ� ��ȯ�Ǵ� ������ ��Ҹ� ���� �÷��ǿ��� ������. (������ ���)

���� �ڹٿ����� �� �� ������ JDK 1.5���� �߰��� Enhanced for ���� ����ϵ��� �����ϰ� ����
Enhanced for ���� ����ϸ� ���� ������ �����ϸ鼭�� �ڵ��� ��Ȯ���� Ȯ���ϰ� �߻��� �� �ִ� ���׸� ������ ��
������ ����� ������ ���ų� ��ü ���� �����ϱ� ���� ��쿡�� �ݺ���(iterator)�� ����ؾ߸� ��

# Enumeration<E> �������̽�
JDK 1.0���� ����� �� Iterator �������̽��� ���� ������ �ϴ� �������̽�
hasMoreElements()�� nextElement() �޼ҵ带 ����Ͽ� Iterator�� ���� �۾��� ����
������ ���翡�� ���� �ڵ���� ȣȯ���� ���ؼ��� ���������Ƿ�, Enumeration �������̽����ٴ� Iterator �������̽��� ����ϴ� ���� ����
*/

/*
2. ListIterator<E> �������̽�
Iterator �������̽��� ��ӹ޾� ���� ����� �߰��� �������̽�

Iterator �������̽��� �÷����� ��ҿ� ������ �� �� �������θ� �̵��� �� �ֽ��ϴ�.
������ JDK 1.2���� ������ ListIterator �������̽��� �÷��� ����� ��ü, �߰� �׸��� �ε��� �˻� ���� ���� �۾����� ��������� �̵��ϴ� ���� ������
��, ListIterator �������̽��� List �������̽��� ������ List �÷��� Ŭ���������� listIterator() �޼ҵ带 ���� ����� �� ����

����Ʈ �ݺ��ڸ� ����Ͽ� ����Ʈ�� ��� ��Ҹ� ���� ������� ���������� ����ϴ� ����
*/
		LinkedList<Integer> lnkList2 = new LinkedList<Integer>();

		lnkList2.add(4);
		lnkList2.add(2);
		lnkList2.add(3);
		lnkList2.add(1);

		System.out.println("\n--- ListIterator(next) ---");
		ListIterator<Integer> liter = lnkList2.listIterator();
		while (liter.hasNext()) {
			System.out.print(liter.next() + " ");
		}
		System.out.println("\n--- ListIterator(previous) ---");
		while (liter.hasPrevious()) {
			System.out.print(liter.previous() + " ");
		}
/*
ListIterator �������̽��� ������ ���� �޼ҵ带 ����Ͽ� �÷����� �� ��ҿ� ������ �� ����

�޼ҵ�					����
void add(E e)			�ش� ����Ʈ(list)�� ���޵� ��Ҹ� �߰���. (������ ���)
boolean hasNext()		�� ����Ʈ �ݺ��ڰ� �ش� ����Ʈ�� ���������� ��ȸ�� �� ���� ��Ҹ� ������ ������ true�� ��ȯ�ϰ�, �� �̻� ���� ��Ҹ� ������ ���� ������ false�� ��ȯ��.
boolean hasPrevious()	�� ����Ʈ �ݺ��ڰ� �ش� ����Ʈ�� ���������� ��ȸ�� �� ���� ��Ҹ� ������ ������ true�� ��ȯ�ϰ�, �� �̻� ���� ��Ҹ� ������ ���� ������ false�� ��ȯ��.
E next()				����Ʈ�� ���� ��Ҹ� ��ȯ�ϰ�, Ŀ��(cursor)�� ��ġ�� ���������� �̵���Ŵ.
int nextIndex()			���� next() �޼ҵ带 ȣ���ϸ� ��ȯ�� ����� �ε����� ��ȯ��.
E previous()			����Ʈ�� ���� ��Ҹ� ��ȯ�ϰ�, Ŀ��(cursor)�� ��ġ�� ���������� �̵���Ŵ.
int previousIndex()		���� previous() �޼ҵ带 ȣ���ϸ� ��ȯ�� ����� �ε����� ��ȯ��.
void remove()			next()�� previous() �޼ҵ忡 ���� ��ȯ�� ���� ������ ��Ҹ� ����Ʈ���� ������. (������ ���)
void set(E e)			next()�� previous() �޼ҵ忡 ���� ��ȯ�� ���� ������ ��Ҹ� ���޵� ��ü�� ��ü��. (������ ���)
		 */
	}
}
