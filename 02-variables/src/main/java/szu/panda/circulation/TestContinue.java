package szu.panda.circulation;

public class TestContinue {

	public static void main(String[] args) {
		int skip = 4;
	    for (int i = 1; i <= 5; i++) {
	        //退出当次循环
	        if (i == skip) continue;
	        System.out.println(" i= " + i);
	     }

	}

}
