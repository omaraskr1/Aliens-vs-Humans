package models;

public class Species {
    private String name;
    private int height;
    private Boolean isActive;

    public Species(String name, int height) {
        this.name = name;
        this.height = height;
        this.isActive = true;
    }
    public void sleep(int hours){
        System.out.println(this.getName() + " is sleeping for " + hours + " hours");
    }
    public void eat(String food){
        System.out.println(this.getName() + " is eating " + food);
    }
    public void die(){
        System.out.println(this.getName() + " is dead");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }
}
