package seminar7;

import java.lang.reflect.Type;

public abstract class Product { 

    private String type;
    private String name;
    private int position;
    private float weight;
    private float cost;
    
    

    
    public abstract void openProduct();


    
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public float getWeight(){
        return weight;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getCost(){
        return cost;
    }
    public void setCost(float cost) {
        this.cost = cost;
    }

    public String getType(){
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public int getPosition(){
        return position;
    }
    public void setPosition(int position) {
        this.position = position;
    }


    public void setAll(String name, String type,  float cost) {
        this.name = name;
        this.type = type;
        this.cost = cost;
    }
    public void setAll(String name, String type,  float cost, int position, float weight ) {
        this.name = name;
        this.type = type;
        this.cost = cost;
        this.position = position;
        this.weight = weight;
    }

    public void setAll(String name, String type,  float cost, int position ) {
        this.name = name;
        this.type = type;
        this.cost = cost;
        this.position = position;
    }

    








}