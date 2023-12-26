package models;

public class Human extends Species {
    private String sex;

    public Human(String name, int height, String sex) {
        super(name, height);
        this.sex = sex;
    }

    public void speack(String sentence) {
        System.out.println(this.getName() + " says: " + sentence);
    }
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
