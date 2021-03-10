

/*
# ���� �߻� �� ȸ��
# ���� �߻���Ű��
throw Ű���带 ����Ͽ� ������ ���ܸ� �߻���ų �� ����

Exception e = new Exception("�����޽���");
...
throw e;

���� ��ó�� �����ڿ� ���޵� ���ڿ��� getMessage() �޼ҵ带 ����Ͽ� ���� �޽����� ����� �� ����


# ���� ȸ���ϱ�
�޼ҵ� ����ο� throws Ű���带 ����Ͽ� �ش� �޼ҵ带 ����� �� �߻��� �� �ִ� ���ܸ� �̸� ����� ���� ����
�̷��� �ϸ� �ش� �޼ҵ带 ����� �� �߻��� �� �ִ� ���ܸ� ����ڰ� ����� ������ �� ������, �׿� ���� ó�������� ������ �� ����
���� ������ �ִ� ���α׷��� �ս��� �ۼ��� �� �ֵ��� ������ �� ����

ȣ��� �޼ҵ忡�� �߻��� ���ܸ� ȣ��� �޼ҵ忡�� ó���ϴ� ����
���� ���
ȣ��� �޼ҵ忡�� ���ܰ� ó����!

�̶� ȣ��� �޼ҵ��� try / catch ���� �����ϸ� ������ ������ �߻�
�� �޼ҵ带 ȣ���� main() �޼ҵ�� ȣ��� �޼ҵ忡�� ���ܰ� �߻��� ����� �� �� ����
*/

//public class ExceptionError_Occurrence_Avoidance {
//	static void handlingException() {
//		try {
//			throw new Exception();
//		} catch (Exception e) {
//			System.out.println("ȣ��� �޼ҵ忡�� ���ܰ� ó����!");
//		}
//	}
//
//	public static void main(String[] args) {
//		try {
//			handlingException();
//		} catch (Exception e) {
//			System.out.println("main() �޼ҵ忡�� ���ܰ� ó����!");
//		}
//	}
//}


/*
throws Ű���带 ����Ͽ� ȣ��� �޼ҵ忡�� �߻��� ���ܸ� ȣ���� �޼ҵ�� �ѱ�� ����
���� ���
main() �޼ҵ忡�� ���ܰ� ó����!

ȣ��� �޼ҵ忡�� try / catch ���� ������ �� ����
ȣ��� �޼ҵ忡�� �߻��� ���ܸ� �ش� �޼ҵ带 ȣ���� main() �޼ҵ忡�� ó���� �� �ְ� ��
*/
//public class ExceptionError_Occurrence_Avoidance {
//	static void handlingException() throws Exception { throw new Exception(); }
//
//	public static void main(String[] args) {
//		try {
//			handlingException();
//		} catch (Exception e) {
//			System.out.println("main() �޼ҵ忡�� ���ܰ� ó����!");
//		}
//	}
//}

/*
# ����� ���� ���� Ŭ����
Exception Ŭ������ ��ӹ޾� �ڽŸ��� ���ο� ���� Ŭ������ �����Ͽ� ����� �� ����
����� ���� ���� Ŭ�������� �����ڻӸ� �ƴ϶� �ʵ� �� �޼ҵ嵵 ���ϴ� ��ŭ �߰��� �� ����

�Ʒ� ���� Exception Ŭ������ �ƴ� ���� ó���� �������� �ʴ� RuntimeException Ŭ������ ��ӹ޾� �ۼ��ϴ� ��찡 ����
*/
class MyException extends RuntimeException {
    MyException(String errMsg) {
        super(errMsg);
    }
}
/*
# try-with-resources ��
Java SE 7���ʹ� ����� �ڿ��� �ڵ����� ������ �ִ� try-with-resources ���� ����� �� �ֽ��ϴ�.

- ����
try (���������ų��ڿ����Ҵ��ϴ¸�ɹ�) {
     ...
}

���� ���� try ��Ͽ� ��ȣ(())�� �߰��Ͽ� ������ ���ų� �ڿ��� �Ҵ��ϴ� ��ɹ��� ����ϸ�, �ش� try ����� �����ڸ��� �ڵ����� ������ �ݰų� �Ҵ�� �ڿ��� ������ ��
*/


//���Ͽ��� ���ڿ��� �� �� �о���� �����Դϴ�.
static String readFile(String filePath) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader(filePath));
    try {
        return br.readLine();
    } finally {
        if (br != null)
            br.close();
    }
}
/*
���� ���� Java SE 7 ���������� finally ����� ����Ͽ� ����� ������ �ݾ���� ����
������ try-with-resources ���� ����ϸ� ������ ���� �ڵ����� ������ �ݱ⸦ ������ �� ����
*/
static String readFile(String filePath) throws IOException {
    try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
        return br.readLine();
    }
}
