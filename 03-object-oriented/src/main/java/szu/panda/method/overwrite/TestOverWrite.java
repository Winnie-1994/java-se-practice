package szu.panda.method.overwrite;

/*
 * 重写方法必须和被重写方法名具有相同的方法名称、参数和返回类型
 * 重写的方法不能使用比被重写的方法更严格的访问权限
 */
class Person {
    private String name;
    private int age;
    public void setName(String name){this.name=name;}
    public void setAge(int age) {this.age=age;}
    public String getName(){return name;}
    public int getAge(){return age;}
    public String getInfo() {
          return "Name: "+ name + "\n" +"age: "+ age;
  }
}

class Student extends Person {
    private String school;
    public String getSchool() {return school;}
    public void setSchool(String school)
    {this.school =school;}
    public String getInfo() {
      return  "Name: "+ getName() + "\nage: "+ getAge() 
                    + "\nschool: "+ school;
		}
}

public class TestOverWrite {
public static void main(String arg[]){
        Student student = new Student();
        Person person = new Person();
        person.setName("none");
        person.setAge(1000);
        student.setName("John");    
        student.setAge(18);
        student.setSchool("SCH");
        System.out.println(person.getInfo());
        System.out.println(student.getInfo());
    }
}
