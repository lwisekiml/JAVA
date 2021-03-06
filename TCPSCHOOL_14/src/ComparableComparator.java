import java.util.*;
/*
# Comparable�� Comparator
# Comparable<T> �������̽�
Comparable �������̽��� ��ü�� �����ϴ� �� ���Ǵ� �޼ҵ��� compareTo() �޼ҵ带 �����ϰ� ����
�ڹٿ��� ���� Ÿ���� �ν��Ͻ��� ���� ���ؾ߸� �ϴ� Ŭ�������� ��� Comparable �������̽��� �����ϰ� ����
Boolean�� ������ ���� Ŭ������ String, Time, Date�� ���� Ŭ������ �ν��Ͻ��� ��� ���� ����
�̶� �⺻ ���� ������ ���� ������ ū ������ ���ĵǴ� ���������� ��

Comparable �������̽��� ������ ���� �޼ҵ带 ����Ͽ� ��ü�� ���� ��
�޼ҵ�				����
int compareTo(T o)	�ش� ��ü�� ���޵� ��ü�� ������ ����.

�ν��Ͻ��� �񱳸� ���� ����� ���� Ŭ������ Car Ŭ������ Comparable �������̽��� �����ϴ� ����
*/
class Car implements Comparable<Car>{
    private String modelName;
    private int modelYear;
    private String color;

    Car(String mn, int my, String c) {
        this.modelName = mn;
        this.modelYear = my;
        this.color = c;
    }

    public String getModel() {
        return this.modelYear + "�� " + this.modelName + " " + this.color;
    }
    
    public int getModelYear() {
    	return this.modelYear;
    }

    public int compareTo(Car obj) {
        if (this.modelYear == obj.modelYear) {
            return 0;
        } else if(this.modelYear < obj.modelYear) {
            return -1;
        } else {
            return 1;
        }
    }
}

public class ComparableComparator {
    public static void main(String[] args) {
        Car car01 = new Car("�ƹݶ�", 2016, "�����");
        Car car02 = new Car("�ҳ�Ÿ", 2010, "���");
 
        System.out.println(car01.compareTo(car02));
    }
}

/*
# Comparator<T> �������̽�
��ü�� �����ϴ� �� ���Ǵ� �������̽�

���������̳� �ٸ� �������� �����ϰ� ���� �� ����� �� ����(Comparator �������̽��� �����ϸ� �������� �̿��� �������ε� ������ �� �ְ� �Ǵ� ��)
�̶� Comparator �������̽��� ������ Ŭ���������� compare() �޼ҵ带 �������Ͽ� ���

Comparator �������̽��� ������ ���� �޼ҵ带 ����Ͽ� ��ü�� ����
�޼ҵ�	����
int compare(T o1, T o2)		���޵� �� ��ü�� ������ ����.
boolean equals(Object obj)	�ش� comparator�� ���޵� ��ü�� �������� Ȯ����.
default Comparator<T> reversed()	�ش� comparator�� ������ comparator�� ��ȯ��.

��Ҹ� ������������ �����Ͽ� �����ϴ� TreeSet �ν��Ͻ��� �����ϱ� ���� Comparator �������̽��� �����ϴ� ����
*/
class DescendingOrder implements Comparator<Integer> {
    public int compare(Integer o1, Integer o2) {
        if(o1 instanceof Comparable && o2 instanceof Comparable) {
        	System.out.println("in");
            Integer c1 = (Integer)o1;
            Integer c2 = (Integer)o2;
            return c2.compareTo(c1);
        }
        System.out.println("-1");
        return -1;
    }
}

public class ComparableComparator {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<Integer>(new DescendingOrder());

        ts.add(30);
        ts.add(40);
        ts.add(20);
        ts.add(10);

        Iterator<Integer> iter = ts.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
