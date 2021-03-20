/*
# �������� ����
# ���μ���(process)��? �ܼ��� ���� ���� ���α׷�(program)�̶�� �� �� ����
(����ڰ� �ۼ��� ���α׷��� �ü���� ���� �޸� ������ �Ҵ�޾� ���� ���� ���� ����)
���μ����� ���α׷��� ���Ǵ� �����Ϳ� �޸� ���� �ڿ� �׸��� ������� ����

# ������(thread)��?
���μ���(process) ������ ������ �۾��� �����ϴ� ��ü�� �ǹ�
��� ���μ������� �� �� �̻��� �����尡 �����Ͽ� �۾��� ������
�� �� �̻��� �����带 ������ ���μ����� ��Ƽ������ ���μ���(multi-threaded process)��� ��

# �������� ������ ����
�����带 �����ϴ� ������� ������ ���� �� ���� ����� ����
1. Runnable �������̽��� �����ϴ� ���
2. Thread Ŭ������ ��ӹ޴� ���

�� ��� ��� �����带 ���� �۾��ϰ� ���� ������ run() �޼ҵ忡 �ۼ��ϸ� ��
���� �� ���� ����� ����Ͽ� �����带 �����ϰ� �����ϴ� ����

�� ������ ���� ����� ���캸��, ������ �����尡 ���� �����ư��� ����ǰ� �ִ� ���� Ȯ���� �� ����
Thread Ŭ������ ��ӹ����� �ٸ� Ŭ������ ��ӹ��� �� �����Ƿ�, �Ϲ������� Runnable �������̽��� �����ϴ� ������� �����带 ����
Runnable �������̽��� ��ü�� ���� �޼ҵ��� run() �޼ҵ� �� �ϳ����� ������ ������ �������̽�
*/
/*
class ThreadWithClass extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(getName()); // ���� ���� ���� �������� �̸��� ��ȯ��.
            try {
                Thread.sleep(10);          // 0.01�ʰ� �����带 ����.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ThreadWithRunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()); // ���� ���� ���� �������� �̸��� ��ȯ��.
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
 
public class ThreadTest {
    public static void main(String[] args){
        ThreadWithClass thread1 = new ThreadWithClass();       // Thread Ŭ������ ��ӹ޴� ���
        Thread thread2 = new Thread(new ThreadWithRunnable()); // Runnable �������̽��� �����ϴ� ���
 
        thread1.start(); // �������� ����
        thread2.start(); // �������� ����
    }
}
*/
/*
# �������� �켱����
�� ������� �켱����(priority)�� ���� �ڽŸ��� �ʵ带 ������ ����
�켱������ ���� Ư�� �����尡 �� ���� �ð� ���� �۾��� �� �� �ֵ��� ������ �� ����

�ʵ�	����
static int MAX_PRIORITY		�����尡 ���� �� �ִ� �ִ� �켱������ �����.
static int MIN_PRIORITY		�����尡 ���� �� �ִ� �ּ� �켱������ �����.
static int NORM_PRIORITY	�����尡 ������ �� ������ �⺻ �켱������ �����.

getPriority()�� setPriority() �޼ҵ带 ���� �������� �켱������ ��ȯ�ϰų� ���� ����
�������� �켱������ ���� �� �ִ� ������ 1���� 10�����̸�, ���ڰ� �������� �켱������ ������ 
������ �������� �켱������ ������� ������ �ƴ� �������� ������� ���� ��
�켱������ 10�� �����尡 �켱������ 1�� �����庸�� 10�� �� ���� ����Ǵ� ���� �ƴ�
���� �켱������ 10�� ������� �켱������ 1�� �����庸�� �� �� ���� ���� ť�� ���ԵǾ�, �� �� ���� �۾� �ð��� �Ҵ���� ��
�׸��� �������� �켱������ �ش� �����带 ������ �������� �켱������ ��ӹް� ��

main() �޼ҵ带 �����ϴ� �������� �켱������ ������ 5�̹Ƿ�, main() �޼ҵ� ������ ������ ������ Thread-0�� �켱������ 5�� �����Ǵ� ���� Ȯ���� �� ����
���� ������ ��� ���ο��� Thread-0�� ���� ����ǰ�, ��� ���ο��� Thread-1�� ���߿� �����
���� ���� ��� ������ �������� �ʴ´ٸ�, Thread-0�� ���� ����ǰ�, Thread-1�� ���߿� ����� ��
������ ��� ���ο��� Thread-1�� �켱������ 10���� �����߱� ������, Thread-1�� ���߿� ����ƴ��� �켱������ Thread-0���� ���� ���� �����
(�׷��� 0�� ���� ����� �� ����)
*/
class ThreadWithRunnable implements Runnable {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName()); // ���� ���� ���� �������� �̸��� ��ȯ��.
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadTest {
	public static void main(String[] args){
		Thread thread1 = new Thread(new ThreadWithRunnable());
		Thread thread2 = new Thread(new ThreadWithRunnable());

		thread2.setPriority(10); // �� Thread-1�� �켱������ 10���� ������.

		thread1.start(); // �� Thread-0 ����
		thread2.start(); // �� Thread-1 ����

		System.out.println(thread1.getPriority());
		System.out.println(thread2.getPriority());
	}
}