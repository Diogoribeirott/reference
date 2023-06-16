import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import dominio.ComparetoPeople;
import dominio.People;

public class App {
    public static void main(String[] args) throws Exception {
     
       List<People> listPeople = new ArrayList<>();
       listPeople.add(new People("Diogo",22));
       listPeople.add(new People("Mariany",19));
       listPeople.add(new People("Camila",29));
        
        listPeople.sort(ComparetoPeople::comparetoByname);


        System.out.println(listPeople);


        listPeople.sort(ComparetoPeople::comparetoByAge);

        System.out.println(listPeople);
    }
}
