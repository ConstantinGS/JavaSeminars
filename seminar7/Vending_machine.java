package  seminar7;

import java.util.*;

public class Vending_machine{

    private ArrayList <Product> products = new ArrayList();
    private ArrayList <Snack> snacks = new ArrayList();
    private ArrayList <Juice> juices = new ArrayList();
    private ArrayList <Water> waters = new ArrayList();
    private ArrayList <Candy_bar> candys = new ArrayList();
    

    public void putItem (Product item){

        products.add(item);
        switch(item.getType()){
            case("Candy_bar"):
            candys.add((Candy_bar) item);
            break;
            case("Juice"):
            juices.add((Juice)item);
            break;
            case("Snack"):
            snacks.add((Snack)item);
            break;
            case("Water"):
            waters.add((Water)item);
            break;
        }   
    }

    public Product getItem (int num_pos) {
        
        for (Product iterable_element : products) {
           
            if (iterable_element.getPosition()==num_pos) return iterable_element;
        }
        return null;
    }

    public Candy_bar getCandy(String name, String filling) {
        for (Candy_bar iterable_element : candys) {
            if (iterable_element.getName()==name && iterable_element.getFilling()==filling) return iterable_element;
        }
        return null;
    }

    public Juice getJuice(String name, String taste) {
        for (Juice iterable_element : juices) {
            if (iterable_element.getName()==name && iterable_element.getTaste()==taste) return iterable_element;
        }
        return null;
    }

    public Snack getSnack(String name, String typeSnack) {
        for (Snack iterable_element : snacks) {
            if (iterable_element.getName()==name && iterable_element.getTypeSnacks()==typeSnack) return iterable_element;
        }
        return null;
    }

    public Water getWater(String name, String carbon) {
        for (Water iterable_element : waters) {
            if (iterable_element.getName()==name && iterable_element.getCarbonated()==carbon) return iterable_element;
        }
        return null;
    }










    




    



}