import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class StreamTest {
	public static void main(String[] args) {
/*
# ��Ʈ��(stream) : ������ �Է��̳� ����� ǥ���� �������� �̻�ȭ�� �帧�� �ǹ�
(�ü���� ���� �����Ǵ� ������ ���� ���� �ǹ��ϸ�, �߰� �Ű��� ������ �մϴ�.)

�ڹٴ� �����̳� �ܼ��� ������� ���� �ٷ��� �ʰ�, ��Ʈ��(stream)�̶�� �帧�� ���� �ٷ�


# ����� ��Ʈ��
��Ʈ���� �� �������θ� ����� �� �����Ƿ�, �Է°� ����� ���ÿ� ó���� ���� ����
java.io ��Ű���� ���� InputStream�� OutputStream Ŭ������ ������ �����ϸ�
�ڹٿ����� ��Ʈ�� �����̶� �̷��� ��Ʈ�� Ŭ���� Ÿ���� �ν��Ͻ��� �����Ѵٴ� �ǹ�

InputStream Ŭ�������� read() �޼ҵ尡, OutputStream Ŭ�������� write() �޼ҵ尡 ���� �߻� �޼ҵ�� ����

Ŭ����			�޼ҵ�									����
InputStream		abstract int read()						�ش� �Է� ��Ʈ�����κ��� ���� ����Ʈ�� �о����.
				int read(byte[] b)						�ش� �Է� ��Ʈ�����κ��� Ư�� ����Ʈ�� �о���� ��, �迭 b�� ������.
				int read(byte[] b, int off, int len)	�ش� �Է� ��Ʈ�����κ��� len ����Ʈ�� �о���� ��, �迭 b[off]���� ������.

OutputStream	abstract void write(int b)				�ش� ��� ��Ʈ���� Ư�� ����Ʈ�� ������.
				void write(byte[] b)					�迭 b�� Ư�� ����Ʈ�� �迭 b�� ���̸�ŭ �ش� ��� ��Ʈ���� ������.
				void write(byte[] b, int off, int len)	�迭 b[off]���� len ����Ʈ�� �ش� ��� ��Ʈ���� ������.

read() �޼ҵ�� �ش� �Է� ��Ʈ������ �� �̻� �о���� ����Ʈ�� ������, -1�� ��ȯ�ؾ� �ϳ�
��ȯ Ÿ���� byte Ÿ������ �ϸ�, 0���� 255������ ����Ʈ ������ ǥ���� �� ������ -1�� ǥ���� �� ���� �Ǿ�
InputStream�� read() �޼ҵ�� ��ȯ Ÿ���� int������ �����ϰ� ����

# ����Ʈ ��� ��Ʈ��
��Ʈ���� �⺻������ ����Ʈ ������ �����͸� ����

�ڹٿ����� ������ ���� �پ��� ����Ʈ ����� ����� ��Ʈ���� ����
�Է� ��Ʈ��					��� ��Ʈ��					����� ���
FileInputStream			FileOutputStream		����
ByteArrayInputStream	ByteArrayOutputStream	�޸�
PipedInputStream		PipedOutputStream		���μ���
AudioInputStream		AudioOutputStream		����� ��ġ

# ���� ��Ʈ��
������ �����͸� �ְ���� ���� ������, �ٸ� ��Ʈ���� ����� ����Ű�ų� ���ο� ����� �߰��� �ִ� ��Ʈ��

�ڹٿ����� ������ ���� �پ��� ���� ��Ʈ���� ����
�Է� ��Ʈ��					��� ��Ʈ��					����
FilterInputStream		FilterOutputStream		���͸� �̿��� �����
BufferedInputStream		BufferedOutputStream	���۸� �̿��� �����
DataInputStream			DataOutputStream		����� ��Ʈ�����κ��� �ڹ��� �⺻ Ÿ������ �����͸� �о�� �� �ְ� ��.
ObjectInputStream		ObjectOutputStream		�����͸� ��ü ������ �аų�, �о� ���� ��ü�� ������ȭ��Ŵ.
SequenceInputStream		X						�� ���� �Է� ��Ʈ���� �������� ������.
PushbackInputStream		X						�ٸ� �Է� ��Ʈ���� ���۸� �̿��Ͽ� push back�̳� unread�� ���� ����� �߰���.
X						PrintStream				�ٸ� ��� ��Ʈ���� ���۸� �̿��Ͽ� �پ��� �����͸� ����ϱ� ���� ����� �߰���.

# ���� ��� ��Ʈ��
��Ʈ���� �⺻������ ����Ʈ ������ �����͸� �����ϳ�
���� ���� Ÿ���� char ���� 2����Ʈ�̹Ƿ�, 1����Ʈ�� ���۵Ǵ� ����Ʈ ��� ��Ʈ�����δ� ��Ȱ�� ó���� ���� ��찡 �־
����Ʈ ��� ��Ʈ���Ӹ� �ƴ϶� ���� ����� ��Ʈ���� ������ ����
�̷��� ���� ��� ��Ʈ���� ������ ����Ʈ ��� ��Ʈ������ InputStream�� Reader��, OutputStream�� Writer�� �����ϸ� ����� �� ����

�ڹٿ����� ������ ���� �پ��� ���� ����� ����� ��Ʈ���� ����
�Է� ��Ʈ��			��� ��Ʈ��			����� ���
FileReader		FileWriter		����
CharArrayReader	CharArrayWriter	�޸�
PipedReader		PipedWriter		���μ���
StringReader	StringWriter	���ڿ�

���� ����� ���� ��Ʈ���� ������ ���� ����
�Է� ��Ʈ��			��� ��Ʈ��			����
FilterReader	FilterWriter	���͸� �̿��� �����
BufferedReader	BufferedWriter	���۸� �̿��� �����
PushbackReader	X				�ٸ� �Է� ��Ʈ���� ���۸� �̿��Ͽ� push back�̳� unread�� ���� ����� �߰���.
X				PrintWriter		�ٸ� ��� ��Ʈ���� ���۸� �̿��Ͽ� �پ��� �����͸� ����ϱ� ���� ����� �߰���.


# ���� �����
# ǥ�� �����
�ְܼ� ���� ǥ�� ����� ��ġ�� ���� System�̶�� ǥ�� ����� Ŭ������ �����ϰ� ����
java.lang ��Ű���� ���ԵǾ� �ִ� System Ŭ������ ǥ�� ������� ���� ������ ���� Ŭ���� ������ ����
Ŭ���� ����		����� ��Ʈ��	����
System.in	InputStream	�ַܼκ��� �����͸� �Է¹���.
System.out	PrintStream	�ַܼ� �����͸� �����.
System.err	PrintStream	�ַܼ� �����͸� �����.

ǥ�� ����� ��Ʈ���� �ڹٰ� �ڵ����� �����ϹǷ�, �����ڰ� ������ ��Ʈ���� �������� �ʾƵ� ����� �� ����

# ǥ�� ������� ��� ����
�ռ� ���캻 �� ���� ����� ��Ʈ���� ��� �ְܼ� ���� ǥ�� ����� ��ġ�� ������� �ϳ�
���� System �޼ҵ带 ����ϸ� ��Ʈ���� ����� �ٸ� ����� ��ġ�� ������ �� ����

�޼ҵ�								����
static void setIn(InputStream in)	�Է� ��Ʈ���� ����� ���޵� �Է� ��Ʈ������ ������.
static void setOut(PrintStream out)	��� ��Ʈ���� ����� ���޵� ��� ��Ʈ������ ������.
static void setErr(PrintStream err)	��� ��Ʈ���� ����� ���޵� ��� ��Ʈ������ ������.

# RandomAccessFile Ŭ����
�ռ� ���캻 �پ��� ����� ��Ʈ���� �̿��ϸ� ���Ͽ� ���������� ����� �۾��� ������ �� ����
�������� ������ �ƴ� ������ ������ �����Ͽ� �۾��� �����ϰ� �ʹٸ�, RandomAccessFile Ŭ������ ���
�� Ŭ������ ���ϸ��� ������� �ϸ�, ������ �������� ������� ���ÿ� ������ �� ���� 

RandomAccessFile Ŭ������ �����ڿ��� �μ��� ������ �̸��Ӹ� �ƴ϶� ���� ������ �Բ� �����ؾ� ��
���� ���� ������ ��� �뵵�� ��Ÿ���� ���ڿ���, �ڹٿ��� ����� �� �ִ� ��ǥ���� ���� ���� ������ ����

���� ���	����
"r"		������ ������ �д� �͸� ������ ���� ������.
"rw"	������ �а� ���� ���� ��� ������ ���� ������. ���� ������ ������ ���ο� ������ ������.

getFilePointer() �޼ҵ带 ����ϸ� ���� �������� ���� ��ġ�� Ȯ���� �� ����
seek() �޼ҵ带 ����ϸ� ���� �������� ��ġ�� ������ �� ����
*/
		System.out.println("--- RandomAccessFile class ---");
		try {
			// "rw" ���� "data.txt" ������ ������.
			RandomAccessFile file = new RandomAccessFile("data.txt", "rw");
			System.out.println(file.getFilePointer()); // 0 : ���� �������� ���� ��ġ�� ��ȯ��.
			file.writeInt(10);                         // ���� 10�� ������.
			System.out.println(file.getFilePointer()); // 4
			file.seek(20);                             // ���� �������� ��ġ�� 20���� �̵���Ŵ.
			System.out.println(file.getFilePointer()); // 20
		} catch (IOException e) {
			e.printStackTrace();
		}

/*
# File Ŭ����
�ռ� ���캻 ����� ��Ʈ���� ����ϸ� ������ ���� ����� �۾��� ������ �� ������
������ ���ų� ���͸��� ���� �۾� ���� ����� ��Ʈ���� ���ؼ��� ������ �� ����
�̷��� ����� �۾� �̿��� ���ϰ� ���͸��� ���� �۾��� File Ŭ������ ���� ó���ϵ��� �ϰ� ����

File Ŭ�������� ���� ���� �۾��� ���� �پ��� �޼ҵ尡 ���ǵǾ� ����
�޼ҵ�					����
boolean canRead()		�ش� ������ ���� �� �ִ� ���������� �˻���.
boolean canWrite()		�ش� ������ �� �� �ִ� ���������� �˻���.
boolean delete()		�ش� ���� �Ǵ� ���͸��� ������.
boolean exists()		�ش� ������ �����ϴ����� �˻���.
String getPath()		�ش� ������ ��θ��� ���ڿ��� ��ȯ��.
boolean isAbsolute()	�ش� ������ ��θ��� ���� ��������� �˻���.
boolean isDirectory()	�ش� ������ ���͸������� �˻���.
boolean isFile()		�ش� ������ ���������� �˻���.
long length()			�ش� ������ ũ�⸦ ��ȯ��.
boolean mkdir()			������ ��ο� ���͸��� ������.
boolean mkdirs()		������ ��ο� ���͸��� �����ϸ�, �ʿ��� ��� ���� ���͸��� ������.
boolean renameTo(File dest)	�ش� ������ �̸��� ���޵� ���� �̸����� ������.

boolean setExecutable(boolean executable)
boolean setReadable(boolean readable)
boolean setWritable(boolean writable)
boolean setReadOnly()
�ش� ������ �Ӽ��� ������.
*/
		System.out.println("--- File class ---");
		File dir = new File("D:\\data");       // ���͸� ����
		File file = new File(dir, "data.txt"); // ���� ����
		if(!file.exists()) {                   // ������ �����Ǿ������� Ȯ����.
			System.out.println("������ �������� �ʽ��ϴ�.");
			System.exit(0);
		}
		System.out.println(file.getPath());    // D:\data\data.txt
		System.out.println(file.length());     // ������ ũ�⸦ ��ȯ��.
	}
}
