package University;
public class Student
{
  public String name;
  String id;
  private int age;
  protected double cgpa;
  
  public Student(String nm, String i){
    name=nm;
    id =i;
  }
  public void showDetail(){
    System.out.println("Name : "+name);
    System.out.println("Id : "+id);
    System.out.println("Age : "+age);
    System.out.println("Cgpa : "+cgpa);
  }
}
    