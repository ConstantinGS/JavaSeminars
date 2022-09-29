package seminar6;
import java.util.*;
public class Main {

    public static void main( String[] args ) { 
        
    Set <Notebook> set_notebooks = new HashSet<>();
    Scanner sc = new Scanner(System.in);


    System.out.println("Добавить единицу?");
    String add = sc.next();

    while(add.equals("Yes")){

        Notebook nb = Input.createNotebook();
        set_notebooks.add(nb);

        System.out.println("Добавить единицу?");
        add = sc.next();
    }

    System.out.println("Поиск (1 - по бренду, 2 - по цвету, 3 - по цене)");
    System.out.println("(4 - по ОЗУ, 5 - игровой/неигровой, 6 - вывести все)");


    int sort = sc.nextInt();
    Set <Notebook> new_set_notebooks =  new HashSet<>();
    switch(sort) {
        

        case(1):
        System.out.println("Введите название бренда:");
        String br = sc.next();
        new_set_notebooks = Sortirovka.sortByBrand(set_notebooks, br);

        for (Notebook notebook : new_set_notebooks ) {
            System.out.println(notebook.brand);
            System.out.println(notebook.color);
            System.out.println(notebook.price);
            System.out.println(notebook.ozu);
            System.out.println(notebook.for_games);
            System.out.println("");    
        }
        break;

        case(2):
        System.out.println("Введите цвет:");
        String clr = sc.next();
        new_set_notebooks = Sortirovka.sortByColor(set_notebooks, clr);

        for (Notebook notebook : new_set_notebooks ) {
            System.out.println(notebook.brand);
            System.out.println(notebook.color);
            System.out.println(notebook.price);
            System.out.println(notebook.ozu);
            System.out.println(notebook.for_games);
            System.out.println("");    
        }
        break;
        case(3):
        System.out.println("Введите минимальную цену:");
        Float lp = sc.nextFloat();
        System.out.println("Введите максимальную цену:");
        Float hp = sc.nextFloat();

        new_set_notebooks = Sortirovka.sortByPrice(set_notebooks, lp, hp);

        for (Notebook notebook : new_set_notebooks ) {
            System.out.println(notebook.brand);
            System.out.println(notebook.color);
            System.out.println(notebook.price);
            System.out.println(notebook.ozu);
            System.out.println(notebook.for_games);
            System.out.println("");    
        }
        break;
        case(4):
        System.out.println("Введите требуемое ОЗУ:");
        int ozu = sc.nextInt();
        

        new_set_notebooks = Sortirovka.sortByOzu(set_notebooks, ozu);

        for (Notebook notebook : new_set_notebooks ) {
            System.out.println(notebook.brand);
            System.out.println(notebook.color);
            System.out.println(notebook.price);
            System.out.println(notebook.ozu);
            System.out.println(notebook.for_games);
            System.out.println("");    
        }
        break;
        case(5):
        System.out.println("Введите тип ноутбука:");
        String type = sc.next();
        

        new_set_notebooks = Sortirovka.sortByGame(set_notebooks, type);

        for (Notebook notebook : new_set_notebooks ) {
            System.out.println(notebook.brand);
            System.out.println(notebook.color);
            System.out.println(notebook.price);
            System.out.println(notebook.ozu);
            System.out.println(notebook.for_games);
            System.out.println("");    
        }
        
        break;
        case(6):

        for (Notebook notebook : set_notebooks ) {
            System.out.println(notebook.brand);
            System.out.println(notebook.color);
            System.out.println(notebook.price);
            System.out.println(notebook.ozu);
            System.out.println(notebook.for_games);
            System.out.println("");    
        }
        System.out.println("");
        break;
    }


    
    

    }
    
}
