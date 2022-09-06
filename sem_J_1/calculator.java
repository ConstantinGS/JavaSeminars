
import java.util.Scanner;

public class calculator {

    public static void main( String[] args ) {

        
        
        Scanner iScanner = new Scanner(System.in, "cp866");
        
        
            boolean merker = false;
            

            while (merker!=true){ 
                System.out.println("Калькулятор");
                System.out.println("Введите первое число");
                String firstNumber = iScanner.nextLine();
                int fNumber = Integer.parseInt(firstNumber);
                System.out.println("Введите второе число");
                String secondNumber = iScanner.nextLine();
                int sNumber = Integer.parseInt(secondNumber);
                System.out.println("Введите желаемую операцию");
                String operation = iScanner.nextLine();

                switch(operation) {
                    case("+"):
                        System.out.println("Результат:" + (fNumber+sNumber));
                        break;
                    case("-"):
                        System.out.println("Результат:" + (fNumber-sNumber));
                        break;
                    case("*"):
                        System.out.println("Результат:" + (fNumber*sNumber));
                        break;
                    case("/"):
                        System.out.println("Результат:" + (fNumber/sNumber));
                        break;

                }

                System.out.println("Желаете продолжить?");
                boolean merker2 = true;
                while(merker2){
                    String cont = iScanner.nextLine();
                    if (cont.toLowerCase().equals("нет")) 
                    {
                        merker = true;
                        merker2 = false;
                    }
                    else if (cont.toLowerCase().equals("да")){
                        merker = false;
                        merker2 = false; 
                    }
                    else System.out.println("Введите корректный ответ:");

                }
                
                
        }


}}