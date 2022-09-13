package sem_j_3;

import java.util.ArrayList;
import java.util.*;

public class sortirovka {


    public static void main( String[] args ) {


        int[] array_numbers = {13, 14, 6, 7, 8, 9, 12, 2, 1};
        sortirovka(array_numbers);
        for (int i=0; i<array_numbers.length; i++){
            System.out.print(array_numbers[i]+" ");
        }

    }

    public static void sortirovka(int[] num) {
        if (num.length<2) return ;
        else {
            int half = num.length/2;
            int[] first = new int[half];
            int[] second = new int[num.length-half];

            for (int i=0; i<half; i++){
                first[i] = num[i];
            }
            for (int i=half; i<num.length; i++){
                second[i-half] = num[i];
            }

            sortirovka(first);
            sortirovka(second);
            merge(num, first, second);
            

        }

    }

    public static void merge(int[] array, int[] first_half, int[] second_half ) {

        int count1 = 0;
        int count2 = 0;
        int i = 0;

        while(count1<first_half.length && count2<second_half.length)
        {
            if(first_half[count1]<second_half[count2]){
                array[i] = first_half[count1];
                count1++;
            }
            else{
                array[i] = second_half[count2];
                count2++;
            }
            i++;
        }

        for (int j=count1; j<first_half.length; j++){
            array[i++]=first_half[j];
        }
        for (int j=count2; j<second_half.length; j++){
            array[i++]=second_half[j];
        }


    }

        


    
}
