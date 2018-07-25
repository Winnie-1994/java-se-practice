package szu.panda.circulation;
//计算1+2！+3！+。。。+10！
public class TestFor {
	public static void main(String[] args) {
		long result = 0;
		long f = 1;
		for (int i = 1; i <= 10 ; i++ )
		{
			f = f * i;
			result += f;
		}
		System.out.println("result=" + result);
	}
}
