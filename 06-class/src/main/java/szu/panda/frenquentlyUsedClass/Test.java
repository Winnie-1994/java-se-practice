package szu.panda.frenquentlyUsedClass;

/*
 * java.lang.String类代表不可变的字符序列
 * String类的常见构造方法：
 * String(String original) 创建一个String对象为original的拷贝
 * String(char[] value) 用一个字符数组创建一个String对象
 * String(char[] value, int offset, int count) 用一个字符数组从offset项开始的count个字符序列创建一个String对象
 * 常用String类方法：valueOf（使用了多态）、split、charAt、length、indexOf、equals、equalsIgnoreCase、replace、starsWith、endsWith、toLowCase、toUpperCase、subString、trim
 *
 * java.lang.StringBuffer代表可变的字符序列
 * StringBuffer和String类似，但StringBuffer可对其字符串进行改变
 * StringBuffer类常见的构造方法：StringBuffer、StringBuffer(String str)
 * 重载方法：append（添加字符序列）、insert（指定位置插入字符序列）、delete、indexOf、reverse等
 */
public class Test {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "world";
		String s3 = "hello";
		
		System.out.println(s1 == s3);  //true
		s1 += s2; //s1值为hello world，构建新的s1
		
		s1 = new String("hello");
		s2 = new String("hello");
		System.out.println(s1 == s2);  //false
		System.out.println(s1.equals(s2));  //true
		
		char c[] = {'s', 'u', 'n', ' ', 'j', 'a', 'v', 'a'};
		String s4 = new String(c);
		String s5 = new String(c,4,4);
		System.out.println(s4);
		System.out.println(s5);
		
		String s = "Microsoft";
		char[] a = {'a', 'b', 'c'};
		StringBuffer sb1 = new StringBuffer(s);
		sb1.append('/').append("IBM");
		System.out.println(sb1);
	}
}