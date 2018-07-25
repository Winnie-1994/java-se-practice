package szu.panda.method.constructor;

/*
 * 构造函数：和new一起使用
 * 构造方法名为类名，前面没有返回值，不能加void。
 * 类中没有自定义构造方法，则系统自动生成构造方法
 */
public class Person {

	int id;
	int age;
	Person (int _id, int _age) {
		id = _id;
		age = _age;
	}
	
	public static void main(String[] args) {
		Person tom = new Person(1,25);
		Person join = new Person(2,27);
		Point p = new Point();
	}

}

class Point{
	int x;
	int y;
}
