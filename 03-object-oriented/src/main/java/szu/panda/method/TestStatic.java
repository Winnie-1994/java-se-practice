package szu.panda.method;

/*
 * static成员变量只有一份，所有对象共享，保存在data区域。静态变量可用于同一类对象的计数
 * 成员变量在stack区域；new出来的变量在heap区域；代码在code区域
 * 静态方法不再是针对某个对象调用，所以不能访问非静态成员
 */
public class TestStatic {
	private static int sid = 0;
    private String name; 
    int id;
    TestStatic(String name) {
        this.name = name;  
        id = sid++;
    }
    public void info(){
        System.out.println
               ("My name is "+name+" No."+id);
    }
    public static void main(String arg[]){

    	TestStatic.sid = 100; // sid是TestStatic类的静态成员变量，不需要new对象即可调用
    	TestStatic mimi = new TestStatic("mimi");
        mimi.sid = 2000;
        TestStatic pipi = new TestStatic("pipi");
        mimi.info(); 
        pipi.info();
    }
}
