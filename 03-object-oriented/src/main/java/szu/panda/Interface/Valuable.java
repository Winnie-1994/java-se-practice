package szu.panda.Interface;

/*
 * 接口是一种特殊的抽象类，只包含常量和方法的定义，没有变量和方法的实现。
 * 接口可以多重实现：一个类可实现多个接口
 * 接口里的成员变量默认是、也只能是public static final。
 * 接口中只能定义抽象方法，而且这些方法默认为、也只能为public的
 * 接口可继承其他的接口，并添加新的属性和方法。
 * 多个无关的类可实现同一个接口
 * 一个类可实现多个无关的接口
 * 与继承关系类似，接口与实现类之间存在多态性。
 * 接口与接口间可实现继承，类与类之间可实现继承，接口与类不可实现继承
 */
public interface Valuable {
	public double getMoney();
}

interface Protectable {
	public void beProtected();
}

interface A extends Protectable {
	void m();
	void getMoney();
}

abstract class Animal {
	private String name;
	
	abstract void enjoy();
}

class GoldenMonkey extends Animal implements Valuable, Protectable { //一个类可实现多个无关的接口
	public double getMoney() {
		return 10000;
	}
	
	public void beProtected() {
		System.out.println("live in the room");
	}
	
	public void enjoy() {
		
	}
	
	public void test() {
		Valuable v = new GoldenMonkey();
		v.getMoney();
		Protectable p = (Protectable)v;
		p.beProtected();
	}
}

class Hen implements A{ 
	public void m() {}
	public void beProtected() {}
	public void getMoney() {}
}