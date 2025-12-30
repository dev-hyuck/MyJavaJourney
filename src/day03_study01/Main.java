package day03_study01;


public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("멍멍이", "말티즈");
        System.out.println("첫 번째 강아지 이름은? : " + dog.getName());
        System.out.println("첫 번째 강아지 종은? : " + dog.getBreed());
        dog.walk();


        Dog dog1 = new Dog("초코","진돗개");
        System.out.println("두 번째 강아지 이름은? : " + dog1.getName());
        System.out.println("두 번째 강아지 종은? : " + dog1.getBreed());


        Dog dog2 = new Dog("뭉치", "푸들");
        System.out.println("세 번째 강아지 이름은? : " + dog2.getName() );
        System.out.println("세 번째 강아지 종은? : " + dog2.getBreed());

    }
}
