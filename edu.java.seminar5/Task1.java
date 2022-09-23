
import java.util.TreeMap;

public class Task1 {
    
    public static void main( String[] args ) {
        String stroka = "Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись";
        System.out.println(sortString(stroka));
    }

    public static String sortString (String string){
        String[] array = string.split(" ");

        TreeMap <Integer, String>  tMap = new TreeMap<>();
        for (String i : array) {

            if (tMap.containsKey(i.length())){
                String r = tMap.remove(i.length());
                tMap.put(i.length(), r+ ", " +i);
            }
            else tMap.put( i.length(), i );
            
        }
        System.out.println(tMap);

        String result_String = "";
        for (String i : tMap.values()) {
            result_String += " " + i; 
        }
        return result_String;
    }

}
