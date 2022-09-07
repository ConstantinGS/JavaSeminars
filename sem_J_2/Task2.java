package sem_J_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.logging.Logger;

// Задание 2
// Напишите программу, которая считает, распарсит и выведет в логгер заранее 
// созданный файл с именами, предметами и оценками студентов
// Формат строк в файле:
// Андрей 5
// Алена 5
// Игорь 4
// Формат вывода: Ученик %s получил сегодня %d.

public class Task2 {

    public static void main( String[] args ) {
        Logger l = Logger.getAnonymousLogger();

        try(BufferedReader reader = new BufferedReader(new FileReader("sem_J_2/File2.txt")))
        {
            
            String str;
            String[] str_array = new String[2];
            String form = " Ученик %s получил сегодня %s.";
            String result  = "";

            
            while((str = reader.readLine())!=null)
            {
                str_array = str.split(" ");
                if (str_array.length >1){
                result = result + (String.format(form, str_array[0],str_array[1] ) + "\n");
                }
                else {
                    result = result + (" по предмету " + str_array[0] + "\n");
                    }
                
            }
            l.info("\n" +result); 



        }
        catch(Exception ex){
             
            l.warning("Ошибка");
        }



    }

}