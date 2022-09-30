package seminar7;

public class Juice extends Product {

    private String taste;
    
    
    
    public void openProduct(){
        System.out.println("Отрываем и распечатываем трубочку");
        System.out.println("Протыкаем трубочкой отверстие");
    }

    public String getTaste(){
        return taste;
    }
    public void setTaste(String taste) {
        this.taste = taste;
    }


    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Сок " + getName() + " cо вкусом " + taste + " по цене " + Float.toString(getCost());
    }
}
