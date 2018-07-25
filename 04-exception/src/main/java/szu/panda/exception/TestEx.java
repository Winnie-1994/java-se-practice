package szu.panda.exception;

/*
 * 异常：是运行期出现的错误，不是编译期出现的错误，如数组下表越界、缓冲区
 * 异常的捕获和处理
 * 观察错误的名字和行号最重要
 * finally语句一定会被执行，提供统一出口，能够对程序的状态做统一的管理，通常进行资源的清除工作，如关闭打开的文件、删除临时文件
 * 掌握常见的exception，catch，查找JAVA文档。
 * 
 * 掌握：
 * 一个图（异常的分类）：throwable分为error、exception两类，其中error为系统错误，无法处理，exception可处理。exception又可分为两类：runtimeException（可不处理）、其他exception（必须处理）
 * 5个关键字：try、catch、finally、throw、throws
 * 先catch小的，再catch大的
 * 异常和重写的关系：自定义的异常：继承后重写方法，需抛出与原方法所抛出异常类型一致异常或不抛出异常。
 */
import java.io.*;

public class TestEx {

	public static void main(String[] args) {

		try {
			new TestEx().f2();
		} catch (IOException e) {
			e.printStackTrace();
		}

		/*
		 * int[] arr = {1, 2, 3}; System.out.println(arr[2]); try {
		 * System.out.println(2/0); } catch (ArithmeticException e) {
		 * System.out.println("系统正在维护,请与管理员联系"); e.printStackTrace(); }
		 */

		// TestEx te = new TestEx();
		// te.m(0);

		/*
		 * try { new TestEx().m(0); } catch (ArithmeticException ae) {
		 * ae.printStackTrace(); System.out.println("出错了"); }
		 */

		FileInputStream in = null;

		try {
			in = new FileInputStream("myfile.txt");
			int b;
			b = in.read();
			while (b != -1) {
				System.out.print((char) b);
				b = in.read();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) { // IOException中包含FileNotFoundException，若放在FileNotFoundException前面，会报错
			System.out.println(e.getMessage());
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	void m(int i) throws ArithmeticException {
		if (i == 0)
			throw new ArithmeticException("被除数为0");
	}

	void f() throws FileNotFoundException, IOException {
		FileInputStream in = new FileInputStream("myfile.txt");
		int b;
		b = in.read();
		while (b != -1) {
			System.out.print((char) b);
			b = in.read();
		}
	}

	void f2() throws IOException {
		/*
		 * try { f(); } catch (FileNotFoundException e) {
		 * System.out.println(e.getMessage()); } catch (IOException e) {
		 * e.printStackTrace(); }
		 */
		f();
	}

	// 使用自定义的异常
	public void regist(int num) throws MyException {
		if (num < 0) {
			throw new MyException("人数为负值，不合理", 3);
		}
		System.out.println("等级人数" + num); // 若以上抛出了异常，此句将不会执行。
	}

	public void manager() {
		try {
			regist(-100);
		} catch (MyException e) {
			System.out.println("登记失败，出错类型码=" + e.getId());
			e.printStackTrace();
		}
		System.out.print("操作结束");
	}

}

// 自定义的异常
class MyException extends Exception {
	private int id;

	public MyException(String message, int id) {
		super(message);
		this.id = id; // 每个不同的异常有自己的id
	}

	public int getId() {
		return id;
	}
}
