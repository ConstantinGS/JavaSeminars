
public class Task3 {

    public static void main( String[] args ) {
       
        int[] array = new int[] {103, 15, 226, 72, 1, 13, 11, 20, 33};
        int[] new_array = heapsort(array);

        for (int i=0; i<new_array.length; i++){
            System.out.print(new_array[i]+" ");
        }
    }

    public static void heap(int[] array, int len, int par){

            int max = par;
            int child1 = 2*par+1;
            int child2 = 2*par+2;


            if (child1<len && array[child1]>array[max]) max = child1;
            if (child2<len && array[child2]>array[max]) max = child2;

            if (max!=par){
                int temp = array[par];
                array[par] = array[max];
                array[max] = temp;
                heap(array, len, max);

            }

        }

        public static int[] heapsort(int[] array){

            int arLen = array.length;
            for (int i = arLen/2-1; i>=0; i--) heap(array, arLen, i);
                
            for(int i = arLen-1; i>=0; i--){
                int temp = array[0];
                array[0] = array[i];
                array[i] = temp;
                heap(array, i, 0);
            }

            return array;
            

        }





    


    
}
