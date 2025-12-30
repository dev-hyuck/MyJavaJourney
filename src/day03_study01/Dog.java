package day03_study01;


public class Dog {

    private final String name;
    private final String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;

    }

    public void walk() {
        System.out.println("강아지가 걷는다.");
    }

    public void eat() {
        System.out.println("강아지가 먹는다.");
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }


}
