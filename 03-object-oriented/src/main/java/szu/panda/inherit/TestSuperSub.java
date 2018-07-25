package szu.panda.inherit;

/*
 * 子类的构造过程中必须调用其积累的构造方法
 * 子类可在自己的构造方法中使用super（argument_list）调用基类的构造方法
 * 可使用this（argument_list）调用本类的另外的构造方法
 * 若调用super，必须写在子类构造方法的第一行
 * 若子类构造方法中没有显式调用基类构造方法，系统默认调用基类无参数的构造方法。 
 */
class SuperClass {
    private int n;
  	
  	
    SuperClass() {
        System.out.println("SuperClass()");
    }
    
    
  
    SuperClass(int n) {
        System.out.println("SuperClass(" + n + ")");
        this.n = n;
    }
}

class SubClass extends SuperClass {
    private int n;
    
    SubClass(int n) {
    		//super(); 利用super调用基类的构造方法
        System.out.println("SubClass(" + n + ")");
        this.n = n;
    }
    
    SubClass() {
    		super(300);
        System.out.println("SubClass()");
    }
}

public class TestSuperSub {
    public static void main(String arg[]) {
        SubClass sc1 = new SubClass(); //调用SubClass的构造方法，必须先调用父类的构造方法
        SubClass sc2 = new SubClass(400); // 子类构造方法没有显示地调用父类构造方法时，系统默认调用父类 没有写参数的构造方法
    }
}

