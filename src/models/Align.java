package models;

public class Align extends Species {
    private String superPower;

    public Align(String name, int height, String superPower) {
        super(name, height);
        this.superPower = superPower;
    }
    public void useSuperPower(){
        System.out.println(this.getName() + " uses " + this.superPower);
    }

    public String getSuperPower() {
        return superPower;
    }

    public void setSuperPower(String superPower) {
        this.superPower = superPower;
    }
}
