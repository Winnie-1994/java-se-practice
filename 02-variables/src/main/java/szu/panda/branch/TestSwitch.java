package szu.panda.branch;

public class TestSwitch {
	public static void main(String[] args) {
		int i = 8;
		//参数只能为int类型，其他可自动转换成int的也可以，如byte、shot、char
		switch(i) {
			case 8 :
				System.out.println("A");
			case 3 :
			case 2 :
				System.out.println("C");
				break;
			case 9 :
				System.out.println("D");
				break;
			default:
				System.out.println("error");
		}
	}
}