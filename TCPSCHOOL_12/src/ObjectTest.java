/* 2/14

Object Ŭ����

1. java.lang ��Ű��
�ڹٿ��� ���� �⺻���� ������ �����ϴ� Ŭ�������� ����
�ڹٿ����� java.lang ��Ű���� Ŭ�������� import ���� ������� �ʾƵ� Ŭ���� �̸������� �ٷ� ��� ����

2. java.lang.Object Ŭ����
java.lang ��Ű�� �߿����� ���� ���� ���Ǵ� Ŭ������ �ٷ� Object Ŭ����
Object Ŭ������ ��� �ڹ� Ŭ������ �ְ� ���� Ŭ����
�ڹ��� ��� Ŭ������ Object Ŭ������ ��� �޼ҵ带 �ٷ� ��� ���� 

�̷��� Object Ŭ������ �ʵ带 ������ ������, �� 11���� �޼ҵ常���� ����

3. toString() �޼ҵ�
�ش� �ν��Ͻ��� ���� ������ ���ڿ��� ��ȯ
��ȯ�Ǵ� ���ڿ��� Ŭ���� �̸��� �Բ� �����ڷ� '@'�� ���Ǹ�, �� �ڷ� 16���� �ؽ� �ڵ�(hash code)�� �߰� ��
16���� �ؽ� �ڵ� ���� �ν��Ͻ��� �ּҸ� ����Ű�� ������, �ν��Ͻ����� ��� �ٸ��� ��ȯ ��

����
Car car01 = new Car();
Car car02 = new Car();

System.out.println(car01.toString());
System.out.println(car02.toString());

���� ���
Car@15db9742
Car@6d06d69c

�ڹٿ��� toString() �޼ҵ�� �⺻������ �� API Ŭ�������� ��ü������ �������̵��� ���� �����ǵǾ� ����
*/

/* 2/15
4. equals()
�ش� �ν��Ͻ��� �Ű������� ���޹޴� ���� ������ ���Ͽ�, �� ����� ��ȯ
���� ������ ����Ű�� ���� ���ϹǷ�, ���� �ٸ� �� ��ü�� ������ false�� ��ȯ

�ڹٿ��� equals() �޼ҵ�� �⺻������ �� API Ŭ�������� ��ü������ �������̵��� ���� �����ǵǾ� ����

���� ������ equals() �޼ҵ带 �̿��Ͽ� �� �ν��Ͻ��� ���� ���ϴ� �����Դϴ�.
*/

//class Car{
//	private int v;
//	public void speed() {
//		System.out.println(v);
//	}
//}
//
//public class ObjectTest {
//	public static void main(String[] args) {
//		Car car01 = new Car();
//		Car car02 = new Car();
//	
//		System.out.println(car01.equals(car02));
//		car01 = car02; // �� ���� ������ ���� �ּҸ� ����Ŵ.
//		System.out.println(car01.equals(car02));
//	}
//}

/*
5. Object �޼ҵ�
Object Ŭ������ �޼ҵ�� ������ �����ϴ�.

�޼ҵ�	����
protected Object clone()	�ش� ��ü�� �������� �����Ͽ� ��ȯ��.
boolean equals(Object obj)	�ش� ��ü�� ���޹��� ��ü�� ������ ���θ� ��ȯ��.
protected void finalize()	�ش� ��ü�� ���� �ƹ��� �������� �ʾ� ������ �÷��Ͱ� ��ü�� ���ҽ��� �����ϱ� ���� ȣ����.
Class<T> getClass()			�ش� ��ü�� Ŭ���� Ÿ���� ��ȯ��.
int hashCode()				�ش� ��ü�� �ؽ� �ڵ尪�� ��ȯ��.
void notify()				�ش� ��ü�� ���(wait)�ϰ� �ִ� �ϳ��� �����带 �ٽ� ������ �� ȣ����.
void notifyAll()			�ش� ��ü�� ���(wait)�ϰ� �ִ� ��� �����带 �ٽ� ������ �� ȣ����.
String toString()			�ش� ��ü�� ������ ���ڿ��� ��ȯ��.
void wait()					�ش� ��ü�� �ٸ� �����尡 notify()�� notifyAll() �޼ҵ带 ������ ������ ���� �����带 �Ͻ������� ���(wait)��ų �� ȣ����.
void wait(long timeout)		�ش� ��ü�� �ٸ� �����尡 notify()�� notifyAll() �޼ҵ带 �����ϰų� ���޹��� �ð��� ���� ������ ���� �����带 �Ͻ������� ���(wait)��ų �� ȣ����.
void wait(long timeout, int nanos)	�ش� ��ü�� �ٸ� �����尡 notify()�� notifyAll() �޼ҵ带 �����ϰų� ���޹��� �ð��� �����ų� �ٸ� �����尡 ���� �����带 ���ͷ�Ʈ(interrupt) �� ������ ���� �����带 �Ͻ������� ���(wait)��ų �� ȣ����.
*/


