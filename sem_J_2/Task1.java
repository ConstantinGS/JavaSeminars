package sem_J_2;

import java.io.FileWriter;
import java.util.logging.Logger;

// Напишите программу, записывающую 100 раз слово ”ТЕST” в файл. 
// Слова должны чередоваться по формату – четная итерация 
// большими буквами, нечетные – маленькими Пример: TESTtestTESTtestTEST… 

public class Task1 {

    public static void main( String[] args ) {
        Logger l = Logger.getAnonymousLogger();
        
        try(FileWriter writer = new FileWriter("sem_J_2/file.txt", false))
        {
            l.info("Запись началась");
            String word = "test";
            String result = "";
            for (int i = 0; i<100; i++){
                if (i%2==0){
                    result = result + word.toUpperCase();
                }
                else result = result + word;

            } 
            writer.write(result);
            writer.flush();
            writer.close();
            l.info("Готово");
            


        } 
        catch(Exception ex){
             
            l.warning("Ошибка");
        }
         

    }
}
    

