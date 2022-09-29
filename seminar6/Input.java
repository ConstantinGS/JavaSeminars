package seminar6;

import java.util.*;

public class Input {

    public static Notebook createNotebook(){

        Scanner input = new Scanner(System.in);
    
        System.out.println("Введите название производителя:");
        String brand = input.nextLine();
        System.out.println("Введите цвет:");
        String color = input.nextLine();
        System.out.println("Введите цену:");
        float price = input.nextFloat();
        System.out.println("Введите ОЗУ:");
        int ozu = input.nextInt();
        System.out.println("Введите тип:");
        String type = input.next();

        Notebook nb = new Notebook(brand, color, price, ozu, type);

        return nb;
    }

    

    public Notebook changeNotebook(Notebook nb){

        
        Scanner input = new Scanner(System.in);
        System.out.println("Что вы хотите изменить?(1 - марка, 2 - цвет, 3 - цена, 4 - ОЗУ, 5 - тип):");
        int change = input.nextInt();
        
        switch(change) {
            case (1):
            System.out.println("Введите название производителя:");
            String brand = input.nextLine();
            nb = Edit.changeBrand(nb, brand);
            break;

            case (2):
            System.out.println("Введите цвет:");
            String color = input.nextLine();
            nb = Edit.changeColor(nb, color);
            break;

            case (3):
            System.out.println("Введите цену:");
            float price = input.nextFloat();
            nb = Edit.changePrice(nb, price);
            break;

            case (4):
            System.out.println("Введите ОЗУ:");
            int ozu = input.nextInt();
            nb = Edit.changeOzu(nb, ozu);
            break;

            case (5):
            System.out.println("Введите тип:");
            String type = input.next();
            nb = Edit.changeGame(nb, type);
            break;
        }

        return nb;
    }




    

    
}
