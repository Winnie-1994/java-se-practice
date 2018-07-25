package szu.panda.inherit;

/*
 * Java只支持单继承，不允许多继承
 * 子类对象继承了父类对象所有的东西
 * super关键字：指向当前对象里的父对象
 */
class FatherClass {
    public int value; //值为0
    public void f(){
        value = 100;
        System.out.println
        ("FatherClass.value="+value);
    }
}

class ChildClass extends FatherClass {
    public int value; //值为0，和父类的value不是同一个
    public void f() { //重写父类的方法
        super.f(); //指向当前对象里的父对象，父类对象的value值变成100
        value = 200;
        System.out.println
             ("ChildClass.value="+value);
        System.out.println(value);
        System.out.println(super.value);
    }
}

public class TestInherit {
	public static void main(String[] args) {
		ChildClass cc = new ChildClass();
		cc.f();
	}
}
