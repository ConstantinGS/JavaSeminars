package seminar6;

import java.util.*;

public class Sortirovka {

    public static Set sortByBrand(Set<Notebook> list_nb, String name ){
        Set <Notebook> new_list_nb = new HashSet<>();

        for (Notebook nb : list_nb) {
            if (nb.brand.equals(name)){
                new_list_nb.add(nb);
            }
        }
        return new_list_nb;
    }

    public static Set sortByColor(Set<Notebook> list_nb, String color){
        Set <Notebook> new_list_nb = new HashSet<>();
        
        for (Notebook nb : list_nb) {
            if (nb.color.equals(color)){
                new_list_nb.add(nb);
            }
        }
        return new_list_nb;
    }

    public static Set sortByPrice(Set<Notebook> list_nb, float low_price, float high_price){
        Set <Notebook> new_list_nb = new HashSet<>();
        
        for (Notebook nb : list_nb) {
            if (nb.price>=low_price && nb.price<=high_price){
                new_list_nb.add(nb);
            }
        }
        return new_list_nb;
    }

    public static Set sortByOzu(Set<Notebook> list_nb, int ozu){
        Set <Notebook> new_list_nb = new HashSet<>();
        
        for (Notebook nb : list_nb) {
            if (nb.ozu>=ozu){
                new_list_nb.add(nb);
            }
        }
        return new_list_nb;
    }

    public static Set sortByGame(Set<Notebook> list_nb,  String type){
        Set <Notebook> new_list_nb = new HashSet<>();
        
        for (Notebook nb : list_nb) {
            if (nb.for_games.equals(type)){
                new_list_nb.add(nb);
            }
        }
        return new_list_nb;
    }
    
}
