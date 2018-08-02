package szu.panda.frenquentlyUsedClass;

/*
 * 枚举类型：
 * 只能取特定值中的一个
 * 使用enum关键字
 * 是java.lang.Enum类型
 */
public class TestEnum {
	public enum MyColor { red, green, blue }; //定义了一种新的类型，不是变量。
	public enum MyDoorOpener {me, mywife};
	
	public static void main(String[] args) {
		MyColor m = MyColor.red;
		switch(m) {
			case red:
				System.out.println("red");
				break;
			case green:
				System.out.println("green");
				break;
			default:
				System.out.println("default");
		}
		System.out.println(m);
	}
}
