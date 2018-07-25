package szu.panda.object;

/*
 * Java中除基本类型（四类八种）外的变量类型都称为引用类型（占2个字节），引用是指针
 * 类是静态的概念，放在代码区
 * 对象是new出来的，位于堆内存（动态内存）
 * 使用：对象.成员变量/对象.成员方法
 */
public class Dog {
	static int furColor; //Java默认对成员变量初始化
	float height;
	float weight;
	
	void catchMouse(Mouse m) {
		//as;dfj;asdf
		//asdfj;asf
		//m.scream();
	}
	
	public static void main(String[] args) {
		//int i;
		System.out.println(furColor);
		//System.out.println(i); //报错，局部变量必须先初始化
		Dog d = new Dog();
		Mouse m = new Mouse();
		d.catchMouse(m);
	}
}

class Mouse {
	int height;
}
