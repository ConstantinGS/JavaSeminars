package sem_j_3;

import java.util.ArrayList;
import java.util.*;

public class del_odd_numbers {


    public static void main( String[] args ) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(13, 14, 6, 7, 8, 9, 12, 2, 1));
        Iterator<Integer> iterator_numbers = numbers.iterator();

        while(iterator_numbers.hasNext()){
            Integer nextNumber = iterator_numbers.next();
            if (nextNumber%2==0){
                iterator_numbers.remove();
            }
        }
        System.out.println(numbers);

    }


    
}
