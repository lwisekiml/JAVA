
public class helloworld {

	public static void main(String[] args) {
		int num = 5;
		boolean exp = true;
		
		System.out.println("Hello World");
		System.out.println(num);
		
		System.out.println("--- if ---");
		if (exp)
			System.out.println("true");
		else
			System.out.println("false");
		
		System.out.println("--- while ---");
		int i = 1;
		while(true) {
			System.out.println(i);
			i++;
			if(i > 5)
				break;
		}
		
		System.out.println("--- for ---");
		for(i = 5; i > 0; i--) {
			System.out.println(i);
		}
		
		
	}

}
