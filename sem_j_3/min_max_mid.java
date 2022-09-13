package sem_j_3;

import java.util.ArrayList;
import java.util.*;

public class min_max_mid {


    public static void main( String[] args ) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(13, 14, 6, 7, 8, 9, 12, 2, 1));
        Iterator<Integer> iterator_numbers = numbers.iterator();

        numbers.sort(Comparator.naturalOrder());
        
        Integer sum = 0;
        for (Integer item : numbers) {
            sum = sum + item;
        }

        System.out.println("Minimum:");
        System.out.println(numbers.get(0));
        System.out.println("Maximum:");
        System.out.println(numbers.get(numbers.size()-1));
        System.out.println("Srednee:");
        System.out.println(sum/numbers.size());

    }


    
}
