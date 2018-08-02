package szu.panda.frenquentlyUsedClass;

/*
 * 基础数据类型包装类（分配在堆空间）：包装类（如Integer、Double、Boolean、Character等）这些类封装了一个基本数据类型数字，并为其提供了一系列操作
 * 以java.lang.Integer类为例，构造方法：
 * Integer(int value)、Integer(String s)
 * 
 * 数与数之间的转换，可使用内部的方法 
 */
public class ArrayParser {
	//返回double类型的二维数组，数组中的元素通过解析字符串参数获得
	public static void main(String[] args) {
		double[][] d;
		String s = "1,2;3,4,5;6,7,8";
		String[] sFirst = s.split(";");
		d = new double[sFirst.length][];
		for(int i=0; i<sFirst.length; i++) {
			String[] sSecond = sFirst[i].split(",");
			d[i] = new double[sSecond.length];
			for(int j=0; j<sSecond.length; j++) {
				
				d[i][j] = Double.parseDouble(sSecond[j]);
				
			}
		}
		
		for(int i=0; i<d.length; i++) {
			for(int j=0; j<d[i].length; j++) {
				System.out.print(d[i][j] + " ");
			}
			System.out.println();
		}
	}
}