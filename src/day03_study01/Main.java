package day03_study01;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("멍멍이", "말티즈");
        System.out.println("첫 번째 강아지 이름은? : " + dog.name);
        System.out.println("첫 번째 강아지 종은? : " + dog.breed);

        Dog dog1 = new Dog("초코","진돗개");
        System.out.println("두 번째 강아지 이름은? : " + dog1.name);
        System.out.println("두 번째 강아지 종은? : " + dog1.breed);


        Dog dog2 = new Dog("뭉치", "푸들");
        System.out.println("세 번째 강아지 이름은? : " + dog2.name );
        System.out.println("세 번째 강아지 종은? : " + dog2.breed);

    }
}
