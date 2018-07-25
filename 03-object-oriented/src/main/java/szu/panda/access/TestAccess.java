package szu.panda.access;

/*
 * private：同类内部可访问
 * default：同类、同包内部可访问
 * protected：同类、同包、子类内部可访问
 * public：可在任意地方被访问
 * 对于class的权限修饰只可以用public和default
 */
public class TestAccess {
}

class T {
	private int i = 0;
	int j = 0; //default类型
	protected int k = 0;
	public int m = 0;
	
	public void m() {
		i = 9;
	}
}

class TT {
	public void m() {
		T t = new T();
		System.out.println(t.j);
	}
}