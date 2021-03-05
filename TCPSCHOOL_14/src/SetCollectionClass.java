import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetCollectionClass {
	public static void main(String[] args) {
/*
# Set �÷��� Ŭ����
- ����� ���� ������ ����X
- ���� ����� �ߺ� ���� ���X

��ǥ���� Set �÷��� Ŭ������ ���ϴ� Ŭ����
1. HashSet<E>
2. TreeSet<E>

1. HashSet<E> Ŭ����
Set �÷��� Ŭ�������� ���� ���� ���Ǵ� Ŭ���� �� �ϳ�
JDK 1.2���� ������ HashSet Ŭ������ �ؽ� �˰���(hash algorithm)�� ����Ͽ� �˻� �ӵ��� �ſ� ����
���������� HashMap �ν��Ͻ��� �̿��Ͽ� ��Ҹ� ����

����� ���� ������ �����ؾ� �Ѵٸ� JDK 1.4���� �����ϴ� LinkedHashSet Ŭ���� ���
*/
		System.out.println("--- HashSet ---");
		HashSet<String> hs01 = new HashSet<String>();
		HashSet<String> hs02 = new HashSet<String>();

		// add() �޼ҵ带 �̿��� ����� ����
		hs01.add("ȫ�浿");
		hs01.add("�̼���");
		System.out.println(hs01.add("�Ӳ���"));
		// add() �޼ҵ带 ����Ͽ� �ش� HashSet�� �̹� �����ϴ� ��Ҹ� �߰��Ϸ��� �ϸ�, �ش� ��Ҹ� �������� �ʰ� false�� ��ȯ�ϴ� ���� �� �� ����
		System.out.println(hs01.add("�Ӳ���")); // �ߺ��� ����� ����

		// Enhanced for ���� get() �޼ҵ带 �̿��� ����� ���
		for (String e : hs01) {
			System.out.print(e + " ");
		}
		System.out.println("\n--- HashSet(Iterator) ---");

		// add() �޼ҵ带 �̿��� ����� ����
		hs02.add("�Ӳ���");
		hs02.add("ȫ�浿");
		hs02.add("�̼���");

		// iterator() �޼ҵ带 �̿��� ����� ���
		// Collection �������̽������� Iterator �������̽��� ������ Ŭ������ �ν��Ͻ��� ��ȯ�ϴ� iterator() �޼ҵ带 �����Ͽ� �� ��ҿ� �����ϵ��� �ϰ� ����
		Iterator<String> iter02 = hs02.iterator();

		while (iter02.hasNext()) {
			System.out.print(iter02.next() + " ");
		}

		System.out.println();
		// size() �޼ҵ带 �̿��� ����� �� ����
		System.out.println("������ ũ�� : " + hs02.size());
/*
�ش� HashSet�� �̹� �����ϴ� ��������� �ľ��ϱ� ���ؼ��� ���������� ������ ���� ������ ��ġ�� ��
1. �ش� ��ҿ��� hashCode() �޼ҵ带 ȣ���Ͽ� ��ȯ�� �ؽð����� �˻��� ������ ����
2. �ش� ���� ���� ��ҵ��� equals() �޼ҵ�� ��
���� HashSet���� add() �޼ҵ带 ����Ͽ� �ߺ� ���� ���ο� ��Ҹ� �߰��ϱ� ���ؼ��� hashCode()�� equals() �޼ҵ带 ��Ȳ�� �°� �������̵��ؾ� ��
*/
		System.out.println("--- HashSet 3(Animal) ---");
		class Animal {
			String species;
			String habitat;

			Animal(String species, String habitat) {
				this.species = species;
				this.habitat = habitat;
			}

			public int hashCode() { return (species + habitat).hashCode(); }
			public boolean equals(Object obj) {
				if(obj instanceof Animal) {
					Animal temp = (Animal)obj;
					return species.equals(temp.species) && habitat.equals(temp.habitat);
				} else {
					return false;
				}
			}
		}

		HashSet<Animal> hs = new HashSet<Animal>();

		// add() �޼ҵ带 ���� ���� ���� ������ Animal �ν��Ͻ��� ���� �� ����������, size() �޼ҵ带 ���� ���캻 HashSet ����� �� ������ 1���� ����Ǿ����� Ȯ���� �� �ֽ��ϴ�.
		hs.add(new Animal("�����", "����"));
		hs.add(new Animal("�����", "����"));
		hs.add(new Animal("�����", "����"));

		System.out.println(hs.size());
/*
�ؽ� �˰���(hash algorithm)
�ؽ� �Լ�(hash function)�� ����Ͽ� �����͸� �ؽ� ���̺�(hash table)�� �����ϰ�, �ٽ� �װ��� �˻��ϴ� �˰���

�ؽ� �˰���
�ؽ� �˰����� �̿��� �ڷ� ������ �迭�� ���� ����Ʈ�� ����
������ �������� Ű���� �ؽ� �Լ��� �־� ��ȯ�Ǵ� ������ �迭�� �ε����� ����
�ش� �ε����� ����� ���� ����Ʈ�� ������ ����

ex) ������ �����͸� ���̰� 10�� �迭�� �����Ѵٰ� �Ѵٸ� 1,000,002�� �˻��ϴ� ����� 1,000,002�� 10���� ���� �������� 2�̹Ƿ� �迭�� �� ��° ��ҿ� ����� ���� ����Ʈ���� �˻��� ����


2. TreeSet<E> Ŭ����
�����Ͱ� ���ĵ� ���·� ����Ǵ� ���� �˻� Ʈ��(binary search tree)�� ���·� ��Ҹ� ����
���� �˻� Ʈ���� �����͸� �߰��ϰų� �����ϴ� ���� �⺻ ���� �ð��� �ſ� ����
JDK 1.2���� �����Ǵ� TreeSet Ŭ������ NavigableSet �������̽��� ������ ���� �˻� Ʈ���� ������ ����Ų ����-�� Ʈ��(Red-Black tree)�� ����

���� TreeSet �޼ҵ带 �̿��Ͽ� ������ �����ϰ� �����ϴ� ����
*/
		System.out.println("--- TreeSet ---");
		TreeSet<Integer> ts = new TreeSet<Integer>();

		// add() �޼ҵ带 �̿��� ����� ����
		ts.add(30);
		ts.add(40);
		ts.add(20);
		ts.add(10);

		// Enhanced for ���� get() �޼ҵ带 �̿��� ����� ���
		for (int e : ts) {
			System.out.print(e + " ");
		}
		System.out.println();

		// remove() �޼ҵ带 �̿��� ����� ����
		ts.remove(40);

		// iterator() �޼ҵ带 �̿��� ����� ���
		Iterator<Integer> iter = ts.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		System.out.println();

		// size() �޼ҵ带 �̿��� ����� �� ����
		System.out.println("���� �˻� Ʈ���� ũ�� : " + ts.size());

		// subSet() �޼ҵ带 �̿��� �κ� ������ ���
		System.out.println(ts.subSet(10, 20)); // ��
		System.out.println(ts.subSet(10, true, 20, true)); // ��

/* 
TreeSet �ν��Ͻ��� ����Ǵ� ��ҵ��� ��� ���ĵ� ���·� ����
subSet() �޼ҵ�� TreeSet �ν��Ͻ��� ����Ǵ� ��Ұ� ��� ���ĵ� �����̱⿡ ������ ������ �ش� Ʈ���� �κ� ���ո��� �����ִ� �޼ҵ�

����
1. public NavigableSet<E> subSet(E fromElement, E toElement)
2. public NavigableSet<E> subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive)

��� ���ο��� ���� subSet() �޼ҵ�� ù ��° �Ű������� ���޵� ���� �ش��ϴ� ��Һ��� �����Ͽ� �� ��° �Ű������� ���޵� ���� �ش��ϴ� ����� �ٷ� ���� ��ұ����� ��ȯ
��� ���ο��� ���� subSet() �޼ҵ�� �� ��°�� �� ��° �Ű������� ���� ù ��°�� �� ��° �Ű������� ���޵� ���� �ش��ϴ� ��Ҹ� ������ ������ �ƴ����� ����� �� ����
��� ���ο��� �� ��° �Ű������� false�� �����ϸ� 20�� �������� �ʰ� �ǹǷ�, ��� ���ΰ� ���� ��� ���

# Set �������̽� �޼ҵ�
Set �������̽��� Collection �������̽��� ��ӹ����Ƿ�, Collection �������̽����� ������ �޼ҵ嵵 ��� ����� �� ����

Set �������̽����� �����ϴ� �ֿ� �޼ҵ�
�޼ҵ�						����
boolean add(E e)			�ش� ����(set)�� ���޵� ��Ҹ� �߰���. (������ ���)
void clear()				�ش� ������ ��� ��Ҹ� ������. (������ ���)
boolean contains(Object o)	�ش� ������ ���޵� ��ü�� �����ϰ� �ִ����� Ȯ����.
boolean equals(Object o)	�ش� ���հ� ���޵� ��ü�� �������� Ȯ����.
boolean isEmpty()			�ش� ������ ����ִ����� Ȯ����.
Iterator<E> iterator()		�ش� ������ �ݺ���(iterator)�� ��ȯ��.
boolean remove(Object o)	�ش� ���տ��� ���޵� ��ü�� ������. (������ ���)
int size()					�ش� ������ ����� �� ������ ��ȯ��.
Object[] toArray()			�ش� ������ ��� ��Ҹ� Object Ÿ���� �迭�� ��ȯ��.
*/
	}
}
