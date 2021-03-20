/*
# 스레드의 개념
# 프로세스(process)란? 단순히 실행 중인 프로그램(program)이라고 할 수 있음
(사용자가 작성한 프로그램이 운영체제에 의해 메모리 공간을 할당받아 실행 중인 것을 말함)
프로세스는 프로그램에 사용되는 데이터와 메모리 등의 자원 그리고 스레드로 구성

# 스레드(thread)란?
프로세스(process) 내에서 실제로 작업을 수행하는 주체를 의미
모든 프로세스에는 한 개 이상의 스레드가 존재하여 작업을 수행함
두 개 이상의 스레드를 가지는 프로세스를 멀티스레드 프로세스(multi-threaded process)라고 함

# 스레드의 생성과 실행
스레드를 생성하는 방법에는 다음과 같이 두 가지 방법이 있음
1. Runnable 인터페이스를 구현하는 방법
2. Thread 클래스를 상속받는 방법

두 방법 모두 스레드를 통해 작업하고 싶은 내용을 run() 메소드에 작성하면 됨
위의 두 가지 방법을 사용하여 스레드를 생성하고 실행하는 예제

위 예제의 실행 결과를 살펴보면, 생성된 스레드가 서로 번갈아가며 실행되고 있는 것을 확인할 수 있음
Thread 클래스를 상속받으면 다른 클래스를 상속받을 수 없으므로, 일반적으로 Runnable 인터페이스를 구현하는 방법으로 스레드를 생성
Runnable 인터페이스는 몸체가 없는 메소드인 run() 메소드 단 하나만을 가지는 간단한 인터페이스
*/
/*
class ThreadWithClass extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(getName()); // 현재 실행 중인 스레드의 이름을 반환함.
            try {
                Thread.sleep(10);          // 0.01초간 스레드를 멈춤.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ThreadWithRunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()); // 현재 실행 중인 스레드의 이름을 반환함.
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
        ThreadWithClass thread1 = new ThreadWithClass();       // Thread 클래스를 상속받는 방법
        Thread thread2 = new Thread(new ThreadWithRunnable()); // Runnable 인터페이스를 구현하는 방법
 
        thread1.start(); // 스레드의 실행
        thread2.start(); // 스레드의 실행
    }
}
*/
/*
# 스레드의 우선순위
각 스레드는 우선순위(priority)에 관한 자신만의 필드를 가지고 있음
우선순위에 따라 특정 스레드가 더 많은 시간 동안 작업을 할 수 있도록 설정할 수 있음

필드	설명
static int MAX_PRIORITY		스레드가 가질 수 있는 최대 우선순위를 명시함.
static int MIN_PRIORITY		스레드가 가질 수 있는 최소 우선순위를 명시함.
static int NORM_PRIORITY	스레드가 생성될 때 가지는 기본 우선순위를 명시함.

getPriority()와 setPriority() 메소드를 통해 스레드의 우선순위를 반환하거나 변경 가능
스레드의 우선순위가 가질 수 있는 범위는 1부터 10까지이며, 숫자가 높을수록 우선순위가 높아짐 
하지만 스레드의 우선순위는 비례적인 절댓값이 아닌 어디까지나 상대적인 값일 뿐
우선순위가 10인 스레드가 우선순위가 1인 스레드보다 10배 더 빨리 수행되는 것이 아님
단지 우선순위가 10인 스레드는 우선순위가 1인 스레드보다 좀 더 많이 실행 큐에 포함되어, 좀 더 많은 작업 시간을 할당받을 뿐
그리고 스레드의 우선순위는 해당 스레드를 생성한 스레드의 우선순위를 상속받게 됨

main() 메소드를 실행하는 스레드의 우선순위는 언제나 5이므로, main() 메소드 내에서 생성된 스레드 Thread-0의 우선순위는 5로 설정되는 것을 확인할 수 있음
위의 예제는 ②번 라인에서 Thread-0이 먼저 실행되고, ③번 라인에서 Thread-1이 나중에 실행됨
따라서 만약 ①번 라인이 존재하지 않는다면, Thread-0이 먼저 실행되고, Thread-1이 나중에 실행될 것
하지만 ①번 라인에서 Thread-1의 우선순위를 10으로 변경했기 때문에, Thread-1이 나중에 실행됐더라도 우선순위가 Thread-0보다 높아 먼저 실행됨
(그러나 0이 먼저 실행될 수 있음)
*/
class ThreadWithRunnable implements Runnable {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName()); // 현재 실행 중인 스레드의 이름을 반환함.
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

		thread2.setPriority(10); // ① Thread-1의 우선순위를 10으로 변경함.

		thread1.start(); // ② Thread-0 실행
		thread2.start(); // ③ Thread-1 실행

		System.out.println(thread1.getPriority());
		System.out.println(thread2.getPriority());
	}
}