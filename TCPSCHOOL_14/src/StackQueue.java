import java.util.LinkedList;
import java.util.Stack;

public class StackQueue {
	public static void main(String[] args) {
/*
# Stack과 Queue

1. Stack<E> 클래스
List 컬렉션 클래스의 Vector 클래스를 상속받아, 전형적인 스택 메모리 구조의 클래스를 제공
스택 메모리 구조는 선형 메모리 공간에 데이터를 저장하면서 후입선출(LIFO)의 시멘틱을 따르는 자료 구조

스택 메모리 구조를 표현하기 위해, Vector 클래스의 메소드를 5개만 상속받아 사용
메소드	설명
boolean empty()			해당 스택이 비어 있으면 true를, 비어 있지 않으면 false를 반환함.
E peek()				해당 스택의 제일 상단에 있는(제일 마지막으로 저장된) 요소를 반환함.
E pop()					해당 스택의 제일 상단에 있는(제일 마지막으로 저장된) 요소를 반환하고, 해당 요소를 스택에서 제거함.
E push(E item)			해당 스택의 제일 상단에 전달된 요소를 삽입함.
int search(Object o)	해당 스택에서 전달된 객체가 존재하는 위치의 인덱스를 반환함.

이때 인덱스는 제일 상단에 있는(제일 마지막으로 저장된) 요소의 위치부터 0이 아닌 1부터 시작함

더욱 복잡하고 빠른 스택을 구현하고 싶다면 Deque 인터페이스를 구현한 ArrayDeque 클래스를 사용하면 됨
ex) Deque<Integer> st = new ArrayDeque<Integer>();

단, ArrayDeque 클래스는 Stack 클래스와는 달리 search() 메소드는 지원X

여러 Stack 메소드를 이용하여 스택 메모리 구조를 구현한 예제
*/
		System.out.println("--- stack ---");
		Stack<Integer> st = new Stack<Integer>(); // 스택의 생성
		//Deque<Integer> st = new ArrayDeque<Integer>();

		// push() 메소드를 이용한 요소의 저장
		st.push(4);
		st.push(2);
		st.push(3);
		st.push(1);

		// peek() 메소드를 이용한 요소의 반환
		System.out.println(st.peek());
		System.out.println(st);

		// pop() 메소드를 이용한 요소의 반환 및 제거
		System.out.println(st.pop());
		System.out.println(st);

		// search() 메소드를 이용한 요소의 위치 검색
		System.out.println(st.search(4));
		System.out.println(st.search(3));
/*
2. Queue<E> 인터페이스
클래스로 구현된 스택과는 달리 자바에서 큐 메모리 구조는 별도의 인터페이스 형태로 제공

Queue 인터페이스를 상속받는 하위 인터페이스
1. Deque<E>
2. BlockingDeque<E>
3. BlockingQueue<E>
4. TransferQueue<E>

Queue 인터페이스를 직간접적으로 구현한 클래스는 상당히 많음
Deque 인터페이스를 구현한 LinkedList 클래스가 큐 메모리 구조를 구현하는 데 가장 많이 사용

큐 메모리 구조는 선형 메모리 공간에 데이터를 저장하면서 선입선출(FIFO)의 시멘틱을 따르는 자료 구조

Queue 인터페이스는 큐 메모리 구조를 표현하기 위해, 다음과 같은 Collection 인터페이스 메소드만을 상속받아 사용
메소드	설명
boolean add(E e)	해당 큐의 맨 뒤에 전달된 요소를 삽입함. 
					만약 삽입에 성공하면 true를 반환하고, 큐에 여유 공간이 없어 삽입에 실패하면 IllegalStateException을 발생시킴.

E element()			해당 큐의 맨 앞에 있는(제일 먼저 저장된) 요소를 반환함.

boolean offer(E e)	해당 큐의 맨 뒤에 전달된 요소를 삽입함.

E peek()			해당 큐의 맨 앞에 있는(제일 먼저 저장된) 요소를 반환함.
					만약 큐가 비어있으면 null을 반환함.

E poll()			해당 큐의 맨 앞에 있는(제일 먼저 저장된) 요소를 반환하고, 해당 요소를 큐에서 제거함.
					만약 큐가 비어있으면 null을 반환함.

E remove()			해당 큐의 맨 앞에 있는(제일 먼저 저장된) 요소를 제거함.

더욱 복잡하고 빠른 큐를 구현하고 싶다면 Deque 인터페이스를 구현한 ArrayDeque 클래스를 사용
ex) Deque<Integer> qu = new ArrayDeque<Integer>();

여러 LinkedList 메소드를 이용하여 큐 메모리 구조를 구현한 예제
Java SE 6부터 지원되는 ArrayDeque 클래스는 스택과 큐 메모리 구조를 모두 구현하는데 가장 적합한 클래스입니다.
*/
		System.out.println("--- queue ---");
		LinkedList<String> qu = new LinkedList<String>(); // 큐의 생성
		//Deque<String> qu = new ArrayDeque<String>();

		// add() 메소드를 이용한 요소의 저장
		qu.add("넷");
		qu.add("둘");
		qu.add("셋");
		qu.add("하나");

		// peek() 메소드를 이용한 요소의 반환
		System.out.println(qu.peek());
		System.out.println(qu);

		// poll() 메소드를 이용한 요소의 반환 및 제거
		System.out.println(qu.poll());
		System.out.println(qu);

		// remove() 메소드를 이용한 요소의 제거
		qu.remove("하나");
		System.out.println(qu);
	}
}
