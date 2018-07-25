package szu.panda.polymorph;

/*
 * 动态绑定/多态/迟绑定：可扩展性达到最好
 * 执行期间（而非编译期间）判断所引用对象的实际类型，根据其实际类型调用相应的方法
 * 多态的三个必要条件：
 * 1.要有继承
 * 2.要有重写
 * 3.父类引用指向子类对象
 * 
 * abstract抽象方法，相当于C++中的纯虚函数。
 */
abstract class Animal {
  private String name;
  Animal(String name) {this.name = name;}
  /*
  public void enjoy(){
    System.out.println("叫声......");
  }
  */
  public abstract void enjoy(); //抽象方法必须被重写，不重写会报错。子类会对此方法进行重写，父类的此方法只需声明，不需实现。
}

abstract class Cat extends Animal { //抽象类，不能用来定义对象，抽象类必须被继承
  private String eyesColor;
  Cat(String n,String c) {super(n); eyesColor = c;}
  /*
  public void enjoy() {
    System.out.println("猫叫声......");
  }
  */
  //public abstract void enjoy();
}

class Dog extends Animal {
  private String furColor;
  Dog(String n,String c) {super(n); furColor = c;}
 
  public void enjoy() {
    System.out.println("狗叫声......");
  }
}

class Bird extends Animal {
	 Bird() {
	 	 super("bird");
	 }
	 public void enjoy() {
    System.out.println("鸟叫声......");
  }
}

class Lady {
    private String name;
    private Animal pet; //定义animal类型最灵活
    Lady(String name,Animal pet) {
        this.name = name; this.pet = pet;
    }
    public void myPetEnjoy(){pet.enjoy();}
}

public class Test {
    public static void main(String args[]){
       // Cat c = new Cat("catname","blue");
        Dog d = new Dog("dogname","black");
        Bird b = new Bird();
        //Lady l1 = new Lady("l1",c);
        Lady l2 = new Lady("l2",d);
        Lady l3 = new Lady("l3",b);
        //l1.myPetEnjoy();
        l2.myPetEnjoy();
        l3.myPetEnjoy();
    }
}