/* 2/16

clone() �޼ҵ�
�ش� �ν��Ͻ��� �����Ͽ�, ���ο� �ν��Ͻ��� ������ ��ȯ ��

Object Ŭ������ clone() �޼ҵ�� ���� �ʵ��� ������ �����ϹǷ�, �ʵ��� ���� �迭�̳� �ν��Ͻ��� ����� ����X
�̷��� ��� �ش� Ŭ�������� clone() �޼ҵ带 �������̵��Ͽ�, ������ ����� �̷�������� �������ؾ� �� 
�������� ��ȣ�� ������ Cloneable �������̽��� ������ Ŭ������ �ν��Ͻ����� ����� �� ����

����
*/
import java.util.*;

class Car implements Cloneable {
	private String modelName;
    private ArrayList<String> owners = new ArrayList<String>(); // ��

	public String getModelName() { return this.modelName; }                    // modelName�� ���� ��ȯ��
	public void setModelName(String modelName) { this.modelName = modelName; } // modelName�� ���� ������
	public ArrayList getOwners() { return this.owners; }                      // owners�� ���� ��ȯ��
	public void setOwners(String ownerName) { this.owners.add(ownerName); }   // owners�� ���� �߰���
	
	public Object clone() {
		try {
			Car clonedCar = (Car)super.clone(); // �� 
//			clonedCar.owners = (ArrayList)owners.clone(); // ��
			return clonedCar; // ��
		} catch (CloneNotSupportedException ex) {
			ex.printStackTrace();
			return null;
		}
	}
}

public class ObjectTest {
	public static void main(String[] args) {
		Car car01 = new Car(); // ��
		car01.setModelName("�ƹݶ�");
		car01.setOwners("ȫ�浿");
		System.out.println("Car01 : " + car01.getModelName() + ", " + car01.getOwners() + "\n"); // ��

		Car car02 = (Car)car01.clone(); // ��
		car02.setOwners("�̼���"); // ��
		System.out.println("Car01 : " + car01.getModelName() + ", " + car01.getOwners()); // ��
		System.out.println("Car02 : " + car02.getModelName() + ", " + car02.getOwners()); // ��
	}
}
/*
�ڵ����� ��

���� ���
Car01 : �ƹݶ�, [ȫ�浿]
Car02 : �ƹݶ�, [ȫ�浿, �̼���]
Car02 : �ƹݶ�, [ȫ�浿, �̼���]

�� ������ ��� ���ο����� �θ� Ŭ������ clone() �޼ҵ带 ȣ���Ͽ� clone() �޼ҵ带 �������̵��ϰ� �ֽ��ϴ�.
��� ���ο����� Car Ŭ������ �ν��Ͻ��� car01�� �����ϰ�, ��� ���ο����� �������̵��� clone() �޼ҵ带 ȣ���Ͽ� ������ �����ϰ� �ֽ��ϴ�.

������ ��� ����ó�� clone() �޼ҵ带 �������ϸ�, �ʵ��� ���� ��� ����ó�� �ν��Ͻ��� ���� ����� �� ������ ������ �� �����ϴ�.
��� ���ο����� ������ �ν��Ͻ��� car02�� owners �ʵ忡 ���ο� ���� �ϳ� �߰��մϴ�.
������ ��� ������ ���� ����� ����, ��� ������ ����ʹ� �޸� ���� �ν��Ͻ��� car01�� owners �ʵ忡�� ���ο� ���� �߰��Ǿ����� Ȯ���� �� �ֽ��ϴ�.
��ó�� �ܼ��� �θ� Ŭ������ clone() �޼ҵ带 ȣ���Ͽ� clone() �޼ҵ带 �������ϸ�, �迭�̳� �ν��Ͻ��� �ʵ�� �����Ǵ� ���� �ƴ� �ش� �迭�̳� �ν��Ͻ��� ����Ű�� �ּҰ����� �����Ǵ� ���Դϴ�.

���� ��Ȯ�� ������ ���ؼ��� ��� ����ó�� �迭�̳� �ν��Ͻ��� �ʵ忡 ���ؼ��� ������ clone() �޼ҵ带 �����Ͽ� ȣ���ؾ� �մϴ�.
��� ������ �ּ��� �����ϰ� ������⸦ �ٽ� �����ϸ�, ������ ���� ��Ȯ�� ���� ����� ��µ� ���Դϴ�.

���� ���
Car01 : �ƹݶ�, [ȫ�浿]
Car02 : �ƹݶ�, [ȫ�浿]
Car02 : �ƹݶ�, [ȫ�浿, �̼���]
*/