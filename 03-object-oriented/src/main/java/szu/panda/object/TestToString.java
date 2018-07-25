package szu.panda.object;

/*
 * Object类之toString方法：
 * 建议类中对toString方法进行重写。Object中的toString默认返回类名+哈希编码。
 * 程序运行时，对象的地址用哈希编码来记录。
 */
public class TestToString {
	public static void main(String[] args) {
		Dog2 d = new Dog2();
		System.out.println("d:=" + d);
	}
}

class Dog2 {
	public String toString() {
		return "I'm a cool dog!";
	}
}