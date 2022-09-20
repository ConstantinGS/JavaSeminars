public class Skobki {
    public static void main( String[] args ) {
        // 2*)Дана строка содержащая последовательность логически верно открывающихся и
        //  закрывающихся скобок. Требуется написать метод, удаляющий крайние скобки и 
        //  выводящий при этом логически правильное выражение.
        // Пример 1:Ввод: s = "(()())(())" Вывод: "()()()”
        // Пример 2: Ввод: s = "()()" Вывод: ""

        String s1 = "(()())(())";
        String s2 = "()()";

        System.out.println(bracket(s2));



    }
    public static String bracket(String stroka){
        int count1 = 0;
        int count2 = 0;
        String new_stroka = stroka.substring(1, stroka.length());
        String result = "";
        String new_result = "";
        boolean merker = true;

        for (int i=0; i<new_stroka.length(); i++){
            if (new_stroka.charAt(i)==')') count1++;
            else if (new_stroka.charAt(i)=='(') count2++;

            if (merker && count1<=count2){
                result+=new_stroka.charAt(i);
            }
        }
        count1=0;
        count2=0;

        for (int i=result.length()-1; i>=0; i--){
            if (result.charAt(i)==')') count1++;
            else if (result.charAt(i)=='(') count2++;

            if (merker && count1>=count2){
                new_result=result.charAt(i)+new_result;
            }
            else if (merker && count1<count2) {
                merker = false;
            }
            else new_result=result.charAt(i)+new_result;

        }
       
        
        return new_result;
    }





    
}
