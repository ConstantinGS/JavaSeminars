package seminar7;

public class Candy_bar extends Product {

    private String filling;

    public void openProduct(){
        System.out.println("Надорвать упаковку");
        System.out.println("Вытянуть батончик");
    }



    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Батончик " + getName() + " c " + filling + " по цене " + Float.toString(getCost());
    }

    public String getFilling(){
        return filling;
    }
    public void setFilling(String filling) {
        this.filling = filling;
    }



    
}
