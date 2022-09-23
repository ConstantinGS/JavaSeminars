import java.util.*;

public class Task2 {

        //Реализуйте структуру телефонной книги 
        // с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
    public static void main( String[] args ) {
       
        telDirectory ();
    }

    public static void telDirectory (){

        
        Map <String, String> tel = new HashMap<>();
        Map <String, Map> tD = new HashMap<>();

        tel.put("home", "8978994");
        tel.put("work", "98797489");
        tD.put("Ivan", tel);

        tel.put("home", "12341234");
        tel.put("work", "435621345");
        tD.put("Sergey", tel);

        for (String element : tD.keySet()) {
            System.out.println(element);
            Map <String, String> bufer = new HashMap<>();
            bufer = tD.get(element);
            for (String iterable_element : bufer.keySet()) {
                System.out.println(iterable_element);
                System.out.println(bufer.get(iterable_element));       
            }
        }
    }
}
