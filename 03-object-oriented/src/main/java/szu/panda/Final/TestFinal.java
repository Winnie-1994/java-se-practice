package szu.panda.Final;

/*
 * final变量不能被改变
 * final方法不能被重写
 * final类不能被继承
 */
public class TestFinal {
	public static void main(String[] args) {
		T t = new T();
		//t.i = 8; //报错，final变量不能被改变
	}
}

final class T { //final类
	final int i = 8; //final变量不能被改变
	public final void m() { //final方法
		//j = 9; //报错，final变量不能被改变
	}
}

//class TT extends T { //报错，final类不能被继承
//	public void m() { //报错，final方法不能被重写
//		//j = 9; 
//	}
//}