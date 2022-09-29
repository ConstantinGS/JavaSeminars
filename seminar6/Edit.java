package seminar6;

public class Edit {

    public static Notebook changeBrand(Notebook nb, String new_brand) {
        
        nb.brand = new_brand;
        return nb;
    }

    public static Notebook changeColor(Notebook nb, String new_color) {
        
        nb.color = new_color;
        return nb;
    }

    public static Notebook changePrice(Notebook nb, float new_price) {
        
        nb.price = new_price;
        return nb;
    }

    public static Notebook changeOzu(Notebook nb, int new_ozu) {
        
        nb.ozu = new_ozu;
        return nb;
    }

    public static Notebook changeGame(Notebook nb, String new_type) {
        
        nb.for_games = new_type;
        return nb;
    }
    
}
