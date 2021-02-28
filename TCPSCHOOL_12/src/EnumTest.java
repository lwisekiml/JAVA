
/*
# Enum Ŭ����
����ü(enumeration type)

- ����ü�� ���� �� ���� ���Ӹ� �ƴ϶� Ÿ�Ա����� üũ�մϴ�.
- ����ü�� ������� �����ǵǴ��� �ٽ� �������� �ʿ䰡 �����ϴ�.

���� �� ��� : enum Ű���带 ����Ͽ� ����

���� : enum ����ü�̸� { ���1�̸�, ���2�̸�, ... }
enum Rainbow { RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET }

�ұ�Ģ�� ���� ��������� �����ϰ� ������ ����� �̸� ���� ��ȣ(())�� �߰��ϰ�, �� �ȿ� ���ϴ� ������� ����� ��  ����
������ �̶����� �ұ�Ģ�� Ư�� ���� ������ �� �ִ� �ν��Ͻ� ������ �����ڸ� ���� ������ ���� ������ �߰��ؾ߸� ��
*/
enum Rainbow {
    RED(3), ORANGE(10), YELLOW(21), GREEN(5), BLUE(1), INDIGO(-1), VIOLET(-11);
 
    private final int value;
    Rainbow(int value) { this.value = value; }
    public int getValue() { return value; }
}
/*
# java.lang.Enum Ŭ����
Enum Ŭ������ ��� �ڹ� ����ü�� ����� ���� Ŭ����

Enum Ŭ�������� ����ü�� �����ϱ� ���� �پ��� �޼ҵ� ����

1. values() �޼ҵ�
�ش� ����ü�� ��� ����� ������ �迭�� �����Ͽ� ��ȯ
�ڹ��� ��� ����ü�� �����Ϸ��� �ڵ����� �߰��� �ִ� �޼ҵ�
*/
//enum Rainbow { RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET }

public class EnumTest {
	public static void main(String[] args) {
		System.out.println("--- values() ---");
        Rainbow[] arr = Rainbow.values();
        for (Rainbow rb : arr) {
            System.out.println(rb);
        }
/*
2. valueOf() �޼ҵ�
���޵� ���ڿ��� ��ġ�ϴ� �ش� ����ü�� ����� ��ȯ
*/
        System.out.println("--- valueOf() ---");
        Rainbow rb = Rainbow.valueOf("GREEN");
        System.out.println(rb);
/*
3. ordinal() �޼ҵ�
�ش� ����ü ����� ����ü ���ǿ��� ���ǵ� ����(0���� ����)�� ��ȯ
��ȯ�Ǵ� ���� ����ü ���ǿ��� �ش� ����ü ����� ���ǵ� �����̸�, ����� ��ü�� �ƴ��� ���
*/
        System.out.println("--- ordinal() ---");
        int idx = Rainbow.YELLOW.ordinal();
        System.out.println(idx);
/*
�ұ�Ģ���� ������� ������ ����ü���� ordinal() �޼ҵ带 ����� ����

enum Rainbow {
    RED(3), ORANGE(10), YELLOW(21), GREEN(5), BLUE(1), INDIGO(-1), VIOLET(-11);

    private final int value;
    Rainbow(int value) { this.value = value; }
    public int getValue() { return value; }
}
*/
        System.out.println("--- �ұ�Ģ�� ordinal() ---");
        System.out.println(Rainbow.BLUE.ordinal());
/*
4. ��ǥ���� Enum �޼ҵ�
�޼ҵ�	����
static E values()
�ش� ����ü�� ��� ����� ������ �迭�� �����Ͽ� ��ȯ��.

static E valueOf(String name)
���޵� ���ڿ��� ��ġ�ϴ� �ش� ����ü�� ����� ��ȯ��.

protected void finalize()
�ش� Enum Ŭ������ final �޼ҵ带 ���� �� ���� ��.

String name()
�ش� ����ü ����� �̸��� ��ȯ��.

int ordinal()
�ش� ����ü ����� ����ü ���ǿ��� ���ǵ� ����(0���� ����)�� ��ȯ��.
*/
	}
}
