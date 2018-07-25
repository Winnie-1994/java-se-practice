package szu.panda.recursion;

//非递归防范解决Fibonacci数列问题
public class Fibon {
	public static void main(String args[]){
	   int a[] = new int[41];
	    a[1] = a[2] = 1;
	   for (int i=3; i<=40; i++ )
	   {
		   a[i] = a[i-1] + a[i-2];
	   }
	   System.out.println("第40个数为:"+a[40]);
	}
}