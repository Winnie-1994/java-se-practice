package szu.panda.inherit;

class Person2 {
  private String name;
  private String location;

  Person2(String name) {
    this.name = name;
    location = "beijing";
  }
  
  Person2(String name,String location) {
    this.name = name;
    this.location = location;
  }
  
  public String info() {
    return 
      "name: "+name+
      " location: "+location;
  }
}

class Teacher2 extends Person2 {
	private String capital;
	
	Teacher2(String name, String capital) {
		this(name, "beijing", capital);
	}
	
	Teacher2(String n, String l, String capital) {
		super(n, l);
		this.capital = capital;
	}
	
	public String info() {
		return super.info() + "capital：" + capital;
	} 
}

class Student2 extends Person2 {
    private String school;
    Student2(String name,
		String school) {
        this(name,"beijing", school);
    }
    Student2(String n,String l
	,String school) {
        super(n,l);
        this.school = school;
    }
    public String info() {
        return super.info()+
	  " school: "+school;
    }
}

public class TestTeacher {
    public static void main(String[] args) {
    	Person2 p1 = new Person2("A");
    	Person2 p2 = new Person2("B","shanghai");
        Student2 s1 = new Student2("C","S1");
        Student2 s2 = 
            new Student2("C","shanhai","S2");
        System.out.println(p1.info());
        System.out.println(p2.info());
        System.out.println(s1.info());
        System.out.println(s2.info());
        
        Teacher2 t1 = new Teacher2("D", "Professor");
        System.out.println(t1.info());
    }
}
