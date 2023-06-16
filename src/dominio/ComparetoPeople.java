package dominio;

public class ComparetoPeople {

public static int comparetoByname(People a1, People a2){
  return a1.getName().compareTo(a2.getName());

}

public static int comparetoByAge(People a1,People a2){
  return Integer.compare(a1.getAge(),a2.getAge());

}
    
}