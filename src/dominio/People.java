package dominio;

public class People {
    private String name;
    private int age;
    
  public People(String name,int age){
    this.age=age;
    this.name= name;
  }

    public String getName() {
      return name;
    }
    public int getAge() {
      return age;
    }

    @Override
    public String toString() {
      return "People [name=" + name + ", age=" + age + "]";
    }

  
}