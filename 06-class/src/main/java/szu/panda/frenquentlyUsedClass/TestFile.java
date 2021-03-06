package szu.panda.frenquentlyUsedClass;
import java.io.*;

//在API文档中查看file类常用方法 
public class TestFile {
  public static void main(String[] args) {
    String separator = File.separator; //斜杠
    String filename = "myfile.txt";
    String directory = "mydir1" + separator + "mydir2";
    //String directory = "mydir1/mydir2"; //windows中是正斜杠
    //String directory = "mydir1\\mydir2"; //linux中是反斜杠
    File f = new File(directory, filename);
    if (f.exists()) {
      System.out.println("文件名：" + f.getAbsolutePath());
      System.out.println("文件大小：" + f.length());
    } else {
      f.getParentFile().mkdirs(); //class文件的父路径下创建，在class最上层的包的路径下创建 
      try {
        f.createNewFile();
      } catch (IOException e) {
       e.printStackTrace();
      }
    }
  }
}