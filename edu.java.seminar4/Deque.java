

public class Deque {

    
    public static void main( String[] args ) {
        int[] array = {10, 4, 6, 7};
        
        System.out.println("offerLast");
        offerLast(array, 5);
        System.out.println("");
        System.out.println("");
        System.out.println("offerFirst");
        offerFirst(array, 5);
        System.out.println("");
        System.out.println("");
        System.out.println("peekLast");
        System.out.println(peekLast(array));
        System.out.println("");
        System.out.println("peekFirst");
        System.out.println(peekFirst(array));
        System.out.println("");
        System.out.println("pollLast");
        System.out.println(pollLast(array));
        System.out.println("");
        System.out.println("pollFirst");
        System.out.println(pollFirst(array));


    }



     public static boolean offerFirst(int[] array, int element) {
        int[] que = new int[5];

        if (array.length>=que.length) return false;

        int count = 0;
        que[count] = element;
        while (count < array.length){
            que[count+1] = array[count];
            count++;
        }

        for(int i=0; i<que.length; i++){
            System.out.print(que[i]+" ");
        }
        return true;


     }

     public static boolean offerLast(int[] array, int element) {
        int[] que = new int[5];

        if (array.length>=que.length) return false;

        int count = 0;
        que[que.length-1] = element;
        while (count < array.length){
            que[count] = array[count];
            count++;
        }

        for(int i=0; i<que.length; i++){
            System.out.print(que[i]+" ");
        }

        return true;
     }
    


     public static Integer peekFirst(int[] array){
        if (array.length == 0) return null;
        for(int i=0; i<array.length; i++){
         System.out.print(array[i]+" ");
     }
         System.out.println(" ");
        return array[0];
     }



     public static Integer peekLast(int[] array){
        if (array.length == 0) return null;
        for(int i=0; i<array.length; i++){
         System.out.print(array[i]+" ");
     }
        System.out.println(" ");
        return array[array.length-1];
     }



     public static Integer pollFirst(int[] array){
        if (array.length == 0) return null;
        int[] new_array = new int[array.length-1];
        for(int i = 1; i<array.length; i++){
         new_array[i-1] = array[i];
        }
        for(int i=0; i<new_array.length; i++){
         System.out.print(new_array[i]+" ");
     }
        System.out.println(" ");
        return array[0];
     }




     public static Integer pollLast(int[] array){
        if (array.length == 0) return null;
        int[] new_array = new int[array.length-1];
        for(int i = 0; i<array.length-1; i++){
         new_array[i] = array[i];
        }

        for(int i=0; i<new_array.length; i++){
         System.out.print(new_array[i]+" ");
     }
        System.out.println(" ");
        return array[array.length-1];
     }



    }
