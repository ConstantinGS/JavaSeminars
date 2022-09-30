package seminar7;
import java.util.*;

public class Main {
    public static void main( String[] args ) {
    
        Vending_machine automat = new Vending_machine();

        Candy_bar candy = new Candy_bar();
        candy.setAll("Snickers", "Candy", 10, 1, 1);
        candy.setFilling("peanut");

        Juice juice = new Juice();
        juice.setAll("J7", "Juice", 20, 2, 3);
        juice.setTaste("Apple");

        Snack snack = new Snack();
        snack.setAll("Lays", "Snack", 30, 3, 2);
        snack.setTypeSnacks("chips");

        Water water = new Water();
        Water water2 = new Water();
        water.setAll("Bonaqua", "Water", 30, 4, 2);
        water.setCarbonated("not carbonated");
        water2.setAll("Bonaqua", "Water", 30, 5, 2);
        water2.setCarbonated("carbonated");


        automat.putItem(candy);
        automat.putItem(juice);
        automat.putItem(snack);
        automat.putItem(water);
        automat.putItem(water2);

        System.out.println(automat.getItem(2));
        System.out.println(automat.getWater("Bonaqua", "not carbonated"));
    
        
    }
    
}
