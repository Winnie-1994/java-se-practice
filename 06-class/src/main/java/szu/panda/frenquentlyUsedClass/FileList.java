package szu.panda.frenquentlyUsedClass;

import java.io.File; //代表系统文件名（路径和文件名）

//在命令行中以梳妆结构展现特定的文件夹及其子文件（夹）：使用递归方法
public class FileList {
	public static void main(String[] args) {
		File f = new File("d:/A");
		System.out.println(f.getName());
		tree(f, 1);
	}
	
	private static void tree(File f, int level) {
		
		String preStr = "";
		for(int i=0; i<level; i++) {
			preStr += "    ";
		}
		
		File[] childs = f.listFiles(); //列出当前目录下的孩子们，返回值为file类型的数组
		for(int i=0; i<childs.length; i++) {
			System.out.println(preStr + childs[i].getName());
			if(childs[i].isDirectory()) {  //如果是目录
				tree(childs[i], level + 1);
			}
		}
	}
	
}