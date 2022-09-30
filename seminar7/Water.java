package seminar7;

public class Water extends Product {

    private float volume;
    private String carbonated;

    public void openProduct(){
        System.out.println("Открутить крышку");
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Вода " + getName()+" "+ carbonated + " по цене " + Float.toString(getCost());
    }

    public float getVolume(){
        return volume;
    }
    public void setVolume(float volume) {
        this.volume = volume;
    }

    public String getCarbonated(){
        return carbonated;
    }
    public void setCarbonated(String carbonated) {
        this.carbonated = carbonated;
    }




    
}
