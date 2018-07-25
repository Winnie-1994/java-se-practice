package szu.panda.object;

/*
 * Object类之equals方法：
 * 需对equals方法进行重写
 */
public class TestEquals {
	public static void main(String[] args) {
		Cat c1 = new Cat(1, 2, 3);
		Cat c2 = new Cat(1, 2, 3);
		System.out.println(c1 == c2); //比较的是地址
		System.out.println(c1.equals(c2));
		
		String s1 = new String("hello");
		String s2 = new String("hello");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2)); //string类中有对toString方法进行重写
	}
}

class Cat {
	int color;
	int height, weight;
	
	public Cat(int color, int height, int weight) {
		this.color = color;
		this.height = height;
		this.weight = weight;
	}
	
	public boolean equals(Object obj) {
		if(obj == null) return false;
		else {
			if(obj instanceof Cat) { //如果obj是Cat对象的引用
				Cat c = (Cat)obj; //对象转型
				if(c.color == this.color && c.height == this.height && c.weight == this.weight) {
					return true;
				}
			}
		}
		
		return false;
	}
	
}