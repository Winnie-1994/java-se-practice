package szu.panda.method;

/*
 * this可看做一个变量，值是当前对象的引用
 */
public class TestThis {

	int i = 0;
	TestThis(int i) { this.i = i;}
	TestThis increament () {
		i++;
		return this;	
	}
	void print() { System.out.println("i = " + i);}
	public static void main(String[] args) {
		TestThis testThis = new TestThis(100);
		testThis.increament().increament().print();
	}

}
