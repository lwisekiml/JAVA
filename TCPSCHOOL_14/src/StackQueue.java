import java.util.LinkedList;
import java.util.Stack;

public class StackQueue {
	public static void main(String[] args) {
/*
# Stack�� Queue

1. Stack<E> Ŭ����
List �÷��� Ŭ������ Vector Ŭ������ ��ӹ޾�, �������� ���� �޸� ������ Ŭ������ ����
���� �޸� ������ ���� �޸� ������ �����͸� �����ϸ鼭 ���Լ���(LIFO)�� �ø�ƽ�� ������ �ڷ� ����

���� �޸� ������ ǥ���ϱ� ����, Vector Ŭ������ �޼ҵ带 5���� ��ӹ޾� ���
�޼ҵ�	����
boolean empty()			�ش� ������ ��� ������ true��, ��� ���� ������ false�� ��ȯ��.
E peek()				�ش� ������ ���� ��ܿ� �ִ�(���� ���������� �����) ��Ҹ� ��ȯ��.
E pop()					�ش� ������ ���� ��ܿ� �ִ�(���� ���������� �����) ��Ҹ� ��ȯ�ϰ�, �ش� ��Ҹ� ���ÿ��� ������.
E push(E item)			�ش� ������ ���� ��ܿ� ���޵� ��Ҹ� ������.
int search(Object o)	�ش� ���ÿ��� ���޵� ��ü�� �����ϴ� ��ġ�� �ε����� ��ȯ��.

�̶� �ε����� ���� ��ܿ� �ִ�(���� ���������� �����) ����� ��ġ���� 0�� �ƴ� 1���� ������

���� �����ϰ� ���� ������ �����ϰ� �ʹٸ� Deque �������̽��� ������ ArrayDeque Ŭ������ ����ϸ� ��
ex) Deque<Integer> st = new ArrayDeque<Integer>();

��, ArrayDeque Ŭ������ Stack Ŭ�����ʹ� �޸� search() �޼ҵ�� ����X

���� Stack �޼ҵ带 �̿��Ͽ� ���� �޸� ������ ������ ����
*/
		System.out.println("--- stack ---");
		Stack<Integer> st = new Stack<Integer>(); // ������ ����
		//Deque<Integer> st = new ArrayDeque<Integer>();

		// push() �޼ҵ带 �̿��� ����� ����
		st.push(4);
		st.push(2);
		st.push(3);
		st.push(1);

		// peek() �޼ҵ带 �̿��� ����� ��ȯ
		System.out.println(st.peek());
		System.out.println(st);

		// pop() �޼ҵ带 �̿��� ����� ��ȯ �� ����
		System.out.println(st.pop());
		System.out.println(st);

		// search() �޼ҵ带 �̿��� ����� ��ġ �˻�
		System.out.println(st.search(4));
		System.out.println(st.search(3));
/*
2. Queue<E> �������̽�
Ŭ������ ������ ���ð��� �޸� �ڹٿ��� ť �޸� ������ ������ �������̽� ���·� ����

Queue �������̽��� ��ӹ޴� ���� �������̽�
1. Deque<E>
2. BlockingDeque<E>
3. BlockingQueue<E>
4. TransferQueue<E>

Queue �������̽��� ������������ ������ Ŭ������ ����� ����
Deque �������̽��� ������ LinkedList Ŭ������ ť �޸� ������ �����ϴ� �� ���� ���� ���

ť �޸� ������ ���� �޸� ������ �����͸� �����ϸ鼭 ���Լ���(FIFO)�� �ø�ƽ�� ������ �ڷ� ����

Queue �������̽��� ť �޸� ������ ǥ���ϱ� ����, ������ ���� Collection �������̽� �޼ҵ常�� ��ӹ޾� ���
�޼ҵ�	����
boolean add(E e)	�ش� ť�� �� �ڿ� ���޵� ��Ҹ� ������. 
					���� ���Կ� �����ϸ� true�� ��ȯ�ϰ�, ť�� ���� ������ ���� ���Կ� �����ϸ� IllegalStateException�� �߻���Ŵ.

E element()			�ش� ť�� �� �տ� �ִ�(���� ���� �����) ��Ҹ� ��ȯ��.

boolean offer(E e)	�ش� ť�� �� �ڿ� ���޵� ��Ҹ� ������.

E peek()			�ش� ť�� �� �տ� �ִ�(���� ���� �����) ��Ҹ� ��ȯ��.
					���� ť�� ��������� null�� ��ȯ��.

E poll()			�ش� ť�� �� �տ� �ִ�(���� ���� �����) ��Ҹ� ��ȯ�ϰ�, �ش� ��Ҹ� ť���� ������.
					���� ť�� ��������� null�� ��ȯ��.

E remove()			�ش� ť�� �� �տ� �ִ�(���� ���� �����) ��Ҹ� ������.

���� �����ϰ� ���� ť�� �����ϰ� �ʹٸ� Deque �������̽��� ������ ArrayDeque Ŭ������ ���
ex) Deque<Integer> qu = new ArrayDeque<Integer>();

���� LinkedList �޼ҵ带 �̿��Ͽ� ť �޸� ������ ������ ����
Java SE 6���� �����Ǵ� ArrayDeque Ŭ������ ���ð� ť �޸� ������ ��� �����ϴµ� ���� ������ Ŭ�����Դϴ�.
*/
		System.out.println("--- queue ---");
		LinkedList<String> qu = new LinkedList<String>(); // ť�� ����
		//Deque<String> qu = new ArrayDeque<String>();

		// add() �޼ҵ带 �̿��� ����� ����
		qu.add("��");
		qu.add("��");
		qu.add("��");
		qu.add("�ϳ�");

		// peek() �޼ҵ带 �̿��� ����� ��ȯ
		System.out.println(qu.peek());
		System.out.println(qu);

		// poll() �޼ҵ带 �̿��� ����� ��ȯ �� ����
		System.out.println(qu.poll());
		System.out.println(qu);

		// remove() �޼ҵ带 �̿��� ����� ����
		qu.remove("�ϳ�");
		System.out.println(qu);
	}
}
