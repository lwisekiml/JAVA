import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class MapCollectionClass {
	public static void main(String[] args) {
/*
# Map �÷��� Ŭ����
Map �������̽��� Collection �������̽��ʹ� �ٸ� ���� ����� ����
Map �������̽��� ������ Map �÷��� Ŭ�������� Ű�� ���� �ϳ��� ������ �����ϴ� ���(key-value ���)�� ���
Ű(key)�� �������� ��(value)�� ã�� ���� �̸��� ������ ��

Map �������̽��� ������ ��� Map �÷��� Ŭ������ ������ ���� Ư¡�� ����
1. ����� ���� ���� ����X
2. Ű �ߺ� X, �� �ߺ� O

Map �÷��� Ŭ������ ���ϴ� Ŭ����
1. HashMap<K, V>
2. Hashtable<K, V>
3. TreeMap<K, V>

1. HashMap<K, V> Ŭ����
JDK 1.2���� ������ HashMap Ŭ������ �ؽ� �˰���(hash algorithm)�� ����Ͽ� �˻� �ӵ��� �ſ� ����

keySet() �޼ҵ�� �ش� �ʿ� ���Ե� ��� Ű ������ �ϳ��� ����(Set)���� ��ȯ�� ��
*/
		System.out.println("--- HashMap ---");
HashMap<String, Integer> hm = new HashMap<String, Integer>();

// put() �޼ҵ带 �̿��� ����� ����
hm.put("���", 30);
hm.put("��", 10);
hm.put("���", 40);
hm.put("�̽�", 20);

// Enhanced for ���� get() �޼ҵ带 �̿��� ����� ���
System.out.println("�ʿ� ����� Ű���� ���� : " + hm.keySet());
for (String key : hm.keySet()) {
    System.out.println(String.format("Ű : %s, �� : %s", key, hm.get(key)));
}


		System.out.println("--- remove(���) ---");
// remove() �޼ҵ带 �̿��� ����� ����
hm.remove("���");

		System.out.println("--- HashMap(Iterator) ---");
// iterator() �޼ҵ�� get() �޼ҵ带 �̿��� ����� ���
Iterator<String> keys = hm.keySet().iterator();
while (keys.hasNext()) {
    String key = keys.next();
    System.out.println(String.format("Ű : %s, �� : %s", key, hm.get(key)));
}

System.out.println("--- replace(�̽�,200) ---");
// replace() �޼ҵ带 �̿��� ����� ����
hm.replace("�̽�", 200);

		System.out.println("--- HashMap ---");
for (String key : hm.keySet()) {
    System.out.println(String.format("Ű : %s, �� : %s", key, hm.get(key)));
}

// size() �޼ҵ带 �̿��� ����� �� ����
System.out.println("���� ũ�� : " + hm.size());
/* 
2. Hashtable<K, V> Ŭ����
Hashtable Ŭ������ JDK 1.0���� ����� �� HashMap Ŭ������ ���� ������ �ϴ� Ŭ����
Map �������̽� ��� ����
����� �� �ִ� �޼ҵ�� HashMap Ŭ�������� ����� �� �ִ� �޼ҵ�� ���� ����
���翡�� ���� �ڵ���� ȣȯ���� ���ؼ��� ���������Ƿ�, Hashtable Ŭ�������ٴ� HashMap Ŭ������ ����ϴ� ���� ����
*/

/*
3. TreeMap<K, V> Ŭ����
Ű�� ���� �� ������ �ϴ� �����͸� ���� �˻� Ʈ��(binary search tree)�� ���·� ����
���� �˻� Ʈ���� �����͸� �߰��ϰų� �����ϴ� ���� �⺻ ���� �ð��� �ſ� ����
JDK 1.2���� ������ TreeMap Ŭ������ NavigableMap �������̽��� ������ ���� �˻� Ʈ���� ������ ����Ų ����-�� Ʈ��(Red-Black tree)�� ����

���� TreeMap �޼ҵ带 �̿��Ͽ� ���� �����ϰ� �����ϴ� ����
*/
System.out.println("--- TreeMap ---");
TreeMap<Integer, String> tm = new TreeMap<Integer, String>();

// put() �޼ҵ带 �̿��� ����� ����
tm.put(30, "���");
tm.put(10, "��");
tm.put(40, "���");
tm.put(20, "�̽�");

// Enhanced for ���� get() �޼ҵ带 �̿��� ����� ���
System.out.println("�ʿ� ����� Ű���� ���� : " + tm.keySet());
for (Integer key : tm.keySet()) {
    System.out.println(String.format("Ű : %s, �� : %s", key, tm.get(key)));
}

System.out.println("--- remove(40) ---");
// remove() �޼ҵ带 �̿��� ����� ����
tm.remove(40);

System.out.println("--- TreeMap(Iterator) ---");
// iterator() �޼ҵ�� get() �޼ҵ带 �̿��� ����� ���
Iterator<Integer> tkeys = tm.keySet().iterator();
while (tkeys.hasNext()) {
    Integer key = tkeys.next();
    System.out.println(String.format("Ű : %s, �� : %s", key, tm.get(key)));
}

System.out.println("--- replace(20, twenty) ---");
// replace() �޼ҵ带 �̿��� ����� ����
tm.replace(20, "twenty");

System.out.println("--- TreeMap ---");
for (Integer key : tm.keySet()) {
    System.out.println(String.format("Ű : %s, �� : %s", key, tm.get(key)));
}

// size() �޼ҵ带 �̿��� ����� �� ����
System.out.println("���� ũ�� : " + tm.size());
/*
HashMap<K, V> �޼ҵ�
�޼ҵ�								����
void clear()						�ش� ��(map)�� ��� ����(mapping)�� ������.
boolean containsKey(Object key)		�ش� ���� ���޵� Ű�� �����ϰ� �ִ����� Ȯ����.
boolean containsValue(Object value)	�ش� ���� ���޵� ���� �ش��ϴ� �ϳ� �̻��� Ű�� �����ϰ� �ִ����� Ȯ����.
V get(Object key)					�ش� �ʿ��� ���޵� Ű�� �����ϴ� ���� ��ȯ��.
									���� �ش� ���� ���޵� Ű�� ������ ������ �����ϰ� ���� ������ null�� ��ȯ��.
boolean isEmpty()					�ش� ���� ����ִ����� Ȯ����.
Set<K> keySet()						�ش� �ʿ� ���ԵǾ� �ִ� ��� Ű�� ������� Set ��ü�� ��ȯ��.
V put(K key, V value)				�ش� �ʿ� ���޵� Ű�� �����ϴ� ������ Ư�� ���� ������.
V remove(Object key)				�ش� �ʿ��� ���޵� Ű�� �����ϴ� ������ ������.

boolean remove(Object key, Object value)		�ش� �ʿ��� Ư�� ���� �����ϴ� Ư�� Ű�� ������ ������.
V replace(K key, V value)						�ش� �ʿ��� ���޵� Ű�� �����ϴ� ���� Ư�� ������ ��ü��.
boolean replace(K key, V oldValue, V newValue)	�ش� �ʿ��� Ư�� ���� �����ϴ� ���޵� Ű�� ���� ���ο� ������ ��ü��.
int size()										�ش� ���� ������ �� ������ ��ȯ��.
 
�ڹ� ���� ���������� Ű�� ������ �����Ǵ� �����͸� ����(mapping) �Ǵ� ��Ʈ��(entry)��� ����ϰ� ����



TreeMap<K, V> �޼ҵ�
�޼ҵ�								����
Map.Entry<K, V> ceilingEntry(K key)	�ش� �ʿ��� ���޵� Ű�� ���ų�, ���޵� Ű���� ū Ű �߿��� ���� ���� Ű�� �׿� �����ϴ� ���� ��Ʈ���� ��ȯ��. ���� �ش��ϴ� Ű�� ������ null�� ��ȯ��.
K ceilingKey(K key)					�ش� �ʿ��� ���޵� Ű�� ���ų�, ���޵� Ű���� ū Ű �߿��� ���� ���� Ű�� ��ȯ��.
									���� �ش��ϴ� Ű�� ������ null�� ��ȯ��.
void clear()						�ش� ��(map)�� ��� ����(mapping)�� ������.
boolean containsKey(Object key)		�ش� ���� ���޵� Ű�� �����ϰ� �ִ����� Ȯ����.
boolean containsValue(Object value)	�ش� ���� ���޵� ���� �ش��ϴ� �ϳ� �̻��� Ű�� �����ϰ� �ִ����� Ȯ����.
NavigableMap<K, V> descendingMap()	�ش� �ʿ� ���Ե� ��� ������ �������� ��ȯ��.
Set<Map.Entry<K, V>> entrySet()		�ش� �ʿ� ���Ե� ��� ������ Set ��ü�� ��ȯ��.
Map.Entry<K, V> firstEntry()		�ش� �ʿ��� ���� ���� ����(ù ��°) Ű�� �׿� �����ϴ� ���� ��Ʈ���� ��ȯ��.
K firstKey()						�ش� �ʿ��� ���� ���� ����(ù ��°) Ű�� ��ȯ��.
Map.Entry<K, V> floorEntry(K key)	�ش� �ʿ��� ���޵� Ű�� ���ų�, ���޵� Ű���� ���� Ű �߿��� ���� ū Ű�� �׿� �����ϴ� ���� ��Ʈ���� ��ȯ��. ���� �ش��ϴ� Ű�� ������ null�� ��ȯ��.
K floorKey(K key)					�ش� �ʿ��� ���޵� Ű�� ���ų�, ���޵� Ű���� ���� Ű �߿��� ���� ū Ű�� ��ȯ��.
									���� �ش��ϴ� Ű�� ������ null�� ��ȯ��.
V get(Object key)					�ش� �ʿ��� ���޵� Ű�� �����ϴ� ���� ��ȯ��.
									���� �ش� ���� ���޵� Ű�� ������ ������ �����ϰ� ���� ������ null�� ��ȯ��.
SortedMap<K, V> headMap(K toKey)	�ش� �ʿ��� ���޵� Ű���� ���� Ű�� ������ �κи��� ��ȯ��.
Map.Entry<K, V> higherEntry(K key)	�ش� �ʿ��� ���޵� Ű���� ���� Ű �߿��� ���� ū Ű�� �׿� �����ϴ� ���� ��Ʈ���� ��ȯ��. ���� �ش��ϴ� Ű�� ������ null�� ��ȯ��.
K higherKey(K key)					�ش� �ʿ��� ���޵� Ű���� ���� Ű �߿��� ���� ū Ű�� ��ȯ��.
									���� �ش��ϴ� Ű�� ������ null�� ��ȯ��.
Set<K> keySet()						�ش� �ʿ� ���ԵǾ� �ִ� ��� Ű�� ������� Set ��ü�� ��ȯ��.
Map.Entry<K, V> lastEntry()			�ش� �ʿ��� ���� ���� ū(������) Ű�� �׿� �����ϴ� ���� ��Ʈ���� ��ȯ��.
K lastKey()							�ش� �ʿ��� ���� ���� ū(������) Ű�� ��ȯ��.
Map.Entry<K, V> lowerEntry(K key)	�ش� �ʿ��� ���޵� Ű���� ū Ű �߿��� ���� ���� Ű�� �׿� �����ϴ� ���� ��Ʈ���� ��ȯ��. ���� �ش��ϴ� Ű�� ������ null�� ��ȯ��.
K lowerKey(K key)					�ش� �ʿ��� ���޵� Ű���� ū Ű �߿��� ���� ���� Ű�� ��ȯ��.
									���� �ش��ϴ� Ű�� ������ null�� ��ȯ��.
Map.Entry<K, V> pollFirstEntry()	�ش� �ʿ��� ���� ���� ����(ù ��°) Ű�� �׿� �����ϴ� ���� ��Ʈ���� ��ȯ�ϰ�, �ش� ��Ʈ���� �ʿ��� ������.
Map.Entry<K, V> pollLastEntry()		�ش� �ʿ��� ���� ���� ū(������) Ű�� �׿� �����ϴ� ���� ��Ʈ���� ��ȯ�ϰ�, �ش� ��Ʈ���� �ʿ��� ������.
V put(K key, V value)				�ش� �ʿ� ���޵� Ű�� �����ϴ� ������ Ư�� ���� ������.
V remove(Object key)				�ش� �ʿ��� ���޵� Ű�� �����ϴ� ������ ������.
boolean remove(K key, V value)		�ش� �ʿ��� Ư�� ���� �����ϴ� Ư�� Ű�� ������ ������.
V replace(K key, V value)			�ش� �ʿ��� ���޵� Ű�� �����ϴ� ���� Ư�� ������ ��ü��.
int size()							�ش� ���� ������ �� ������ ��ȯ��.
SortedMap<K, V> tailMap(K fromKey)	�ش� �ʿ��� fromKey�� ���ų�, fromKey���� ū Ű�� ������ �κи��� ��ȯ��.
boolean replace(K key, V oldValue, V newValue)	�ش� �ʿ��� Ư�� ���� �����ϴ� ���޵� Ű�� ���� ���ο� ������ ��ü��.
SortedMap<K, V> subMap(K fromKey, K toKey)		�ش� �ʿ��� fromKey���� toKey������ ������ �κи��� ��ȯ��.
												�̶� fromKey�� ���Եǳ�, toKey�� ���Ե��� ����.

Map.Entry �������̽��� Map �������̽��� ���� �������̽��� �ʿ� ����Ǵ� ��Ʈ���� ������ ���� �޼ҵ尡 ���ǵǾ� ����
*/
	}
}
