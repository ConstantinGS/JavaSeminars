package seminar7;

public class Snack extends Product {

    private String typeSnacks;

    public void openProduct(){
        System.out.println("Открыть пакет");
    }

    public String getTypeSnacks(){
        return typeSnacks;
    }
    public void setTypeSnacks(String typeSnacks) {
        this.typeSnacks = typeSnacks;
    }
    


    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return typeSnacks +" "+ getName() + " по цене " + Float.toString(getCost());
    }
}
