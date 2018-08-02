package szu.panda.frenquentlyUsedClass;

public class TestString {
	public static void main(String[] args) {
		
		//输出字符串中的大写字母、小写字母、其他字符的个数
		String s = "AaaaABBBBcc&^%adfsfdCCOOkk99876 _haHA";
		int lCount = 0, uCount = 0, oCount = 0;
		
		//方法一：
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c >= 'a' && c <= 'z') {
				lCount ++;
			} else if (c >='A' && c <= 'Z') {
				uCount ++;
			} else {
				oCount ++;
			}
		}
		
		/*
		//方法二：
		String sL = "abcdefghijklmnopqrstuvwxyz";
		String sU = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(sL.indexOf(c) != -1) {
				lCount ++;
			} else if (sU.indexOf(c) != -1) {
				uCount ++;
			} else {
				oCount ++;
			}
		}
		*/
		
		
		/*
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(Character.isLowerCase(c)) {
				lCount ++;
			} else if (Character.isUpperCase(c)) {
				uCount ++;
			} else {
				oCount ++;
			}
		}
		*/
		System.out.println(lCount + " " + uCount + " " + oCount);
		
		
		//输出一个字符串中，指定字符串出现的次数
		String s1 = "sunjavahpjavaokjavajjavahahajavajavagoodjava";
		
		String sToFind = "java";
		int count = 0;
		int index = -1;
		
		while((index = s1.indexOf(sToFind)) != -1) {
			s1 = s1.substring(index + sToFind.length());
			count ++;
		}
		
		System.out.println(count);

	}
}