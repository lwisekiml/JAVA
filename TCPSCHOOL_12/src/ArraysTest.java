import java.util.Arrays;

public class ArraysTest {
	public static void main(String[] args) {
/*
# Arrays Ŭ����
java.util ��Ű��
java.util ��Ű���� import ������ ��Ű���� �ҷ����� ������ Ŭ���� �̸������� ����� ��  ����

# java.util.Arrays Ŭ����
�迭�� �ٷ�� ���� �پ��� �޼ҵ� ����
Arrays Ŭ������ ��� �޼ҵ�� Ŭ���� �޼ҵ�(static method)�̹Ƿ�, ��ü�� �������� �ʰ� �ٷ� ��� ����

1. binarySearch() �޼ҵ�
���޹��� �迭���� Ư�� ��ü�� ��ġ�� ���� �˻� �˰����� ����Ͽ� �˻��� ��, �ش� ��ġ�� ��ȯ
���� �˻� �˰����� ����ϹǷ�, �Ű������� ���޵Ǵ� �迭�� �̸� ���ĵǾ� �־�߸� ����� ����
*/
		System.out.println("--- binarySearch() ---");
		int[] arr = new int[1000];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}

		System.out.println(Arrays.binarySearch(arr, 437));
/*
2. copyOf() �޼ҵ�
���޹��� �迭�� Ư�� ���̸�ŭ�� ���ο� �迭�� �����Ͽ� ��ȯ
ù ��° �Ű������� ���� �迭�� ���޹ް�, �� ��° �Ű������� ���� �迭���� ���ο� �迭�� ������ ����� ������ ���� ����
���� �迭�� ���� Ÿ���� ����� ���ο� �迭�� ��ȯ
���ο� �迭�� ���̰� ���� �迭���� ���, ������ ��Ҵ� �迭 ����� Ÿ�Կ� �°� ������ ���� �⺻������ ä��

�迭 ����� Ÿ��	�⺻��
char				'\u0000'
byte, short, int	0
long				0L
float				0.0F
double				0.0 �Ǵ� 0.0D
boolean				false
�迭, �ν��Ͻ� ��		null
*/
		System.out.println("--- copyOf() ---");
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = Arrays.copyOf(arr1, 3);// ��

		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}

		System.out.println();

		int[] arr3 = Arrays.copyOf(arr1, 10);// ��
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}

		System.out.println();
/*
��� ���ο����� copyOf() �޼ҵ带 ����Ͽ� �迭 arr1�� ù ��° �迭 ��Һ��� 3���� ��Ҹ� �����Ͽ� �迭 arr2�� ����
��� ���ο����� �迭 arr1���� 10���� �迭 ��Ҹ� �����Ͽ� �迭 arr3�� �����Ϸ��� ��
������ �迭 arr1�� ���̰� 5�ۿ� �ȵǹǷ�, �迭 arr3�� ������ �迭 ��ҿ��� int���� �⺻���� 0�� ä����


3. copyOfRange() �޼ҵ�
���޹��� �迭�� Ư�� ������ �ش��ϴ� ��Ҹ��� ���ο� �迭�� �����Ͽ� ��ȯ
ù ��° �Ű������� ������ ����� �� ���� �迭�� ���� ����
�� ��° �Ű������δ� ���� �迭���� ������ ���� *�ε���*�� ���޹ް�, �� ��° �Ű������δ� ���������� ����� �迭 ����� �ٷ� ���� �ε����� ���� ����
�� ��° �Ű������� ���޵� �ε��� �ٷ� �������� �迭 ��ұ����� ���� ��
���� �迭�� ���� Ÿ���� ����� ���ο� �迭�� ��ȯ
*/
		System.out.println("--- copyOfRange() ---");
		int[] ar1 = {1, 2, 3, 4, 5};

		int[] ar2 = Arrays.copyOfRange(ar1, 2, 4);
		for (int i = 0; i < ar2.length; i++) {
			System.out.print(ar2[i] + " ");
		}
		System.out.println();
/*
4. fill() �޼ҵ�
���޹��� �迭�� ��� ��Ҹ� Ư�� ������ �ʱ�ȭ
ù ��° �Ű������� �ʱ�ȭ�� �迭�� ���޹ް�, �� ��° �Ű������� �ʱⰪ�� ���� ����
�� �޼ҵ�� ���޹��� ���� �迭�� ���� �����ϰ� ��
*/
		System.out.println("--- fill() ---");
		int[] ar = new int[10];

		Arrays.fill(ar, 7);
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println();
/*
5. sort() �޼ҵ�
���޹��� �迭�� ��� ��Ҹ� ������������ ����
�Ű������� ������ �迭�� ���޹�����, ���޹��� ���� �迭�� ������ ���� ��
*/
		System.out.println("--- sort() ---");
		int[] a = {5, 3, 4, 1, 2};

		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
/*
5. ��ǥ���� Arrays �޼ҵ�

�޼ҵ�	����
static <T> List<T> asList(T... a)	
���޹��� �迭�� ���� ũ���� ����Ʈ(list)�� ��ȯ�Ͽ� ��ȯ��.

static int binarySearch(Object[] a, Object key)
���޹��� �迭���� Ư�� ��ü�� ���� �˻� �˰����� ����Ͽ� �˻��� ��, �� ��ġ�� ��ȯ��.

static <T> T[] copyOf(T[] original, int newLength)	
���޹��� �迭�� Ư�� ������ ���ο� �迭�� �����Ͽ� ��ȯ��.

static <T> T[] copyOfRange(T[] original, int from, int to)	
���޹��� �迭�� Ư�� ������ �ش��ϴ� ��Ҹ��� ���ο� �迭�� �����Ͽ� ��ȯ��.

static boolean equals(Object[] a, Object[] a2)
���޹��� �� �迭�� �������� Ȯ����.

static void fill(Object[] a, Object val)	
���޹��� �迭�� ��� ��Ҹ� Ư�� ������ �ʱ�ȭ��.

static void sort(Object[] a)	
���޹��� �迭�� ��� ��Ҹ� ������������ ������.
		 */
	}
}
